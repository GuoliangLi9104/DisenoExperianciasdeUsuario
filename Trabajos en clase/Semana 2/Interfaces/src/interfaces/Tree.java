/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaces;

import javax.swing.JOptionPane;
import javax.swing.tree.*;

/**
 *
 * @author Li
 */
public class Tree extends javax.swing.JDialog {

    DefaultMutableTreeNode Titulo = null;
    DefaultTreeModel modelo = null;

    /**
     * Creates new form Tree
     */
    public Tree(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jTree1.setModel(cargarArbol());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        btnAgregar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnInformacion = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(jTree1);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnInformacion.setText("Informacion");
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnAgregar)
                        .addGap(58, 58, 58)
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(btnInformacion)
                        .addGap(44, 44, 44)
                        .addComponent(btnModificar)
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnRemover)
                    .addComponent(btnInformacion)
                    .addComponent(btnModificar))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String cadena = JOptionPane.showInputDialog(this, "Ingrese un departamento");
        DefaultMutableTreeNode parentNodo = null;
        TreePath parentPath = jTree1.getSelectionPath();
        if (parentPath == null) {
        } else {
            parentNodo = (DefaultMutableTreeNode) parentPath.getLastPathComponent();
        }
        DefaultMutableTreeNode child = new DefaultMutableTreeNode(cadena);
        modelo.insertNodeInto(child, parentNodo, parentNodo.getChildCount());
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        DefaultMutableTreeNode parentNode = null;
        TreePath currentSelection = jTree1.getSelectionPath();
        if (currentSelection != null) {
            parentNode = (DefaultMutableTreeNode) currentSelection.getLastPathComponent();
            DefaultTreeModel model = ((DefaultTreeModel) jTree1.getModel());
            model.removeNodeFromParent(parentNode);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        if (node == null) //Nothing is selected.
        {
            return;
        }
        Object nodeInfo = node.getUserObject();
        JOptionPane.showMessageDialog(this, nodeInfo.toString());
    }//GEN-LAST:event_btnInformacionActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        if (node == null) //Nothing is selected.
        {
            return;
        }
        Object nodeInfo = node.getUserObject();
        String cadena = JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre", nodeInfo.toString());
        TreePath currentSelection = jTree1.getSelectionPath();
        if (currentSelection != null) {
            node = (DefaultMutableTreeNode) currentSelection.getLastPathComponent();
            node.setUserObject(cadena);
            DefaultTreeModel model = ((DefaultTreeModel) jTree1.getModel());
            model.nodeChanged(node);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    public DefaultTreeModel cargarArbol() {
        DefaultMutableTreeNode categorias = null;
        DefaultMutableTreeNode subcategoria = null;
        Titulo = new DefaultMutableTreeNode("Centro de Administración");
        modelo = new DefaultTreeModel(Titulo);
        categorias = new DefaultMutableTreeNode("Adm. Redes");
        subcategoria = new DefaultMutableTreeNode("Dept. de planificación");
        modelo.insertNodeInto(categorias, Titulo, 0);
        modelo.insertNodeInto(subcategoria, categorias, 0);
        categorias = new DefaultMutableTreeNode("Adm. de Laboratorios");
        subcategoria = new DefaultMutableTreeNode("Dept. de Tecnologia");
        modelo.insertNodeInto(categorias, Titulo, 1);
        modelo.insertNodeInto(subcategoria, categorias, 0);
        categorias = new DefaultMutableTreeNode("Dept. de Investigación");
        subcategoria = new DefaultMutableTreeNode("Dept. A");
        modelo.insertNodeInto(categorias, Titulo, 2);
        modelo.insertNodeInto(subcategoria, categorias, 0);
        return modelo;
    }

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
