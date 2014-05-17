package com.howitest.complexobjects;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class ConverterProviderTest {

	private ConverterProvider providerSut;

	@Before
	public void beforeEachTest() {
		providerSut = new ConverterProvider();
	}
	
	@Test
	public void shouldProvidePdfConverter() {
		Converter converter = providerSut.createConverter("pdf");
		assertThat(converter, instanceOf(TxtToPdfConverter.class));
	}

	@Test
	public void shouldProvideEpubConverter() {
		Converter converter = providerSut.createConverter("epub");
		assertThat(converter, instanceOf(TxtToEpubConverter.class));
	}

}
