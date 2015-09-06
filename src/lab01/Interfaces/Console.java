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
        jMenuItem5 = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuRegUsuario = new javax.swing.JMenuItem();
        smnuRegCat = new javax.swing.JMenuItem();
        mnuRegProducto = new javax.swing.JMenuItem();
        ver = new javax.swing.JMenu();
        VerClientes = new javax.swing.JMenuItem();
        VerRestaurantes = new javax.swing.JMenuItem();
        jMVerinfoProd = new javax.swing.JMenuItem();
        mnuVerRestPrueba = new javax.swing.JMenuItem();
        menuGenerarPedido = new javax.swing.JMenu();
        genPedido = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        smnuSalir.setText("Inicio");

        jMenuItem5.setText("Cargar datos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        smnuSalir.add(jMenuItem5);

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

        smnuRegCat.setText("Registrar Categoria");
        smnuRegCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuRegCatActionPerformed(evt);
            }
        });
        jMenu2.add(smnuRegCat);

        mnuRegProducto.setText("Registrar Producto");
        mnuRegProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegProductoActionPerformed(evt);
            }
        });
        jMenu2.add(mnuRegProducto);

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

        jMVerinfoProd.setText("Ver informacion producto");
        jMVerinfoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMVerinfoProdActionPerformed(evt);
            }
        });
        ver.add(jMVerinfoProd);

        mnuVerRestPrueba.setText("Ver Restaurantes Prueba");
        mnuVerRestPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVerRestPruebaActionPerformed(evt);
            }
        });
        ver.add(mnuVerRestPrueba);

        jMenuBar1.add(ver);

        menuGenerarPedido.setText("Pedidos");
        menuGenerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGenerarPedidoActionPerformed(evt);
            }
        });

        genPedido.setText("Generar Pedido");
        genPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genPedidoActionPerformed(evt);
            }
        });
        menuGenerarPedido.add(genPedido);

        jMenuBar1.add(menuGenerarPedido);

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
                .addComponent(EscritorioMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuRegUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegUsuarioActionPerformed
       
        //this.jtxtCliente.setText(ICPed.getNickname());
        //this.jtxtCliente.setVisible(true);
        RegUsuario regCli = new RegUsuario();
        EscritorioMenu.add(regCli);
        regCli.show();
    }//GEN-LAST:event_mnuRegUsuarioActionPerformed

    private void VerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerClientesActionPerformed
        // TODO add your handling code here:
        ListarClientesVer lista = new ListarClientesVer();
        EscritorioMenu.add(lista);
        lista.show();
        //VerCliente vercli = new VerCliente();
        //EscritorioMenu.add(vercli);
        //vercli.toFront();
        //vercli.show();
    }//GEN-LAST:event_VerClientesActionPerformed

    
    
    private void smnuRegCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuRegCatActionPerformed
        RegCategoria regCat = new RegCategoria();
        EscritorioMenu.add(regCat);
        
        regCat.show();
    }//GEN-LAST:event_smnuRegCatActionPerformed

    private void VerRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerRestaurantesActionPerformed
        //VerRestaurante verRes = new VerRestaurante();
        //EscritorioMenu.add(verRes); 
        //verRes.show();// TODO add your handling code here:
    }//GEN-LAST:event_VerRestaurantesActionPerformed

    private void menuGenerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGenerarPedidoActionPerformed

    // TODO add your handling code here:
    }//GEN-LAST:event_menuGenerarPedidoActionPerformed

    private void mnuRegProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegProductoActionPerformed
        RegProducto regProd = new RegProducto();
        EscritorioMenu.add(regProd);
        regProd.show();
    }//GEN-LAST:event_mnuRegProductoActionPerformed

    private void genPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genPedidoActionPerformed
        // TODO add your handling code here:
         ListarUsuariosGP listar = new ListarUsuariosGP();
        Console.EscritorioMenu.add(listar);
        listar.show();
        //GenerarPedido generar = new GenerarPedido();
        //EscritorioMenu.add(generar);
        //generar.show();
    }//GEN-LAST:event_genPedidoActionPerformed

    private void mnuVerRestPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVerRestPruebaActionPerformed
        SeleccionarRestaurante selecCat = new SeleccionarRestaurante();
        EscritorioMenu.add(selecCat);
        selecCat.show();
    }//GEN-LAST:event_mnuVerRestPruebaActionPerformed

    private void jMVerinfoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMVerinfoProdActionPerformed
        // TODO add your handling code here:
        VerProducto verprod = new VerProducto();
        EscritorioMenu.add(verprod);
        verprod.show();
    }//GEN-LAST:event_jMVerinfoProdActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        CargarDatos cargar = new CargarDatos();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
    public static javax.swing.JDesktopPane EscritorioMenu;
    private javax.swing.JMenuItem VerClientes;
    private javax.swing.JMenuItem VerRestaurantes;
    private javax.swing.JMenuItem genPedido;
    private javax.swing.JMenuItem jMVerinfoProd;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu menuGenerarPedido;
    private javax.swing.JMenuItem mnuRegProducto;
    private javax.swing.JMenuItem mnuRegUsuario;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuVerRestPrueba;
    private javax.swing.JMenuItem smnuRegCat;
    private javax.swing.JMenu smnuSalir;
    private javax.swing.JMenu ver;
    // End of variables declaration//GEN-END:variables
}
