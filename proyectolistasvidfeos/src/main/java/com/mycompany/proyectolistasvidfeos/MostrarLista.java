/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolistasvidfeos;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author mayel
 */
public class MostrarLista extends javax.swing.JFrame {
     private final JFXPanel jfxpanel =new JFXPanel();
    private final File file=new File("C:\\Users\\m825\\Desktop\\Archivos\\darling in the franxx\\Darling in the franxx - 07 (DF).mp4");
    private final MediaPlayer oracleVid=new MediaPlayer(new Media(file.toURI().toString()));
    /**
     * Creates new form MostrarLista
     */
    public MostrarLista() {
        initComponents();
        createScene();
        setTitle("REPRODUCTOR DE VIDEO");
        setResizable(true);
        setLocationRelativeTo(null);
        MostrarVideo.setLayout(new BorderLayout());
        MostrarVideo.add(jfxpanel,BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        
        ImageIcon pa = new ImageIcon(getClass().getResource("pausa.png"));
        ImageIcon ipa = new ImageIcon(pa.getImage().getScaledInstance(pausa.getWidth(), pausa.getHeight(), Image.SCALE_DEFAULT));
        pausa.setIcon(ipa);
        
        ImageIcon re = new ImageIcon(getClass().getResource("reproducir.png"));
        ImageIcon ire = new ImageIcon(re.getImage().getScaledInstance(reproducir.getWidth(), reproducir.getHeight(), Image.SCALE_DEFAULT));
        reproducir.setIcon(ire);
        
        
        ImageIcon si = new ImageIcon(getClass().getResource("siguiente.png"));
        ImageIcon isi = new ImageIcon(si.getImage().getScaledInstance(siguiente.getWidth(), siguiente.getHeight(), Image.SCALE_DEFAULT));
        siguiente.setIcon(isi);
        
        
        ImageIcon an = new ImageIcon(getClass().getResource("anterior.png"));
        ImageIcon ian = new ImageIcon(an.getImage().getScaledInstance(anterior.getWidth(), anterior.getHeight(), Image.SCALE_DEFAULT));
        anterior.setIcon(ian);
        
    }
     private void createScene(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
               
                MediaView med=new MediaView(oracleVid);
                Group grupo=new Group(med);
                med.setFitHeight(800);
                med.setFitWidth(600);
                Scene escena=new Scene(grupo);
               
                jfxpanel.setScene(escena);
             
                oracleVid.setVolume(1);
               
                oracleVid.setCycleCount(MediaPlayer.INDEFINITE);
                oracleVid.play();
                
              
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MostrarVideo = new javax.swing.JPanel();
        anterior = new javax.swing.JButton();
        reproducir = new javax.swing.JButton();
        pausa = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        nombreVideo = new javax.swing.JLabel();
        descripcionLista = new javax.swing.JLabel();
        agregarLista = new javax.swing.JToggleButton();
        agregarVideo = new javax.swing.JButton();
        listaDeListas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        MostrarVideo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        anterior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        reproducir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pausa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        siguiente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nombreVideo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        descripcionLista.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        descripcionLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        agregarLista.setBackground(new java.awt.Color(102, 102, 255));
        agregarLista.setText("Crea una Nueva Lista");
        agregarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarListaActionPerformed(evt);
            }
        });

        agregarVideo.setBackground(new java.awt.Color(102, 102, 255));
        agregarVideo.setText("Agregar un Video a la Lista");
        agregarVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarVideoActionPerformed(evt);
            }
        });

        listaDeListas.setBackground(new java.awt.Color(204, 255, 255));
        listaDeListas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Listas>" }));
        listaDeListas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDeListasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MostrarVideoLayout = new javax.swing.GroupLayout(MostrarVideo);
        MostrarVideo.setLayout(MostrarVideoLayout);
        MostrarVideoLayout.setHorizontalGroup(
            MostrarVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MostrarVideoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(MostrarVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionLista, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MostrarVideoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reproducir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pausa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(546, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MostrarVideoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MostrarVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agregarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaDeListas, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        MostrarVideoLayout.setVerticalGroup(
            MostrarVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MostrarVideoLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(listaDeListas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(agregarVideo)
                .addGap(36, 36, 36)
                .addComponent(agregarLista)
                .addGap(50, 50, 50)
                .addGroup(MostrarVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reproducir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pausa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siguiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(nombreVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descripcionLista, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MostrarVideo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MostrarVideo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void agregarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarListaActionPerformed
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la Lista: ");
        listaDeListas.addItem(nombre);
        Lista listaNueva = new Lista(nombre);
        try {
            this.listaGeneral.InsertarListaFinal(listaNueva);
        } catch (IOException ex) {
            Logger.getLogger(MostrarLista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_agregarListaActionPerformed

    private void listaDeListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDeListasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaDeListasActionPerformed

    private void agregarVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarVideoActionPerformed
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingrese el niombre del Video: ");
        String descripcion;
        descripcion = JOptionPane.showInputDialog("Ingrese la descripcion del Video: ");
        String ruta="";
         JFileChooser fc=new JFileChooser();
       fc.setAcceptAllFileFilterUsed(false);
       fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
       fc.addChoosableFileFilter(new FileNameExtensionFilter("Videos","mp4"));
        int seleccion=fc.showOpenDialog(this);
        if(seleccion==JFileChooser.APPROVE_OPTION){
           File fichero=fc.getSelectedFile();
           ruta =fichero.getAbsolutePath();
        }
        try {
            this.listaGeneral.Actual().InsertarFinal(nombre, descripcion, ruta);
        } catch (IOException ex) {
            Logger.getLogger(MostrarLista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_agregarVideoActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                listaGeneral = new ListaLista();
                new MostrarLista().setVisible(true);
            }
        });
    }
    private static ListaLista listaGeneral;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MostrarVideo;
    private javax.swing.JToggleButton agregarLista;
    private javax.swing.JButton agregarVideo;
    private javax.swing.JButton anterior;
    private javax.swing.JLabel descripcionLista;
    private javax.swing.JComboBox<String> listaDeListas;
    private javax.swing.JLabel nombreVideo;
    private javax.swing.JButton pausa;
    private javax.swing.JButton reproducir;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
