package dao;

import java.util.List;

import org.hibernate.HibernateException;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;

public class GenericDAO {

    public void inserir(Object obj) throws HibernateException {        
        
        Session sessao = null;
        
        try {
            sessao = ConectionDAO.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÕES
            sessao.save(obj);

            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
    }
    
    
    public void alterar(Object obj) throws HibernateException {
        Session sessao = null;
        
        try {
            sessao = ConectionDAO.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÕES
            sessao.update(obj);

            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
    }
    
    public void excluir(Object obj) throws HibernateException {
        Session sessao = null;
        
        try {
            sessao = ConectionDAO.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÕES
            sessao.delete(obj);

            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
    }
    
    
    public List listar(Class classe ) throws HibernateException {
        Session sessao = null;
        List lista = null;
        
        try {
            sessao = ConectionDAO.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÕES
            CriteriaQuery consulta = sessao.getCriteriaBuilder().createQuery(classe);
            consulta.from(classe);
            lista = sessao.createQuery(consulta).getResultList();            

            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
        }
        return lista;
    }
    

       // -----------------------------------------------
    // Se não existir no banco retorna NULL
    // -----------------------------------------------
    public Object get(Class classe, int id) throws HibernateException {
        Session sessao = null;
        Object objReturn = null;
        try   {
          sessao = ConectionDAO.getSessionFactory().openSession();
          sessao.getTransaction().begin();

          objReturn = sessao.get(classe, id );

          sessao.getTransaction().commit();
          sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return objReturn;

    }
}
