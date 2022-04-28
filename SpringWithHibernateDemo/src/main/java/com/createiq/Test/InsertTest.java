package com.createiq.Test;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import com.createiq.DAO.EmployeeDao;
import com.createiq.model.Employee;  
  
public class InsertTest {  
public static void main(String[] args) {  
      
    Resource r=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    EmployeeDao dao=(EmployeeDao)factory.getBean("d");
    
      
    Employee e=new Employee();  
    e.setId(114);  
    e.setName("varun");  
    e.setSalary(50000);  
      
    dao.saveEmployee(e);  
      
}  
}  
