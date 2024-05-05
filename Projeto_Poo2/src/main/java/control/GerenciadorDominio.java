/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

//import dao.ConectionPostgres;
import dao.ConexaoHibernate;
import java.sql.SQLException;

/**
 *
 * @author Marco
 */
public class GerenciadorDominio {


    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
//        ConectionPostgres.obterConexao();
        ConexaoHibernate.getSessionFactory();

    }
}
