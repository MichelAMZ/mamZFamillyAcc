package com.mamouz.touri.dao.famillyImpl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.mamouz.touri.dao.entity.f_Famille.FamilyAcc;
import com.mamouz.touri.dao.interfaces.IFamilyAccDao;

@Repository("familyDao")
public class FamilyAccDaoImpl implements IFamilyAccDao {

	@Resource(name = "hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;

	private static final Logger log = Logger.getLogger(FamilyAcc.class);

	@Override
	public void addFamily(FamilyAcc f) {
		try {
			log.info("\033[43m----------------- IN create FamilyAccDao ----------------\033[0m\n");
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(f);

			tx.commit();
			log.debug("\033[42mFamilyAccDao créer avec succès : " + f + "\033[0m\n");

			// Close session
			session.close();
			
			log.info("\033[43m----------------- OUT create FamilyAccDao ----------------\033[0m\n");
		} catch (Exception e) {
			log.error("\033[45mProblème dans la création de FamilyAccDao : " + e + "\033[0m\n");
		}
	}

	@Override
	public void removeFamily(Long id) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		FamilyAcc loadFamily = session.load(FamilyAcc.class, id);

		if (loadFamily != null) {
			session.delete(loadFamily);
		}

		// Close session
		tx.commit();
		session.close();
	}

	@Override
	public void updateFamily(FamilyAcc f) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(f);

		// Close session
		tx.commit();
		session.close();
	}

	@Override
	public FamilyAcc findFamilyById(Long id) {
		Session session = this.sessionFactory.openSession();

		FamilyAcc family = session.load(FamilyAcc.class, id);
		return family;
	}

	@Override
	public List<FamilyAcc> findFamilyByCriteria(String criteria) {
		Session session = this.sessionFactory.openSession();
		List<FamilyAcc> listFamily = session
				.createQuery("select * from FamilyAcc" + " where criteria like %:param% ")
				.setParameter("param", criteria).list();

		session.close();

		return listFamily;
	}

	@Override
	public List<FamilyAcc> findAllFamily() {
		Session session = this.sessionFactory.openSession();
		List<FamilyAcc> familyList = session.createQuery("from FamilyAcc").list();
		session.close();
		return familyList;
	}

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
