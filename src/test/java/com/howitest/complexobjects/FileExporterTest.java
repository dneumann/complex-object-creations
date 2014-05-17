package com.howitest.complexobjects;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class FileExporterTest {

	private ConverterProvider providerMock;
	private Converter converterMock;
	private FileExporter exporterSut;

	@Before
	public void beforeEachTest() {
		providerMock = mock(ConverterProvider.class);
		converterMock = mock(Converter.class);
		when(providerMock.createConverter(anyString())).thenReturn(converterMock);
		
		exporterSut = new FileExporter();
		exporterSut.setConverterProvider(providerMock);
	}
	
	@Test
	public void shouldCallMocksProperly() {
		exporterSut.inputFile = "/tmp/input.txt";
		exporterSut.outputFile = "/tmp/output.pdf";
		
		exporterSut.exportToFormat("pdf");
		
		verify(providerMock).createConverter("pdf");
		verify(converterMock).convert("/tmp/input.txt", "/tmp/output.pdf");
	}

}
