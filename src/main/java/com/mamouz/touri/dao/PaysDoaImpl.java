/**
 * 
 */
package com.mamouz.touri.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.mamouz.touri.dao.entity.Pays;
import com.mamouz.touri.dao.interfaces.IPaysDao;

/**
 * @author famille AMOUZOU
 *
 */
@Repository("paysDao")
public class PaysDoaImpl implements IPaysDao {
	
	@Resource(name = "hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;
	
	private static final Logger log = Logger.getLogger(PaysDoaImpl.class);

	@Override
	public void addPays(Pays p) {
		log.info("\033[43m----------------- IN create PaysDao ----------------\033[0m\n");
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(p);

		// Close session
		tx.commit();
		log.debug("\033[42mPaysDao créer avec succès : " + p + "\033[0m\n");
		session.close();
	}

	@Override
	public void removeContinent(Long id) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Pays loadFamily = session.load(Pays.class, id);

		if (loadFamily != null) {
			session.delete(loadFamily);
		}

		// Close session
		tx.commit();
		session.close();

	}

	@Override
	public void updateContinent(Pays p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(p);

		// Close session
		tx.commit();
		session.close();

	}

	@Override
	public Pays findPaysById(Long id) {
		Session session = this.sessionFactory.openSession();

		Pays pays = session.load(Pays.class, id);
		return pays;
	}

	@Override
	public List<Pays> findPaysByCriteria(String criteria) {
		Session session = this.sessionFactory.openSession();
		List<Pays> listPays = session.createQuery("select * from Pays"
				+ "											 where criteria like %:param% ")
				.setParameter("param", criteria).list();
		
		session.close();
		
		return listPays;
	}

	@Override
	public List<Pays> findAllPays() {
		Session session = this.sessionFactory.openSession();
		List<Pays> paysList = session.createQuery("from Pays").list();
		session.close(); 
		return paysList;
	}

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
