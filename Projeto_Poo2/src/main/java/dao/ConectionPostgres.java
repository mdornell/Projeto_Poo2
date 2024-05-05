/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;

/**
 *
 * @author Marco
 */
public class ConectionPostgres {

    private static Connection conexao;

    public static Connection obterConexao() throws ClassNotFoundException, SQLException {
        String servidor = "localhost:5432";
        String usuario = "postgres";
        String senha = "postgres";
        String nomeBanco = "poo2";
        String url = "jdbc:postgresql://" + servidor + "/" + nomeBanco;

        String drive = "org.postgresql.Driver";
//           String driveMySql = "com.mysql.jdb.Driver";

        Class.forName(drive);
        conexao = DriverManager.getConnection(url, usuario, senha);
        return conexao;

    }
}
