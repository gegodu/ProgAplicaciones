/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Interfaces;

//import lab01.Interfaces.RegUsuario;

/**
 *
 * @author gera
 */
public class Console extends javax.swing.JFrame {

    /**
     * Creates new form Console
     */
    public Console() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        EscritorioMenu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        smnuSalir = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuRegUsuario = new javax.swing.JMenuItem();
        mnuRegRestaurante = new javax.swing.JMenuItem();
        mnuRegPedido = new javax.swing.JMenuItem();
        smnuRegCat = new javax.swing.JMenuItem();
        ver = new javax.swing.JMenu();
        VerClientes = new javax.swing.JMenuItem();
        VerRestaurantes = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        smnuSalir.setText("Inicio");

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        smnuSalir.add(mnuSalir);

        jMenuBar1.add(smnuSalir);

        jMenu2.setText("Registros");

        mnuRegUsuario.setText("Registrar Usuario");
        mnuRegUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(mnuRegUsuario);

        mnuRegRestaurante.setText("Registrar Restaurante");
        mnuRegRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegRestauranteActionPerformed(evt);
            }
        });
        jMenu2.add(mnuRegRestaurante);

        mnuRegPedido.setText("Registrar Pedido");
        jMenu2.add(mnuRegPedido);

        smnuRegCat.setText("Registrar Categoria");
        smnuRegCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuRegCatActionPerformed(evt);
            }
        });
        jMenu2.add(smnuRegCat);

        jMenuBar1.add(jMenu2);

        ver.setText("Informacion");

        VerClientes.setText("Ver Clientes");
        VerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerClientesActionPerformed(evt);
            }
        });
        ver.add(VerClientes);

        VerRestaurantes.setText("Ver Restaurantes");
        VerRestaurantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerRestaurantesActionPerformed(evt);
            }
        });
        ver.add(VerRestaurantes);

        jMenuBar1.add(ver);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EscritorioMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EscritorioMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuRegUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegUsuarioActionPerformed
        RegUsuario regCli = new RegUsuario();
        EscritorioMenu.add(regCli);
        regCli.show();
    }//GEN-LAST:event_mnuRegUsuarioActionPerformed

    private void VerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerClientesActionPerformed
        // TODO add your handling code here:
        VerCliente vercli = new VerCliente();
        EscritorioMenu.add(vercli);
        
        vercli.show();
    }//GEN-LAST:event_VerClientesActionPerformed

    
    
    private void mnuRegRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegRestauranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuRegRestauranteActionPerformed

    private void smnuRegCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuRegCatActionPerformed
        RegCategoria regCat = new RegCategoria();
        EscritorioMenu.add(regCat);
        
        regCat.show();
    }//GEN-LAST:event_smnuRegCatActionPerformed

    private void VerRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerRestaurantesActionPerformed
        VerRestaurante verRes = new VerRestaurante();
        EscritorioMenu.add(verRes);
        
        verRes.show();// TODO add your handling code here:
    }//GEN-LAST:event_VerRestaurantesActionPerformed

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
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Console().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane EscritorioMenu;
    private javax.swing.JMenuItem VerClientes;
    private javax.swing.JMenuItem VerRestaurantes;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mnuRegPedido;
    private javax.swing.JMenuItem mnuRegRestaurante;
    private javax.swing.JMenuItem mnuRegUsuario;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem smnuRegCat;
    private javax.swing.JMenu smnuSalir;
    private javax.swing.JMenu ver;
    // End of variables declaration//GEN-END:variables
}
