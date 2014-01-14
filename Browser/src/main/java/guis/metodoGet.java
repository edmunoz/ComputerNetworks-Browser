package guis;

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

public class metodoGet{
    public String line="";
    public String html="";
    public String cookie="";
        
   public String getHtml(String direccion) {

      Socket smtpSocket = null;
      OutputStream os = null;
      InputStream is = null;
      String host = direccion;

      try {
         // Crea socket con host y puerto 80
         smtpSocket = new Socket(host, 80);

         // obtiene los canales
         os = smtpSocket.getOutputStream();
         is = smtpSocket.getInputStream();

      } catch (Exception e) {
         
      }

      // mira si fue creado el socket
      if (smtpSocket != null && os != null && is != null) {
         try {

            // define el protocolo de aplicacion - HTTP
	            Writer writer = new OutputStreamWriter(smtpSocket.getOutputStream(), "ISO-8859-1");
	            writer.write("GET / HTTP/1.1\n");
	            writer.write("Host: " + host + "\n");
	            writer.write("Connection: Keep-Alive\n");
	            writer.write("User-Agent: Mozilla/5.0 (Windows; U; Windows NT 5.1; pt-BR; rv:1.8.1.14) Gecko/20080404 Firefox/2.0.0.14\n\n");
	            writer.flush();
	
	            // Prepara la lectura de la pagina
	            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "ISO-8859-1"));
	
	            // Va leyendo cada linea del response
	            line = reader.readLine();
	   
	            while (reader.ready()) { // para cuando ya no se está recibiendo nada
	                line = reader.readLine();
	                html += line+"\n";
	                if(line.startsWith("Set-Cookie:")){
	                    cookie = cookie+line+"\n";
	                    writeCookie(host,cookie);
	                }
            }
             
            
            // cierra los canales
            os.close();
            is.close();
            smtpSocket.close();

         } catch (Exception e) {}
      }
     
   return html;
   
   }

   public void writeCookie(String host, String cookie){
        File f;
        f = new File(host+".cookie");
         //Escritura
        try{
        FileWriter w = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(w);
        PrintWriter wr = new PrintWriter(bw);  
        wr.write(cookie);//escribimos en el archivo de las cookies
        wr.close();
        bw.close();
        }catch(IOException e){}
         }

    public void savePage(String host, String html){
        File f;
        f = new File(host+".html");
         //Escritura 
        try{
	        FileWriter w = new FileWriter(f);
	        BufferedWriter bw = new BufferedWriter(w);
	        PrintWriter wr = new PrintWriter(bw);  
	        wr.write(html);//escribimos en el archivo html
	        wr.close();
	        bw.close();
        }catch(IOException e){}
     }
  }