/*
Copyright (c) 2011  Source Allies

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation version 3.0.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, please visit 
http://www.gnu.org/licenses/lgpl-3.0.txt.
 */

package com.sourceallies.beanoh.exception;

/**
 * Signals that the same bean definition exists multiple times in the Spring
 * context files.
 * 
 * @author David Kessler
 * 
 */
public class DuplicateBeanDefinitionException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a DuplicateBeanDefinitionException with the specified detail
	 * message. A detail message is a String that describes this particular
	 * exception.
	 * 
	 * @param message
	 *            the String that contains a detailed message
	 */
	public DuplicateBeanDefinitionException(String message) {
		super(message);
	}
}
