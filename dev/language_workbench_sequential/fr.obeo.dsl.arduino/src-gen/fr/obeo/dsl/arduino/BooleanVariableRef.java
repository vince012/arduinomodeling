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
 * A representation of the model object '<em><b>Boolean Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.dsl.arduino.BooleanVariableRef#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.dsl.arduino.ArduinoPackage#getBooleanVariableRef()
 * @model
 * @generated
 */
public interface BooleanVariableRef extends VariableRef, BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(BooleanVariable)
	 * @see fr.obeo.dsl.arduino.ArduinoPackage#getBooleanVariableRef_Variable()
	 * @model required="true"
	 * @generated
	 */
	BooleanVariable getVariable();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.arduino.BooleanVariableRef#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(BooleanVariable value);

} // BooleanVariableRef
