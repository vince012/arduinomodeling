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
package fr.obeo.dsl.arduino.impl;

import fr.obeo.dsl.arduino.ArduinoDigitalModule;
import fr.obeo.dsl.arduino.ArduinoModule;
import fr.obeo.dsl.arduino.ArduinoPackage;
import fr.obeo.dsl.arduino.Module;
import fr.obeo.dsl.arduino.NamedElement;
import fr.obeo.dsl.arduino.PushButton;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Push Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PushButtonImpl extends ArduinoDigitalModuleImpl implements PushButton {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.PUSH_BUTTON;
	}

} //PushButtonImpl
