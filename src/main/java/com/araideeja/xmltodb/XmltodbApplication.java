package com.araideeja.xmltodb;





import java.io.File;
import java.io.InputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.araideeja.jpa.policy.Policy;
import com.araideeja.jpa.policy.PolicyXMLMapper;
import com.araideeja.jpa.policyPlan.PolicyPlan;
import com.araideeja.jpa.policyPlan.PolicyPlanXMLMapper;

@SpringBootApplication
public class XmltodbApplication implements CommandLineRunner {
	private Logger log = LoggerFactory.getLogger(XmltodbApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(XmltodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Resource resource = new ClassPathResource("policy.xml");
		InputStream input = resource.getInputStream();
		JAXBContext jaxbContext;
		try
		{
		    jaxbContext = JAXBContext.newInstance(PolicySetXMLMapper.class);             
		    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		    PolicySetXMLMapper policySet = (PolicySetXMLMapper) jaxbUnmarshaller.unmarshal(input);
		     
		    log.info(policySet.toString());
		    
		    List<PolicyXMLMapper> policyXMLs = policySet.getPolicies();
		    for (int i=0;i< policyXMLs.size();i++) {
		    	PolicyXMLMapper policyXML = policyXMLs.get(i);
		    	Policy policy = new Policy(policyXML.getPolicyCode());
		    	List<PolicyPlanXMLMapper> policyPlanXMLs = policyXML.getPolicyPlans();
		    	for (int j=0;j < policyPlanXMLs.size(); j++) {
		    		
		    	}
		    	
		    }
		}
		catch (JAXBException e)
		{
		    e.printStackTrace();
		}
	}
	
	

}
