package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.Project;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.Project_ExecutableAspectProjectAspectProperties;

@SuppressWarnings("all")
public class Project_ExecutableAspectProjectAspectContext {
  public final static Project_ExecutableAspectProjectAspectContext INSTANCE = new Project_ExecutableAspectProjectAspectContext();
  
  public static Project_ExecutableAspectProjectAspectProperties getSelf(final Project _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.Project_ExecutableAspectProjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Project, Project_ExecutableAspectProjectAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.Project, org.gemoc.arduino.operationalsemantics.Project_ExecutableAspectProjectAspectProperties>();
  
  public Map<Project, Project_ExecutableAspectProjectAspectProperties> getMap() {
    return map;
  }
}
