package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.BooleanModuleGet;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties;

@SuppressWarnings("all")
public class BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectContext {
  public final static BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectContext INSTANCE = new BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectContext();
  
  public static BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties getSelf(final BooleanModuleGet _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanModuleGet, BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.BooleanModuleGet, org.gemoc.arduino.operationalsemantics.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties>();
  
  public Map<BooleanModuleGet, BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties> getMap() {
    return map;
  }
}
