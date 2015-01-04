package de.schindy.Exception;

import java.io.IOException;

public class ImageUploadException extends RuntimeException {

	public ImageUploadException(String s, IOException e) {
		super(s);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5778166710672968082L;

}
