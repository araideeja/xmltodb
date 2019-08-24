package com.araideeja.jpa.policy;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.araideeja.jpa.policyPlan.PolicyPlanXMLMapper;

import javax.xml.bind.annotation.XmlAccessType;



@XmlAccessorType(XmlAccessType.FIELD)
public class PolicyXMLMapper {
	private String policyCode;
	@XmlElementWrapper(name="Plans")
    @XmlElement(name="Plan")
	private List<PolicyPlanXMLMapper> policyPlans;
	public String getPolicyCode() {
		return policyCode;
	}
	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}
	public List<PolicyPlanXMLMapper> getPolicyPlans() {
		return policyPlans;
	}
	public void setPolicyPlans(List<PolicyPlanXMLMapper> policyPlans) {
		this.policyPlans = policyPlans;
	}
	@Override
	public String toString() {
		return "PolicyXMLMapper [policyCode=" + policyCode + ", policyPlans=" + policyPlans + "]";
	}
}
