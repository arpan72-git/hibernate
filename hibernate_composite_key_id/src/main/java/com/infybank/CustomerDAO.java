package com.infybank;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerDAO implements CPKCustomerDAO{

	//@Override
	public Integer addCustomerLoanDetails(CustomerLoan custLoan) {
		// TODO Auto-generated method stub
		SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(custLoan);
        tx.commit();
        session.close();
		return null;
	}

//	@Override
	public CustomerLoan getCustomerLoanDetails(Integer cid, String lid) {
		// TODO Auto-generated method stub
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println("here");
        Session session = factory.openSession();
        System.out.println("here1");
        CustomerLoanPK pk = new CustomerLoanPK();
        pk.setCustomerId(cid);
        pk.setLoanId(lid);
        CustomerLoan custLoan= (CustomerLoan) session.get(CustomerLoan.class, pk);
        session.close();
		return custLoan;
	}
}
