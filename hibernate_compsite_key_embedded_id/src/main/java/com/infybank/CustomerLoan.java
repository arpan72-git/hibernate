package com.infybank;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Customer4")
public class CustomerLoan {
    @EmbeddedId
    private CustomerLoanPK pk;
    private Double eligibleAmount;
    private Double availedAmount;
    private Float tenureInYears;
    
    public CustomerLoanPK getPk() {
		return pk;
	}
	public void setPk(CustomerLoanPK pk) {
		this.pk = pk;
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
