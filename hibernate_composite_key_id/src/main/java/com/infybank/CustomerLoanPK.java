package com.infybank;

import java.io.Serializable;
//
@SuppressWarnings("serial")
public class CustomerLoanPK implements Serializable {
    private Integer customerId;
    private String loanId;
    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }
    public String getLoanId() {
        return loanId;
    }
}
