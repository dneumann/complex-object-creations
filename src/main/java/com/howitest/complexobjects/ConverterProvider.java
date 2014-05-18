package com.howitest.complexobjects;

public class ConverterProvider {

	public Converter createConverter(String format) {
		if ("pdf".equals(format)) {
			Converter pdfConverter = new TxtToPdfConverter();
			// make a lot of configurations
			return pdfConverter;
		} else if ("epub".equals(format)) {
			Converter epubConverter = new TxtToEpubConverter();
			// make a lot of configurations
			return epubConverter;
		} else {
			throw new RuntimeException("Unexpected argument: " + format);
		}
	}

}
