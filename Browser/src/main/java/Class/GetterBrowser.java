package Class;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Mite
 * @author Esteban Muñoz
 */
public class GetterBrowser{
    public String line="";
    public String html="";
    public String cookie="";
        
/**
 * 
 * @param address
 */
   public String getHtml(String address) {

      Socket smtpSocket = null;
      OutputStream os = null;
      InputStream is = null;
      String host = address;

      try {
         // Create socket to host on port 80
         smtpSocket = new Socket(host, 80);

         // Get the channels
         os = smtpSocket.getOutputStream();
         is = smtpSocket.getInputStream();

      } catch (IOException e) {
          JOptionPane.showMessageDialog(null, e.getMessage(), "Browser", JOptionPane.ERROR_MESSAGE);         
      }

      // See if the socket was created
      if (smtpSocket != null && os != null && is != null) {
         try {

            // Defines the application protocol - HTTP.
	            Writer writer = new OutputStreamWriter(smtpSocket.getOutputStream(), "ISO-8859-1");
	            writer.write("GET / HTTP/1.1\n");
	            writer.write("Host: " + host + "\n");
	            writer.write("Connection: Keep-Alive\n");
	            writer.write("User-Agent: Mozilla/5.0 (Windows; U; Windows NT 5.1; pt-BR; rv:1.8.1.14) Gecko/20080404 Firefox/2.0.0.14\n\n");
	            writer.flush();
	
	            // Prepare reading page.
	            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "ISO-8859-1"));
	
	            // It reads each line of the response.
	            line = reader.readLine();
	   
	            while (reader.ready()) { // For when it is not receiving anything.
	                line = reader.readLine();
	                html += line+"\n";
	                if(line.startsWith("Set-Cookie:")){
	                    cookie = cookie+line+"\n";
	                    writeCookie(host,cookie);
	                }
            }
             
            
            // Closed channels.
            os.close();
            is.close();
            smtpSocket.close();

         } catch (IOException e) {
             JOptionPane.showMessageDialog(null, e.getMessage(), "Browser", JOptionPane.ERROR_MESSAGE);
         }
      }
     
   return html;
   
   }
   
   
   
/**
 * 
 * @param host
 * @param cookie
 */
   public void writeCookie(String host, String cookie){
        File f;
        f = new File(host+".cookie");
         // Writing.
        try{
        FileWriter w = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(w);
        PrintWriter wr = new PrintWriter(bw);  
        wr.write(cookie);// We write in the cookies file.
        wr.close();
        bw.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Browser", JOptionPane.ERROR_MESSAGE);
        }
   }
         
/**
 * 
 * @param host
 * @param html
 */
    public void savePage(String host, String html){
        File f;
        f = new File(host+".html");
         // Writing.
        try{
	        FileWriter w = new FileWriter(f);
	        BufferedWriter bw = new BufferedWriter(w);
	        PrintWriter wr = new PrintWriter(bw);  
	        wr.write(html);// We write in the html file.
	        wr.close();
	        bw.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Browser", JOptionPane.ERROR_MESSAGE);
        }
     }
  }