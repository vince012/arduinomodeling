package org.gemoc.arduino.operationalsemantics;

import fr.obeo.dsl.arduino.BinaryIntegerExpression;
import java.util.Map;
import org.gemoc.arduino.operationalsemantics.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties;

@SuppressWarnings("all")
public class BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext {
  public final static BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext INSTANCE = new BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext();
  
  public static BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties getSelf(final BinaryIntegerExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.arduino.operationalsemantics.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BinaryIntegerExpression, BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties> map = new java.util.WeakHashMap<fr.obeo.dsl.arduino.BinaryIntegerExpression, org.gemoc.arduino.operationalsemantics.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties>();
  
  public Map<BinaryIntegerExpression, BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties> getMap() {
    return map;
  }
}
