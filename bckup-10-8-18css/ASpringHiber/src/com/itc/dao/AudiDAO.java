package com.itc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.util.HibernateUtil;
import com.itc.beans.Audi;





public class AudiDAO {


	public List<Audi> getAllEvents()
	{
		List<Audi> list=new ArrayList<Audi>();
		Session session=HibernateUtil.openSession();
		Transaction tx=null;
		try {
			tx = session.getTransaction();
			tx.begin();
			list = session.createQuery("from Audi").list();                        
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}


		return list;
	}

	public List<Audi> getEventsByName(String category)
	{
		List<Audi> list=new ArrayList<Audi>();
		Session session=HibernateUtil.openSession();
		Transaction tx=null;
		try {
			tx = session.getTransaction();
			tx.begin();
			list = session.createQuery("from Audi where category='"+category+"'").list();                        
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}


		return list;
	}


	public Audi getEventBean(int eventid)
	{
		Audi audi=null;
		Session session=HibernateUtil.openSession();
		Transaction tx=null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from Audi where eventid='"+eventid+"'");

			audi = (Audi)query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}


		return audi;

	}


	public boolean update(Audi a,int qty){


		if(qty>a.getQuantity()||qty<1)
		{
			return false;
		}

		a.setQuantity(a.getQuantity()-qty);

		Session session = HibernateUtil.openSession();
		Transaction tx = null;	
		try {
			tx = session.getTransaction();
			tx.begin();
			session.saveOrUpdate(a);		
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}	
		return true;


	}

}
