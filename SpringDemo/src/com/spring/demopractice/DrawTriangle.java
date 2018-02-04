package com.spring.demopractice;

import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.io.FileSystemResource;

public class DrawTriangle {

	public static void main(String[] args) {
		//FileSystemResource resource = new FileSystemResource("Spring.xml");
		//@SuppressWarnings("deprecation")
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		//Shape shape = (Shape) context.getBean( "shape");
		//shape.draw();
		Shape shape = (Circle) context.getBean("circle");
		shape.draw();
		
		context.getMessage("greeting", null, "Default Greeting", null);
	}
}
