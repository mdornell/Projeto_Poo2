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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.hibernate.HibernateException;

import domain.Pessoa;
import windows.*;
import windows.formularios.DlgFormMaterial;
import windows.formularios.DlgFormOrcamento;
import windows.formularios.DlgFormPessoa;
import windows.pesquisas.DlgPesqMaterial;
import windows.pesquisas.DlgPesqOrcamento;
import windows.pesquisas.DlgPesqPessoa;

public class GerenciaInterface {

    private AreaDeTrabalho princ;
    private DlgFormMaterial cadMaterial;
    private DlgFormOrcamento cadOrcamento;
    private DlgPesqMaterial pesqMat;
    private DlgFormPessoa formPessoa;
    private DlgPesqPessoa pesqPessoa;
    private GerenciadorDominio gerDom;
    private DlgPesqOrcamento pesqOrcamento;

    private static GerenciaInterface gerenciaIG = null;

    private GerenciaInterface() {

        try {
            gerDom = new GerenciadorDominio();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(princ, ex);
            System.exit(-1);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AreaDeTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaDeTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaDeTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaDeTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        GerenciaInterface gerenciaIG = new GerenciaInterface();
        gerenciaIG.abrirAreaDeTrabalho();
    }

    public static GerenciaInterface getInstance() {
        if (gerenciaIG == null) {
            gerenciaIG = new GerenciaInterface();
        }
        return gerenciaIG;
    }

    public void abrirAreaDeTrabalho() {
        if (princ == null) {
            princ = new AreaDeTrabalho(this);
        }
        princ.setVisible(true);
    }

    public void abrirFormPessoa() {
        abrirJanela(princ, formPessoa, DlgFormPessoa.class);

    }

    public void abrirFormMaterial() {
        abrirJanela(princ, cadMaterial, DlgFormMaterial.class);
    }

    public void abrirFormOrcamento() {
        abrirJanela(princ, cadOrcamento, DlgFormOrcamento.class);
    }

    public void abrirPesqPessoa() {
       pesqPessoa = (DlgPesqPessoa) abrirJanela(princ, pesqPessoa, DlgPesqPessoa.class);
    }

    public void abrirPesqMaterial() {
        abrirJanela(princ, pesqMat, DlgPesqMaterial.class);
    }

    public void abrirPesqOrcamento() {
        abrirJanela(princ, pesqOrcamento, DlgPesqOrcamento.class);
    }

    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null) {
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent, true);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
                    | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName());
            }
        }
        dlg.setVisible(true);
        return dlg;
    }

    public GerenciadorDominio getGerDom() {
        return gerDom;
    }

    public <T> void carregarComboBox(JComboBox combo, JDialog janela, Class<T> classe) {
        try {
            List<T> lista = (List<T>) this.gerDom.list(classe);
            combo.setModel(new DefaultComboBoxModel(lista.toArray()));
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(janela, "Erro carregar Combo Box: " + ex);
        }
    }

    public void carregarTabela(JTable tabela, JDialog janela, Class<?> classe, String pesq, int tipo) {
        try {
            List<?> lista = (List<?>) this.gerDom.list(classe, pesq, tipo);
            ((DefaultTableModel) tabela.getModel()).setNumRows(0);
            for (Object obj : lista) {
                // ADICIONAR LINHA NA TABELA
                ((DefaultTableModel) tabela.getModel())
                        .addRow((Object[]) obj.getClass().getMethod("toArray").invoke(obj));
            }
        } catch (HibernateException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException ex) {
            JOptionPane.showMessageDialog(janela, "Erro carregar Tabela: " + ex);
        }
    }

    
}
