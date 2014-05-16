package com.howitest.complexobjects;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConverterProvider {

	public Converter createConverter(String format) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Converter converter = context.getBean(format, Converter.class);
		context.close();
		return converter;
	}

}
