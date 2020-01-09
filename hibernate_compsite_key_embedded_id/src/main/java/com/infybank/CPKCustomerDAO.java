package com.infybank;

public interface CPKCustomerDAO {
	public Integer addCustomerLoanDetails(CustomerLoan custLoan);
	public CustomerLoan getCustomerLoanDetails(Integer cid, String lid);
}
