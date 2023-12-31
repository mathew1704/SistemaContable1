/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MENU_PRINCIPAL;

import MANTENIMIENTO.DE_CATALOGO_CUENTAS;
import MANTENIMIENTO.DE_USUARIO;
import MOVIMIENTOS.DE_TRANSACCIONES;

/**
 *
 * @author mathe
 */
public class MENU extends javax.swing.JFrame {

    /**
     * Creates new form MENU
     */
    public MENU() {
        
         initComponents();
        setTitle("Sistema Contable");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        catalogodecuenta = new javax.swing.JMenu();
        Usuario = new javax.swing.JMenuItem();
        CATALOGO = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        TRANSACCIONES = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu3.setText("jMenu3");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 769, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        catalogodecuenta.setText("MANTENIMIENTO");

        Usuario.setText("USUARIO");
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        catalogodecuenta.add(Usuario);

        CATALOGO.setText("CATALOGO DE CUENTAS");
        CATALOGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CATALOGOActionPerformed(evt);
            }
        });
        catalogodecuenta.add(CATALOGO);

        jMenuBar1.add(catalogodecuenta);

        jMenu4.setText("MOVIMIENTOS ");

        TRANSACCIONES.setText("TRANSACCIONES");
        TRANSACCIONES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRANSACCIONESActionPerformed(evt);
            }
        });
        jMenu4.add(TRANSACCIONES);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("PROCESOS ");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("CONSULTAS");

        jMenu11.setText("CATALOGO DE CUENTA");
        jMenu6.add(jMenu11);

        jMenu12.setText("TRANSACCIONES DE FECHA");
        jMenu6.add(jMenu12);

        jMenu13.setText("TRANSACCIONES POR RANGO DE FECHA");
        jMenu6.add(jMenu13);

        jMenu14.setText("TRANSACCIONES POR DOCUMENTOS");
        jMenu6.add(jMenu14);

        jMenu15.setText("TRANSACCIONES POR TIPO DOCUMENTOS");
        jMenu6.add(jMenu15);

        jMenu16.setText("BALANZA GENERAL");
        jMenu6.add(jMenu16);

        jMenu17.setText("BALANZA DE COMPROBACION");
        jMenu6.add(jMenu17);

        jMenu18.setText("RESUMEN DE GASTO GENERALES");
        jMenu6.add(jMenu18);

        jMenu19.setText("ESTADO DE GANACIAS Y PERDIDAS");
        jMenu6.add(jMenu19);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        DE_USUARIO e = new DE_USUARIO();
        e.setVisible(true);
    }//GEN-LAST:event_UsuarioActionPerformed

    private void CATALOGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CATALOGOActionPerformed
       DE_CATALOGO_CUENTAS e = new DE_CATALOGO_CUENTAS();
        e.setVisible(true);
    }//GEN-LAST:event_CATALOGOActionPerformed

    private void TRANSACCIONESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRANSACCIONESActionPerformed
        DE_TRANSACCIONES e = new DE_TRANSACCIONES();
        e.setVisible(true);
    }//GEN-LAST:event_TRANSACCIONESActionPerformed

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CATALOGO;
    private javax.swing.JMenuItem TRANSACCIONES;
    private javax.swing.JMenuItem Usuario;
    private javax.swing.JMenu catalogodecuenta;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
