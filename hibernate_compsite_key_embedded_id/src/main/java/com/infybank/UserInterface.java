package com.infybank;

import java.util.Scanner;

import org.hibernate.HibernateException;
public class UserInterface {
    public static void main(String[] args) {
    	 CustomerDAO customerdao = new CustomerDAO();
         try {
             System.out.println("Enter the Customer Loan details");
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the Customer Id");
             Integer cid = sc.nextInt();
             System.out.println("Enter the Loan Id");
             String lid = sc.next();
             System.out.println("Enter the Eligible Amount");
             Double eligibleAmount = sc.nextDouble();
             System.out.println("Enter the Availed Amount");
             Double availedAmount = sc.nextDouble();
             System.out.println("Enter the Tenure In Years");
             Float tenureInYears = sc.nextFloat();
             CustomerLoan custLoan = new CustomerLoan();
             custLoan.setEligibleAmount(eligibleAmount);
             custLoan.setAvailedAmount(availedAmount);
             custLoan.setTenureInYears(tenureInYears);
             CustomerLoanPK customerLoanPK= new CustomerLoanPK();
             customerLoanPK.setCustomerId(cid);
             customerLoanPK.setLoanId(lid);
             custLoan.setPk(customerLoanPK);    
             customerdao.addCustomerLoanDetails(custLoan);
             System.out.println("One record created");
             sc.close();
             CustomerLoan custloan = customerdao.getCustomerLoanDetails(5003, "103");
             System.out.println("Custid: "+custloan.getPk().getCustomerId()+" Loanid: "+custloan.getPk().getLoanId());
             

         } catch (HibernateException e) {
             System.out.print(e);
         }
         catch (Exception e) {
             System.out.print(e);
         }
    }
}
