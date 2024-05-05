/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import windows.*;
import windows.formularios.DlgFormClientes;
import windows.formularios.DlgFormFornecedor;
import windows.formularios.DlgFormMaterial;
import windows.formularios.DlgFormOrcamento;
import windows.pesquisas.DlgPesqCliente;
import windows.pesquisas.DlgPesqFornecedor;
import windows.pesquisas.DlgPesqMaterial;

public class GerenciaInterface {

    private AreaDeTrabalho princ;
    private DlgFormClientes cadCli;
    private DlgFormFornecedor cadForn;
    private DlgFormMaterial cadMaterial;
    private DlgFormOrcamento cadOrcamento;
    private DlgPesqCliente pesqCli;
    private DlgPesqFornecedor pesqForn;
    private DlgPesqMaterial pesqMat;

    private GerenciadorDominio gerDom;

    public GerenciaInterface() {

        try {
            gerDom = new GerenciadorDominio();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(princ, ex);
            System.exit(-1);
        }
    }

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
            java.util.logging.Logger.getLogger(AreaDeTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaDeTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaDeTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaDeTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        GerenciaInterface gerenciaIG = new GerenciaInterface();
        gerenciaIG.abrirAreaDeTrabalho();
    }

    public void abrirAreaDeTrabalho() {
        if (princ == null) {
            princ = new AreaDeTrabalho(this);
        }
        princ.setVisible(true);
    }

    public void abrirFormCliente() {
        abrirJanela(princ, cadCli, DlgFormClientes.class);

    }

    public void abrirFormFornecedor() {
        abrirJanela(princ, cadForn, DlgFormFornecedor.class);
    }

    public void abrirFormMaterial() {
        abrirJanela(princ, cadMaterial, DlgFormMaterial.class);
    }

    public void abrirFormOrcamento() {
        abrirJanela(princ, cadOrcamento, DlgFormOrcamento.class);
    }

    public void abrirPesqCliente() {
        abrirJanela(princ, pesqCli, DlgPesqCliente.class);
    }

    public void abrirPesqFornecedor() {
        abrirJanela(princ, pesqForn, DlgPesqFornecedor.class);
    }

    public void abrirPesqMaterial() {
        abrirJanela(princ, pesqMat, DlgPesqMaterial.class);
    }

    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null) {
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent, true);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName());
            }
        }
        dlg.setVisible(true);
        return dlg;
    }

}
