package com.infybank;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER3")
@IdClass(CustomerLoanPK.class)
public class CustomerLoan {
    @Id
    private Integer customerId;
    @Id
    private String loanId;
    private Double eligibleAmount;
    
    private Double availedAmount;
    private Float tenureInYears;
    
    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public String getLoanId() {
        return loanId;
    }
    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }
    public Double getEligibleAmount() {
        return eligibleAmount;
    }
    public void setEligibleAmount(Double eligibleAmount) {
        this.eligibleAmount = eligibleAmount;
    }
    public Double getAvailedAmount() {
        return availedAmount;
    }
    public void setAvailedAmount(Double availedAmount) {
        this.availedAmount= availedAmount;
    }
    public Float getTenureInYears() {
        return tenureInYears;
    }
    public void setTenureInYears(Float tenureInYears) {
        this. tenureInYears = tenureInYears;
    }
}
