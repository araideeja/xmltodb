package com.araideeja.xmltodb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.araideeja.jpa.policy.PolicyXMLMapper;

@XmlRootElement(name = "PolicySet") 
@XmlAccessorType(XmlAccessType.FIELD)
public class PolicySetXMLMapper {

    @XmlElement(name="policy")
	private List<PolicyXMLMapper> policies;

	@Override
	public String toString() {
		return "PolicySet [policies=" + policies + "]";
	}

	public List<PolicyXMLMapper> getPolicies() {
		return policies;
	}

	public void setPolicies(List<PolicyXMLMapper> policies) {
		this.policies = policies;
	}
}
