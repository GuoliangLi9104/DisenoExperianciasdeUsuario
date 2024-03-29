/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

/**
 *
 * @author Li
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitCheckbox = new javax.swing.JMenuItem();
        mitColores = new javax.swing.JMenuItem();
        mitLista = new javax.swing.JMenuItem();
        mitTree = new javax.swing.JMenuItem();
        mitBarra = new javax.swing.JMenuItem();
        mitCalculadora = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Opciones");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mitCheckbox.setText("Checkbox");
        mitCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitCheckboxActionPerformed(evt);
            }
        });
        jMenu1.add(mitCheckbox);

        mitColores.setText("Colores");
        mitColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitColoresActionPerformed(evt);
            }
        });
        jMenu1.add(mitColores);

        mitLista.setText("Lista");
        mitLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitListaActionPerformed(evt);
            }
        });
        jMenu1.add(mitLista);

        mitTree.setText("Tree");
        mitTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitTreeActionPerformed(evt);
            }
        });
        jMenu1.add(mitTree);

        mitBarra.setText("Barra");
        mitBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitBarraActionPerformed(evt);
            }
        });
        jMenu1.add(mitBarra);

        mitCalculadora.setText("Calculadora");
        mitCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitCalculadoraActionPerformed(evt);
            }
        });
        jMenu1.add(mitCalculadora);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mitCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitCheckboxActionPerformed
        CheckBox ventanaSecundaria = new CheckBox(this, true);
        ventanaSecundaria.pack();
        ventanaSecundaria.setVisible(true);
    }//GEN-LAST:event_mitCheckboxActionPerformed

    private void mitColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitColoresActionPerformed
         Colores ventanaSecundaria = new Colores(this, true);
        ventanaSecundaria.pack();
        ventanaSecundaria.setVisible(true);
    }//GEN-LAST:event_mitColoresActionPerformed

    private void mitListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitListaActionPerformed
        Lista ventanaSecundaria = new Lista(this, true);
        ventanaSecundaria.pack();
        ventanaSecundaria.setVisible(true);
    }//GEN-LAST:event_mitListaActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void mitTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitTreeActionPerformed
         Tree ventanaSecundaria = new Tree(this, true);
        ventanaSecundaria.pack();
        ventanaSecundaria.setVisible(true);
    }//GEN-LAST:event_mitTreeActionPerformed

    private void mitBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitBarraActionPerformed
        Barra ventanaSecundaria = new Barra(this, true);
        ventanaSecundaria.pack();
        ventanaSecundaria.setVisible(true);
    }//GEN-LAST:event_mitBarraActionPerformed

    private void mitCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitCalculadoraActionPerformed
        Calculadora ventanaSecundaria = new Calculadora(this, true);
        ventanaSecundaria.pack();
        ventanaSecundaria.setVisible(true);
    }//GEN-LAST:event_mitCalculadoraActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mitBarra;
    private javax.swing.JMenuItem mitCalculadora;
    private javax.swing.JMenuItem mitCheckbox;
    private javax.swing.JMenuItem mitColores;
    private javax.swing.JMenuItem mitLista;
    private javax.swing.JMenuItem mitTree;
    // End of variables declaration//GEN-END:variables
}
