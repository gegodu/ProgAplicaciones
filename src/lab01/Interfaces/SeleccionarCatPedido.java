/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Interfaces;

import java.awt.event.ItemEvent;
import lab01.Handlers.Fabrica;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author joaquin
 */
public class SeleccionarCatPedido extends javax.swing.JInternalFrame {
    private ICtrlPedido ICPed;

    /**
     * Creates new form SeleccionarCat
     */
    public SeleccionarCatPedido() {
        initComponents();
        Fabrica fabrica = Fabrica.getInstance();
        ICPed = fabrica.getICtrlPedido();
        this.cargarCBbox();
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbListo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jcbSelect = new javax.swing.JComboBox();
        jtxtCategoria = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Categorias de Restaurante");
        setToolTipText("");

        jbListo.setText("Listo");
        jbListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione una categoria del restaurante"));

        jcbSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select..." }));
        jcbSelect.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jcbSelectMouseDragged(evt);
            }
        });
        jcbSelect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbSelectItemStateChanged(evt);
            }
        });

        jtxtCategoria.setEditable(false);
        jtxtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jcbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jtxtCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbListo)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbListo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbSelectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbSelectItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED)
            jtxtCategoria.setText(evt.getItem().toString());
        

//String s = (String) jcbSelect.getSelectedItem();
// TODO add your handling code here:
    }//GEN-LAST:event_jcbSelectItemStateChanged

    private void jcbSelectMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbSelectMouseDragged




// TODO add your handling code here:
    }//GEN-LAST:event_jcbSelectMouseDragged

    private void jbListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListoActionPerformed
        if(this.jtxtCategoria.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Debe ingresar al menos una categoria.", "ERROR", JOptionPane.ERROR_MESSAGE);
        else{
            ICPed.setCat(jtxtCategoria.getText());
            this.dispose();
            //nueva pantalla seleccionar restaurante
            SeleccionarRestaurantePedido selR = new SeleccionarRestaurantePedido();
            Console.EscritorioMenu.add(selR);
            selR.show();
        }    
        


// TODO add your handling code here:
    }//GEN-LAST:event_jbListoActionPerformed

    private void jtxtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCategoriaActionPerformed
    public void cargarCBbox(){
        Map cats; 
        cats=ICPed.retColDCat();
        Iterator it = cats.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry map = (Map.Entry) it.next();
            jcbSelect.addItem(map.getKey().toString());
        }
    
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbListo;
    private javax.swing.JComboBox jcbSelect;
    private javax.swing.JTextField jtxtCategoria;
    // End of variables declaration//GEN-END:variables
}
