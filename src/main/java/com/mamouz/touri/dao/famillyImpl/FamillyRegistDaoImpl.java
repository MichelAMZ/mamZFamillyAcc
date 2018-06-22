/**
 * 
 */
package com.mamouz.touri.dao.famillyImpl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.mamouz.touri.dao.entity.f_Famille.Familly_register;
import com.mamouz.touri.dao.entity.f_Famille.FamilyAcc;
import com.mamouz.touri.dao.interfaces.IFamilly_Register;

/**
 * @author famille AMOUZOU
 *
 */
@Repository("family_RegisterDao")
public class FamillyRegistDaoImpl implements IFamilly_Register {

	@Resource(name = "hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;

	private static final Logger log = Logger.getLogger(Familly_register.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mamouz.touri.dao.interfaces.IFamilly_Register#addFamily(com.mamouz.
	 * touri.dao.entity.f_Famille.Familly_register)
	 */
	@Override
	public void addFamily(Familly_register f) {
		try {
			log.info("\033[43m----------------- IN create Familly_register ----------------\033[0m\n");
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(f);

			tx.commit();
			log.debug("\033[42mFamilly_register créer avec succès : " + f + "\033[0m\n");

			// Close session
			session.close();

			log.info("\033[43m----------------- OUT create Familly_register ----------------\033[0m\n");
		} catch (Exception e) {
			log.error("\033[45mProblème dans la création de Familly_register : " + e + "\033[0m\n");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mamouz.touri.dao.interfaces.IFamilly_Register#removeFamily(java.lang.
	 * Long)
	 */
	@Override
	public void removeFamily(Long id) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Familly_register loadFamily = session.load(Familly_register.class, id);

		if (loadFamily != null) {
			session.delete(loadFamily);
		}

		// Close session
		tx.commit();
		session.close();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mamouz.touri.dao.interfaces.IFamilly_Register#updateFamily(com.mamouz
	 * .touri.dao.entity.f_Famille.Familly_register)
	 */
	@Override
	public void updateFamily(Familly_register f) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(f);

		// Close session
		tx.commit();
		session.close();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mamouz.touri.dao.interfaces.IFamilly_Register#findFamilyById(java.
	 * lang.Long)
	 */
	@Override
	public Familly_register findFamilyById(Long id) {
		Session session = this.sessionFactory.openSession();

		Familly_register family = session.load(Familly_register.class, id);
		return family;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mamouz.touri.dao.interfaces.IFamilly_Register#findFamilyByCriteria(
	 * java.lang.String)
	 */
	@Override
	public List<Familly_register> findFamilyByCriteria(String criteria) {
		Session session = this.sessionFactory.openSession();
		
		List<Familly_register> listFamily = session
				.createQuery("select * from Familly_register" + "	where criteria like %:param% ")
				.setParameter("param", criteria).list();

		session.close();

		return listFamily;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mamouz.touri.dao.interfaces.IFamilly_Register#findAllFamily()
	 */
	@Override
	public List<Familly_register> findAllFamily() {
		Session session = this.sessionFactory.openSession();
		List<Familly_register> familyList = session.createQuery("from Familly_register").list();
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
