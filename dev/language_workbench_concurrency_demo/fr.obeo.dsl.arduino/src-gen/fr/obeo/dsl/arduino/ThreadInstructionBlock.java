/**
 *  Copyright (c) 2013 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Obeo - initial API and implementation
 */
package fr.obeo.dsl.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread Instruction Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.ThreadInstructionBlock#getThread <em>Thread</em>}</li>
 *   <li>{@link fr.obeo.dsl.arduino.ThreadInstructionBlock#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.arduino.ArduinoPackage#getThreadInstructionBlock()
 * @model abstract="true"
 * @generated
 */
public interface ThreadInstructionBlock extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Thread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread</em>' reference.
	 * @see #setThread(fr.obeo.dsl.arduino.Thread)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getThreadInstructionBlock_Thread()
	 * @model
	 * @generated
	 */
	fr.obeo.dsl.arduino.Thread getThread();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.ThreadInstructionBlock#getThread <em>Thread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread</em>' reference.
	 * @see #getThread()
	 * @generated
	 */
	void setThread(fr.obeo.dsl.arduino.Thread value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(ThreadInstructionBlock)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getThreadInstructionBlock_Next()
	 * @model
	 * @generated
	 */
	ThreadInstructionBlock getNext();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.ThreadInstructionBlock#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(ThreadInstructionBlock value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // ThreadInstructionBlock
