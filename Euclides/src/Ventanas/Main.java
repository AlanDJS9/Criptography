/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Main extends javax.swing.JFrame {

    String Archivo;
    int Alpha,Beta;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombre = new javax.swing.JLabel();
        Cryptography = new javax.swing.JLabel();
        alpha = new javax.swing.JLabel();
        I_alpha = new javax.swing.JTextField();
        alpha1 = new javax.swing.JLabel();
        I_beta = new javax.swing.JTextField();
        Select = new javax.swing.JButton();
        Encrypt = new javax.swing.JButton();
        Decrypt = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Entry = new javax.swing.JButton();
        Output = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        Nombre.setText("Josue Ruiz Hernandez");
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, 40));

        Cryptography.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Cryptography.setText("Cryptography");
        getContentPane().add(Cryptography, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 190, 30));

        alpha.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        alpha.setText("Set alpha");
        getContentPane().add(alpha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 120, 40));
        getContentPane().add(I_alpha, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 100, 40));

        alpha1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        alpha1.setText("Set beta");
        getContentPane().add(alpha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 120, 40));
        getContentPane().add(I_beta, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 100, 40));

        Select.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Select.setForeground(new java.awt.Color(255, 255, 255));
        Select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue.jpg"))); // NOI18N
        Select.setText("Select file");
        Select.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Select.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectActionPerformed(evt);
            }
        });
        getContentPane().add(Select, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 170, 50));

        Encrypt.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Encrypt.setForeground(new java.awt.Color(255, 255, 255));
        Encrypt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue.jpg"))); // NOI18N
        Encrypt.setText("Encrypt");
        Encrypt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Encrypt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptActionPerformed(evt);
            }
        });
        getContentPane().add(Encrypt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 170, 50));

        Decrypt.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Decrypt.setForeground(new java.awt.Color(255, 255, 255));
        Decrypt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue.jpg"))); // NOI18N
        Decrypt.setText("Decrypt");
        Decrypt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Decrypt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptActionPerformed(evt);
            }
        });
        getContentPane().add(Decrypt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 170, 50));

        Exit.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue.jpg"))); // NOI18N
        Exit.setText("Exit");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 170, 50));

        Entry.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Entry.setForeground(new java.awt.Color(255, 255, 255));
        Entry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue.jpg"))); // NOI18N
        Entry.setText("See entry");
        Entry.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Entry.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryActionPerformed(evt);
            }
        });
        getContentPane().add(Entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 170, 50));

        Output.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Output.setForeground(new java.awt.Color(255, 255, 255));
        Output.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue.jpg"))); // NOI18N
        Output.setText("See output");
        Output.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Output.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutputActionPerformed(evt);
            }
        });
        getContentPane().add(Output, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 170, 50));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectActionPerformed
       JFileChooser file = new JFileChooser();
        
        int opcion=file.showOpenDialog(this);
        
        if(opcion==JFileChooser.APPROVE_OPTION)
        {
            String nombre=file.getSelectedFile().getPath();
            
            String ruta=file.getSelectedFile().toString();
            
            JOptionPane.showMessageDialog(null,"File successfully loaded");
            
            setArchivo(ruta);
        }
    }//GEN-LAST:event_SelectActionPerformed

    private void EncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptActionPerformed
        
        if(getAlpha()>256)
        {
            JOptionPane.showMessageDialog(null,"Sorry bro!, alpha must be minus than 256");
        }
        else if(!Afin.MCD(getAlpha()))
        {
            JOptionPane.showMessageDialog(null,"Sorry bro!, change your alpha and try again");
        }
        else
        {
            try {
                escribirArchivo(Afin.Encrypt_t(getText(),getAlpha(),getBeta()));
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_EncryptActionPerformed

    private void EntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryActionPerformed
         String file = getArchivo(); 
   
         try{ 
         //definiendo la ruta en la propiedad file
         Runtime.getRuntime().exec("cmd /c start "+file);
        }catch(IOException e){
        } 
    }//GEN-LAST:event_EntryActionPerformed

    private void OutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutputActionPerformed
        if(getArchivo()!=null)
        {
            String file = "C:\\Users\\josue\\Documents\\Criptography\\Euclides\\Salida\\out.txt"; 
   
         try{ 
         //definiendo la ruta en la propiedad file
         Runtime.getRuntime().exec("cmd /c start "+file);
        }catch(IOException e){
        } 
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Sorry, you must encrypt or decrypt a file first at all");
        }
    }//GEN-LAST:event_OutputActionPerformed

    private void DecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptActionPerformed
        if(getAlpha()>256)
        {
            JOptionPane.showMessageDialog(null,"Sorry bro!, alpha must be minus than 256");
        }
        else if(!Afin.MCD(getAlpha()))
        {
            JOptionPane.showMessageDialog(null,"Sorry bro!, change your alpha and try again");
        }
        else
        {
            try {
                escribirArchivo(Afin.Decrypt_t(getText(),getAlpha(),getBeta()));
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_DecryptActionPerformed
    
    public void setArchivo(String ruta){ this.Archivo=ruta; }
    
    public String getArchivo(){ return this.Archivo; }
    
    public int getAlpha()
    {
        this.Alpha=parseInt(this.I_alpha.getText());
        
        return this.Alpha;
    }
    
     public int getBeta()
    {
        this.Beta=parseInt(this.I_beta.getText());
        
        return this.Beta;
    }
     
    public String getText()
    {
        StringBuilder nueva_letra=new StringBuilder();
        
        File fichero= new File(getArchivo());
        
        FileReader f=null;
        try {
            f = new FileReader(fichero);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader b = new BufferedReader(f);
        String cadena="";
        try {
            while((cadena = b.readLine())!=null) {
               nueva_letra.append(cadena);
                nueva_letra.append("\r\n");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            b.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nueva_letra.toString();
    }
    
     public void escribirArchivo(String letra) throws IOException
    {
        File out=new File("C:\\Users\\josue\\Documents\\Criptography\\Euclides\\Salida\\out.txt");
        
        if(out.delete()){}
        
        File nuevo=new File("C:\\Users\\josue\\Documents\\Criptography\\Euclides\\Salida\\out.txt");
        
        try (PrintWriter fw = new PrintWriter(nuevo,"utf-8")) {
            fw.println(letra);
            fw.close();
        }
       System.out.println(letra);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cryptography;
    private javax.swing.JButton Decrypt;
    private javax.swing.JButton Encrypt;
    private javax.swing.JButton Entry;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField I_alpha;
    private javax.swing.JTextField I_beta;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Output;
    private javax.swing.JButton Select;
    private javax.swing.JLabel alpha;
    private javax.swing.JLabel alpha1;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
