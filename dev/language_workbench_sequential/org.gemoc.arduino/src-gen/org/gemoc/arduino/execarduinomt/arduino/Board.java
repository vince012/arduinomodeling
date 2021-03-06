/**
 */
package org.gemoc.arduino.execarduinomt.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.arduino.execarduinomt.arduino.Board#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.arduino.execarduinomt.arduino.ArduinoPackage#getBoard()
 * @model abstract="true"
 * @generated
 */
public interface Board extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.arduino.execarduinomt.arduino.Project#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see org.gemoc.arduino.execarduinomt.arduino.ArduinoPackage#getBoard_Project()
	 * @see org.gemoc.arduino.execarduinomt.arduino.Project#getBoard
	 * @model opposite="board" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link org.gemoc.arduino.execarduinomt.arduino.Board#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

} // Board
