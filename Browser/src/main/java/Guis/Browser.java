/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Guis;

import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Class.BContainer;
import Class.GetterBrowser;


/**
 * @author Esteban Muñoz
 * @author Juan Mite
 */
@SuppressWarnings("serial")
public class Browser extends javax.swing.JFrame {
     
    
    //Used for the design of the interface
    private final ImageIcon ic1 = new ImageIcon("src/main/resources/images/back-icon.png");
    private final ImageIcon ic2 = new ImageIcon("src/main/resources/images/next-icon.png");
    private final ImageIcon ic3 = new ImageIcon("src/main/resources/images/home-icon.png");
    private final ImageIcon ic4 = new ImageIcon("src/main/resources/images/refresh-icon.png");
    private final ImageIcon ic5 = new ImageIcon("src/main/resources/images/search-icon.png");
    private final ImageIcon ic6 = new ImageIcon("src/main/resources/images/bullet-icon.png");
    private final ImageIcon imgIcon = new ImageIcon ("src/main/resources/images/browser.png");
    
    private GetterBrowser html;
    private String address,source, fuente, direccion;
     
   /**
     * Creates new form browser
     */
    public Browser() {
        
        BContainer contenedor = new BContainer("src/main/resources/images/fondo.jpg");
        setContentPane(contenedor);
        initComponents();
        
        this.setIconImage(imgIcon.getImage());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        txtUrl = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnBullet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jEditorPane1.setContentType(" \"txt/html;charset=UTF-8\""); // NOI18N
        jScrollPane1.setViewportView(jEditorPane1);

        jTabbedPane1.addTab("tab1", jScrollPane1);

        btnBack.setIcon(ic1);
        btnBack.setToolTipText("Back page");
        btnBack.setContentAreaFilled(false);
        btnBack.setName("bntBack"); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.setIcon(ic2);
        btnNext.setToolTipText("Next page");
        btnNext.setContentAreaFilled(false);
        btnNext.setName("btnNext"); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnHome.setIcon(ic3);
        btnHome.setToolTipText("Refresh");
        btnHome.setContentAreaFilled(false);
        btnHome.setName("btnRefresh"); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnRefresh.setIcon(ic4);
        btnRefresh.setToolTipText("Refresh page");
        btnRefresh.setContentAreaFilled(false);
        btnRefresh.setName("btnHome"); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        txtUrl.setFont(new java.awt.Font("Century Schoolbook L", 0, 24)); // NOI18N
        txtUrl.setToolTipText("Url...");

        btnSearch.setIcon(ic5);
        btnSearch.setToolTipText("Search");
        btnSearch.setContentAreaFilled(false);
        btnSearch.setName("btnSearch"); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnBullet.setIcon(ic6);
        btnBullet.setToolTipText("");
        btnBullet.setContentAreaFilled(false);
        btnBullet.setName("btnHome"); // NOI18N
        btnBullet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBulletActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUrl, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBullet, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUrl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBullet, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    LinkedList <String> Forward = new LinkedList<String>();
    LinkedList<String> Back = new LinkedList<String>();

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if(!Back.isEmpty()){
        	direccion=txtUrl.getText();
        	txtUrl.setText("");
            Forward.push(direccion);
            String direccionNueva=Back.pop();
            txtUrl.setText(direccionNueva);
            html = new GetterBrowser();
            source = html.getHtml(direccion);
            jEditorPane1.setText(source);
       }
       else JOptionPane.showMessageDialog(null,"¡No existen mas páginas visitadas!","¡Hey espera!",JOptionPane.INFORMATION_MESSAGE);
    
    	
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        	
         if(!Forward.isEmpty()){   
        	 	direccion=txtUrl.getText();
                Back.push(direccion);
                direccion=Forward.pop();
                txtUrl.setText(direccion);
                html = new GetterBrowser();
                source = html.getHtml(direccion);
                jEditorPane1.setText(source);
                Back.push(direccion);
        }
        else JOptionPane.showMessageDialog(null,"¡No existen mas páginas visitadas!","¡Hey espera!",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        direccion = "www.yahoo.com"; 
        txtUrl.setText(direccion);
        html = new GetterBrowser();
        source = html.getHtml(direccion);
        jEditorPane1.setText(source);
        Back.push(direccion);
    	
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    	 direccion = txtUrl.getText();
         jEditorPane1.setText("");
                 
         html = new GetterBrowser();
         fuente = html.getHtml(direccion);
         
         jEditorPane1.setContentType("text/html");
         jScrollPane1.getViewport().add(jEditorPane1);
         getContentPane().add(jScrollPane1);
         jEditorPane1.setText(fuente);
         Back.push(direccion);
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
          direccion = txtUrl.getText(); 
          html = new GetterBrowser();
          source = html.getHtml(direccion);
          jEditorPane1.setText(source);
          Back.push(direccion);

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBulletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBulletActionPerformed
        address = txtUrl.getText();
        html = new GetterBrowser();
        source = html.getHtml(address);
        html.savePage(address, source);
        JOptionPane.showMessageDialog(null,"¡Página guardada!",""+address,JOptionPane.INFORMATION_MESSAGE);
  
    }//GEN-LAST:event_btnBulletActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBullet;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}
