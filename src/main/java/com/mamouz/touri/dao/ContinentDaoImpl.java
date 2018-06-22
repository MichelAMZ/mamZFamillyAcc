package com.mamouz.touri.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.mamouz.touri.dao.entity.Continent;
import com.mamouz.touri.dao.interfaces.IContinentDao;

@Repository("continentDao")
public class ContinentDaoImpl implements IContinentDao {

	@Resource(name = "hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void addContient(Continent c) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(c);

		// Close session
		tx.commit();
		session.close();
	}

	@Override
	public void removeContinent(Long id) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Continent loadContinent = session.load(Continent.class, id);

		if (loadContinent != null) {
			session.delete(loadContinent);
		}

		// Close session
		tx.commit();
		session.close();
	}

	@Override
	public void updateContinent(Continent c) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(c);

		// Close session
		tx.commit();
		session.close();
	}

	@Override
	public Continent findContinentById(Long id) {
		Session session = this.sessionFactory.openSession();

		Continent continent = session.load(Continent.class, id);
		return continent;
	}

	@Override
	public List<Continent> findContinentByCriteria(String criteria) {
		Session session = this.sessionFactory.openSession();
		List<Continent> listContinent = session
				.createQuery("select * from Continent"
						+ "											 where criteria like %:param% ")
				.setParameter("param", criteria).list();

		session.close();

		return listContinent;
	}

	@Override
	public List<Continent> findAllContinent() {
		Session session = this.sessionFactory.openSession();
		List<Continent> continentList = session.createQuery("from Continent").list();
		session.close();
		return continentList;
	}

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
}
