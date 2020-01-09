package com.infybank;

import java.util.Scanner;

import org.hibernate.HibernateException;
public class UserInterface {
    public static void main(String[] args) {
    	 CustomerDAO customerdao = new CustomerDAO();
         try {
        	 //asdasd
        	 //dadada
        	 //dfwe
             System.out.println("Enter the Customer Loan details");
             //ewwr
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
             custLoan.setCustomerId(cid);
             custLoan.setLoanId(lid);
             customerdao.addCustomerLoanDetails(custLoan);
             System.out.println("One record created");
             
             CustomerLoan customerLoan = (CustomerLoan) customerdao.getCustomerLoanDetails(5003,"103");
             System.out.println("One record retrieved"+ customerLoan.getLoanId()+" "+customerLoan.getCustomerId());
             sc.close();

         } catch (HibernateException e) {
             System.out.print(e);
         }
         catch (Exception e) {
             System.out.print(e);
         }
    }
}
