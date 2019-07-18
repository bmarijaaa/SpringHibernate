package heroj;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateMetode {
	@Autowired
	private SessionFactory sessionFactory;
	
/*	public void sacuvajHeroja(SuperHeroj heroj) {
		
		Session session = sessionFactory.openSession();
			session.beginTransaction();
			try {
				session.save(heroj);
				session.getTransaction().commit();
			} catch (Exception e) {
				session.getTransaction().rollback();
			}finally {
				session.close();
			}
		
	}*/
	
	@Transactional
	public void sacuvajHeroja(SuperHeroj heroj) {
		sessionFactory.getCurrentSession().save(heroj);
	}
	
	@Transactional
	public SuperHeroj vratiHeroja(int id) {
		return (SuperHeroj)sessionFactory.getCurrentSession().get(SuperHeroj.class,id);
	}
	
	@Transactional
	public String vratiMagiju(String ime) {
		Query q = sessionFactory.getCurrentSession().createQuery("SELECT magija FROM SuperHeroj WHERE ime = :ime");
		q.setParameter("ime", ime);
		return (String)q.getResultList().get(0);	
	}
	
	
	
	
	

}
