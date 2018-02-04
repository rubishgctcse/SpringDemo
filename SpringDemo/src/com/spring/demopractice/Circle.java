package com.spring.demopractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;

public class Circle implements Shape {
	private Point center;
	
	@Autowired
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default drawing message", null));
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is: (" + center.getX() + ", " + center.getY() + ")");
		System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
	}

	public Point getCenter() {
		return center;
	}

	@Autowired
	public void setCenter(@Qualifier("circleRelated") Point center) {
		this.center = center;
	}
	
}
