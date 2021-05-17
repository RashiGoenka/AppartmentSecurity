package com.cg.aps.exception;


public class RecordNotFoundException extends Exception
{

	public RecordNotFoundException() {
		super();

	}

	/**
	 * @param msg
	 *            error message
	 */
	public RecordNotFoundException(String msg) {
		super(msg);

	}
}
