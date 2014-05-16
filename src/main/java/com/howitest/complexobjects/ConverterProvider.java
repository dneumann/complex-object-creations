package com.howitest.complexobjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConverterProvider {

	public Converter createConverter(String format) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml");
		Converter converter = ac.getBean(format, Converter.class);

		return converter;

	}

}
