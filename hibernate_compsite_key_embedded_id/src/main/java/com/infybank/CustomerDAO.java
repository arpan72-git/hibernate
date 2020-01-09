package com.infybank;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerDAO implements CPKCustomerDAO{

//	@Override
	public Integer addCustomerLoanDetails(CustomerLoan custLoan) {
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
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        CustomerLoanPK pk = new CustomerLoanPK();
        pk.setCustomerId(cid);
        pk.setLoanId(lid);
        CustomerLoan custLoan= (CustomerLoan) session.load(CustomerLoan.class, pk);
        session.close();
		return custLoan;
	}
}
