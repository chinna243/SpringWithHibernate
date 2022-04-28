package com.createiq.DAO;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.createiq.model.Employee;
@Transactional
public class EmployeeDao {
	
	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	//method to save employee  
	public void saveEmployee(Employee e){ 
		HibernateTemplate hb=new HibernateTemplate();
		hb.setCheckWriteOperations(false);
	//	hb.setSessionFactory(session);
	    template.save(e);  
	}  

}
