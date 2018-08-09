package com.itc.dao;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUser;
import com.hibernate.util.HibernateUtil;
import com.itc.beans.User;


public class UserDAO {
	public static boolean validate(String name,String pass)
	{	
		
		User user= getUserByUserId(name);
		if(user!=null && user.getName().equals(name) && user.getPassword().equals(pass)){
            return true;
        }else{ 
            return false;
        }
	
	}
	
	public static User getUserByUserId(String name) {
		Session session=HibernateUser.openSession();
        Transaction tx = null;
        User user = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            TypedQuery<User> query = session.createQuery("from User where name='"+name+"'");
            user = (User)query.getSingleResult();
            System.out.println("got username from db "+user.getName());
            tx.commit();
        } catch (Exception e) {
        	if(user==null)
        	{
        		return null;
        	}
           System.out.println("Wrong username/password");
        } finally {
            session.close();
        }
        return user;
    }
	
	
}
