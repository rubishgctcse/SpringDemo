package com.spring.demopractice;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware, Shape {
	
	private String type;
	private int height;
	private ApplicationContext context = null;
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() +  " Triangle drawn "  + getHeight());
		System.out.println("Point A = (" + pointA.getX() +", " + pointA.getY() + ")");
		System.out.println("Point A = (" + pointB.getX() +", " + pointB.getY() + ")");
		System.out.println("Point A = (" + pointC.getX() +", " + pointC.getY() + ")");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}
	
	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is " + beanName);
	}
}
