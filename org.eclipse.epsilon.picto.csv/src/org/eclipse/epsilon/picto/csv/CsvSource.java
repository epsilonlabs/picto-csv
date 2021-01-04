package org.eclipse.epsilon.picto.csv;

import org.eclipse.epsilon.picto.source.VerbatimSource;

public class CsvSource extends VerbatimSource {

	@Override
	public String getFormat() {
		return getFileExtension();
	}

	@Override
	public String getFileExtension() {
		return "csv";
	}
}
