package com.howitest.complexobjects;


public class FileExporter {

	private ConverterProvider provider = new ConverterProvider();
	
	public String inputFile;
	public String outputFile;
	
	//for unit tests
	void setConverterProvider(ConverterProvider newProvider) {
		provider = newProvider;
	}
	
	public void exportToFormat(String format) {
		Converter converter = provider.createConverter(format);
		converter.convert(inputFile, outputFile);
	}
}
