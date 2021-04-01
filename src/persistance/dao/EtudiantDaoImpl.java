package persistance.dao;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistance.entities.Etudiant;

public class EtudiantDaoImpl {
	
	public void add(Etudiant etudiant) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tsc = session.beginTransaction();
		session.save(etudiant);
		tsc.commit();
		session.close();
	}
	
	public Etudiant findById(int code) {
        Session s=HibernateUtil.getSessionFactory().openSession();
        Etudiant e=s.get(Etudiant.class,code);
        s.close();
        return e;
    }

}
