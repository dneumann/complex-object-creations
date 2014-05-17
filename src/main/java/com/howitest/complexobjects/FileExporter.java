package com.howitest.complexobjects;


public class FileExporter {

	private ConverterProvider provider = new ConverterProvider();
	
	private String inputFile;
	private String outputFile;
	
	public FileExporter(String initInputFile, String initOutputFile) {
		inputFile = initInputFile;
		outputFile = initOutputFile;
	}
	
	//for unit tests
	void setConverterProvider(ConverterProvider newProvider) {
		provider = newProvider;
	}
	
	public void exportToFormat(String format) {
		Converter converter = provider.createConverter(format);
		converter.convert(inputFile, outputFile);
	}
}
