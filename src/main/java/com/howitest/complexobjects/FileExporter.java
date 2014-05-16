package com.howitest.complexobjects;

import java.io.File;

public class FileExporter {

	private ConverterProvider provider = new ConverterProvider();
	private Converter converter;
	
	public File inputFile;
	public File outputFile;
	
	//for unit tests
	void setConverterProvider(ConverterProvider newProvider) {
		provider = newProvider;
	}
	
	public void exportToFormat(String format) {
		converter = provider.createConverter(format);
		converter.convert(inputFile, outputFile);
	}
}
