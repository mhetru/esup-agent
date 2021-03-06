/**
 * ESUP-Portail Helpdesk - Copyright (c) 2004-2008 ESUP-Portail consortium.
 */
package org.esupportail.commons.exceptions;


/**
 * These exceptions are thrown when checking passwords.
 */
public class PasswordException extends Exception {

	/**
	 * The serialization id.
	 */
	private static final long serialVersionUID = -813820592087461051L;

	/**
	 * Constructor.
	 * @param message a message
	 */
	public PasswordException(
			final String message) {
		super(message);
	}

}
