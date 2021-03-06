/*******************************************************************************
 * Copyright (c) 2013 Angelo ZERR.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:      
 *     Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 *******************************************************************************/
package codemirror.eclipse.swt;

/**
 * CodeMirror validator.
 * 
 */
public interface IValidator {

	/**
	 * Validate the given code and returns a JSON array with the error.
	 * 
	 * @param code
	 * @return
	 */
	String validate(String code);

	/**
	 * Returns true if validator is asynchronous and false otherwise.
	 * 
	 * @return
	 */
	boolean isAsync();
}
