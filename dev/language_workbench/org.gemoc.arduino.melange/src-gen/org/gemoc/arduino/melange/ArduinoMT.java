package org.gemoc.arduino.melange;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.arduino.melange.arduinomt.arduino.ArduinoFactory;

@SuppressWarnings("all")
public interface ArduinoMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ArduinoFactory getFactory();
  
  public abstract void save(final String uri) throws IOException;
}
