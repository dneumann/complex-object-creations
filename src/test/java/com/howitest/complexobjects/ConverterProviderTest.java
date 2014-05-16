package com.howitest.complexobjects;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConverterProviderTest {

	@Test
	public void test() {
		ConverterProvider provider = new ConverterProvider();
		Converter converter = provider.createConverter("pdf");
		converter.convert(null, null);
		//assertThat()
	}

}
