/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import control.GerenciaInterface;

/**
 *
 * @author Marco
 */
public class AreaDeTrabalho extends javax.swing.JFrame {

    private GerenciaInterface genInter;
    
    public AreaDeTrabalho(GerenciaInterface newGenInter) {
        genInter = newGenInter;
        
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

        lblBackgroud = new javax.swing.JLabel();
        mnBarra = new javax.swing.JMenuBar();
        mnMaterias = new javax.swing.JMenu();
        mmRegistrarMeterial = new javax.swing.JMenuItem();
        mmPesquisarMaterial = new javax.swing.JMenuItem();
        mmFornecedor = new javax.swing.JMenu();
        mmRegistarFornecedor = new javax.swing.JMenuItem();
        mmPesquisarFornecedor = new javax.swing.JMenuItem();
        mnClientes = new javax.swing.JMenu();
        mmRegistarCliente = new javax.swing.JMenuItem();
        mmPesquisarCliente = new javax.swing.JMenuItem();
        mnTrabalhos = new javax.swing.JMenu();
        mmRegistrarOrcamento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ABM Pinturas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblBackgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ABM-Pinturas.png"))); // NOI18N

        mnMaterias.setText("Materias");

        mmRegistrarMeterial.setText("Registrar Meterial");
        mmRegistrarMeterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmRegistrarMeterialActionPerformed(evt);
            }
        });
        mnMaterias.add(mmRegistrarMeterial);

        mmPesquisarMaterial.setText("Pesquisar Meterial");
        mmPesquisarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmPesquisarMaterialActionPerformed(evt);
            }
        });
        mnMaterias.add(mmPesquisarMaterial);

        mmFornecedor.setText("Fornecedor");

        mmRegistarFornecedor.setText("Registrar Fornecedor");
        mmRegistarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmRegistarFornecedorActionPerformed(evt);
            }
        });
        mmFornecedor.add(mmRegistarFornecedor);

        mmPesquisarFornecedor.setText("Pesquisar Fornecedor");
        mmPesquisarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmPesquisarFornecedorActionPerformed(evt);
            }
        });
        mmFornecedor.add(mmPesquisarFornecedor);

        mnMaterias.add(mmFornecedor);

        mnBarra.add(mnMaterias);

        mnClientes.setText("Clientes");

        mmRegistarCliente.setText("Registrar Cliente");
        mmRegistarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmRegistarClienteActionPerformed(evt);
            }
        });
        mnClientes.add(mmRegistarCliente);

        mmPesquisarCliente.setText("Pesquisar Cliente");
        mmPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmPesquisarClienteActionPerformed(evt);
            }
        });
        mnClientes.add(mmPesquisarCliente);

        mnBarra.add(mnClientes);

        mnTrabalhos.setText("Trabalhos");

        mmRegistrarOrcamento.setText("Registrar Orçamento");
        mmRegistrarOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmRegistrarOrcamentoActionPerformed(evt);
            }
        });
        mnTrabalhos.add(mmRegistrarOrcamento);

        mnBarra.add(mnTrabalhos);

        setJMenuBar(mnBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBackgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBackgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mmRegistrarMeterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmRegistrarMeterialActionPerformed
        genInter.abrirFormMaterial();
    }//GEN-LAST:event_mmRegistrarMeterialActionPerformed

    private void mmPesquisarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmPesquisarMaterialActionPerformed
        genInter.abrirPesqMaterial();
    }//GEN-LAST:event_mmPesquisarMaterialActionPerformed

    private void mmRegistarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmRegistarFornecedorActionPerformed
        genInter.abrirFormFornecedor();
    }//GEN-LAST:event_mmRegistarFornecedorActionPerformed

    private void mmPesquisarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmPesquisarFornecedorActionPerformed
        genInter.abrirPesqFornecedor();
    }//GEN-LAST:event_mmPesquisarFornecedorActionPerformed

    private void mmRegistarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmRegistarClienteActionPerformed
       genInter.abrirFormCliente();
    }//GEN-LAST:event_mmRegistarClienteActionPerformed

    private void mmPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmPesquisarClienteActionPerformed
        genInter.abrirPesqCliente();
    }//GEN-LAST:event_mmPesquisarClienteActionPerformed

    private void mmRegistrarOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmRegistrarOrcamentoActionPerformed
        genInter.abrirFormOrcamento();
    }//GEN-LAST:event_mmRegistrarOrcamentoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackgroud;
    private javax.swing.JMenu mmFornecedor;
    private javax.swing.JMenuItem mmPesquisarCliente;
    private javax.swing.JMenuItem mmPesquisarFornecedor;
    private javax.swing.JMenuItem mmPesquisarMaterial;
    private javax.swing.JMenuItem mmRegistarCliente;
    private javax.swing.JMenuItem mmRegistarFornecedor;
    private javax.swing.JMenuItem mmRegistrarMeterial;
    private javax.swing.JMenuItem mmRegistrarOrcamento;
    private javax.swing.JMenuBar mnBarra;
    private javax.swing.JMenu mnClientes;
    private javax.swing.JMenu mnMaterias;
    private javax.swing.JMenu mnTrabalhos;
    // End of variables declaration//GEN-END:variables

}
