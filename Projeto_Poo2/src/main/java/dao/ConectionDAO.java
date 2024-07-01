package dao;

import java.sql.*;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConectionDAO {
    
    private static Connection conexao;

    public static Connection getConexaoPSQL() throws ClassNotFoundException, SQLException {
        String servidor = "localhost:5432";
        String usuario = "postgres";
        String senha = "postgres";
        String nomeBanco = "poo2";
        String url = "jdbc:postgresql://" + servidor + "/" + nomeBanco;

        String drive = "org.postgresql.Driver";

        Class.forName(drive);
        conexao = DriverManager.getConnection(url, usuario, senha);
        return conexao;
    }

    public static Connection getConexaoMySQL() throws ClassNotFoundException, SQLException {
        String servidor = "localhost:3306";
        String usuario = "root";
        String senha = "root";
        String nomeBanco = "poo2";
        String url = "jdbc:mysql://" + servidor + "/" + nomeBanco;

        String drive = "com.mysql.cj.jdbc.Driver";

        Class.forName(drive);
        conexao = DriverManager.getConnection(url, usuario, senha);
        return conexao;
    }


    public static SessionFactory getSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (HibernateException ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
