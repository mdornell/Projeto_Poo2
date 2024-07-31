/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

//import dao.ConectionPostgres;
import dao.ConectionDAO;
import dao.GenericDAO;
import domain.Cliente;
import domain.Endereco;
import domain.Fornecedor;
import domain.Material;
import domain.Orcamento;
import domain.Pessoa;
import domain.TipoServico;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.HibernateException;



public class GerenciadorDominio {

    private GenericDAO genDAO;

    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        // ConectionPostgres.obterConexao();
        ConectionDAO.getSessionFactory();
        genDAO = new GenericDAO();
    }

    public String inserirPessoa(String nome, String celular, String email, String cep, String rua, int num,
            String referencia, String bairro, String cidade, String estado, String cpf, String rg, String cnpj,
            boolean novo) {

        Endereco endereco = new Endereco(cep, rua, num, referencia, bairro, cidade, estado);

        if (novo) {
            Pessoa pessoa = new Cliente(cpf, rg, nome, celular, email, endereco);
            genDAO.inserir(pessoa);
            return "Pessoa inserida com sucesso!";
        }

        Pessoa pessoa = new Fornecedor(cnpj, nome, celular, email, endereco);
        genDAO.inserir(pessoa);
        return "Pessoa inserida com sucesso!";
    }

    public String inserirMaterial(String nome, String descricao, double preco, int quantidade, Fornecedor fornecedor) {
        
        Material material = new Material(nome, descricao, preco, quantidade, fornecedor);
        genDAO.inserir(material);

        return "Material inserido com sucesso!";
    }

    public void atualizarMaterial(int idMaterial, String nome, String descricao, double preco, int quantidade,
            Fornecedor fornecedor) {

        Material material = new Material(idMaterial, nome, descricao, preco, quantidade, fornecedor);
        genDAO.alterar(material);

    }

    public void atualizarPessoa(int idPessoa, String nome, String celular, String email,int idEnd ,String cep, String rua, int num,
            String referencia, String bairro, String cidade, String estado, String cpf, String rg, String cnpj,
            boolean novo) {

        Endereco endereco = new Endereco(idEnd, cep, rua, num, referencia, bairro, cidade, estado);
        genDAO.alterar(endereco);

        if (novo) {
            Pessoa pessoa = new Cliente(idPessoa, nome, cpf, rg, celular, email, endereco);
            genDAO.alterar(pessoa);
        }

        Pessoa pessoa = new Fornecedor(idPessoa, cnpj, nome, celular, email, endereco);
        genDAO.alterar(pessoa);
    }
    

    public List list(Class classe){
        return genDAO.listar(classe);
    }

    public List list(Class classe,String pesq, int tipo) throws HibernateException{
        List lista = null;
        if(classe.equals(Material.class)){
            switch (tipo) {
                case 0: lista = list(classe); break;         
            }
        }else if(classe.equals(Pessoa.class)){
            switch (tipo) {
                case 0: lista = list(classe); break;         
            }
        }
        return lista;}
    
     public void  deletar(Object obj) throws HibernateException{
        genDAO.excluir(obj);
    }

}
