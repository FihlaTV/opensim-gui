/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Coordinate extends ModelComponent {
  private long swigCPtr;

  public Coordinate(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Coordinate_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Coordinate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Coordinate(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Coordinate safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Coordinate_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Coordinate(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Coordinate_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Coordinate_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Coordinate_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Coordinate(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Coordinate_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_motion_type(Coordinate source) {
    opensimModelJNI.Coordinate_copyProperty_motion_type(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public String get_motion_type(int i) {
    return opensimModelJNI.Coordinate_get_motion_type__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_motion_type(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.Coordinate_upd_motion_type__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_motion_type(int i, String value) {
    opensimModelJNI.Coordinate_set_motion_type__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_motion_type(String value) {
    return opensimModelJNI.Coordinate_append_motion_type(swigCPtr, this, value);
  }

  public void constructProperty_motion_type(String initValue) {
    opensimModelJNI.Coordinate_constructProperty_motion_type(swigCPtr, this, initValue);
  }

  public String get_motion_type() {
    return opensimModelJNI.Coordinate_get_motion_type__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_motion_type() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.Coordinate_upd_motion_type__SWIG_1(swigCPtr, this), false);
  }

  public void set_motion_type(String value) {
    opensimModelJNI.Coordinate_set_motion_type__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_default_value(Coordinate source) {
    opensimModelJNI.Coordinate_copyProperty_default_value(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public double get_default_value(int i) {
    return opensimModelJNI.Coordinate_get_default_value__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_default_value(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Coordinate_upd_default_value__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_default_value(int i, double value) {
    opensimModelJNI.Coordinate_set_default_value__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_default_value(double value) {
    return opensimModelJNI.Coordinate_append_default_value(swigCPtr, this, value);
  }

  public void constructProperty_default_value(double initValue) {
    opensimModelJNI.Coordinate_constructProperty_default_value(swigCPtr, this, initValue);
  }

  public double get_default_value() {
    return opensimModelJNI.Coordinate_get_default_value__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_default_value() {
    return new SWIGTYPE_p_double(opensimModelJNI.Coordinate_upd_default_value__SWIG_1(swigCPtr, this), false);
  }

  public void set_default_value(double value) {
    opensimModelJNI.Coordinate_set_default_value__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_default_speed_value(Coordinate source) {
    opensimModelJNI.Coordinate_copyProperty_default_speed_value(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public double get_default_speed_value(int i) {
    return opensimModelJNI.Coordinate_get_default_speed_value__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_default_speed_value(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Coordinate_upd_default_speed_value__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_default_speed_value(int i, double value) {
    opensimModelJNI.Coordinate_set_default_speed_value__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_default_speed_value(double value) {
    return opensimModelJNI.Coordinate_append_default_speed_value(swigCPtr, this, value);
  }

  public void constructProperty_default_speed_value(double initValue) {
    opensimModelJNI.Coordinate_constructProperty_default_speed_value(swigCPtr, this, initValue);
  }

  public double get_default_speed_value() {
    return opensimModelJNI.Coordinate_get_default_speed_value__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_default_speed_value() {
    return new SWIGTYPE_p_double(opensimModelJNI.Coordinate_upd_default_speed_value__SWIG_1(swigCPtr, this), false);
  }

  public void set_default_speed_value(double value) {
    opensimModelJNI.Coordinate_set_default_speed_value__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_range(Coordinate source) {
    opensimModelJNI.Coordinate_copyProperty_range(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public double get_range(int i) {
    return opensimModelJNI.Coordinate_get_range(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_range(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Coordinate_upd_range(swigCPtr, this, i), false);
  }

  public void set_range(int i, double value) {
    opensimModelJNI.Coordinate_set_range(swigCPtr, this, i, value);
  }

  public int append_range(double value) {
    return opensimModelJNI.Coordinate_append_range(swigCPtr, this, value);
  }

  public void copyProperty_clamped(Coordinate source) {
    opensimModelJNI.Coordinate_copyProperty_clamped(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public boolean get_clamped(int i) {
    return opensimModelJNI.Coordinate_get_clamped__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_clamped(int i) {
    return new SWIGTYPE_p_bool(opensimModelJNI.Coordinate_upd_clamped__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_clamped(int i, boolean value) {
    opensimModelJNI.Coordinate_set_clamped__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_clamped(boolean value) {
    return opensimModelJNI.Coordinate_append_clamped(swigCPtr, this, value);
  }

  public void constructProperty_clamped(boolean initValue) {
    opensimModelJNI.Coordinate_constructProperty_clamped(swigCPtr, this, initValue);
  }

  public boolean get_clamped() {
    return opensimModelJNI.Coordinate_get_clamped__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_clamped() {
    return new SWIGTYPE_p_bool(opensimModelJNI.Coordinate_upd_clamped__SWIG_1(swigCPtr, this), false);
  }

  public void set_clamped(boolean value) {
    opensimModelJNI.Coordinate_set_clamped__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_locked(Coordinate source) {
    opensimModelJNI.Coordinate_copyProperty_locked(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public boolean get_locked(int i) {
    return opensimModelJNI.Coordinate_get_locked__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_locked(int i) {
    return new SWIGTYPE_p_bool(opensimModelJNI.Coordinate_upd_locked__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_locked(int i, boolean value) {
    opensimModelJNI.Coordinate_set_locked__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_locked(boolean value) {
    return opensimModelJNI.Coordinate_append_locked(swigCPtr, this, value);
  }

  public void constructProperty_locked(boolean initValue) {
    opensimModelJNI.Coordinate_constructProperty_locked(swigCPtr, this, initValue);
  }

  public boolean get_locked() {
    return opensimModelJNI.Coordinate_get_locked__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_locked() {
    return new SWIGTYPE_p_bool(opensimModelJNI.Coordinate_upd_locked__SWIG_1(swigCPtr, this), false);
  }

  public void set_locked(boolean value) {
    opensimModelJNI.Coordinate_set_locked__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_prescribed_function(Coordinate source) {
    opensimModelJNI.Coordinate_copyProperty_prescribed_function(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public Function get_prescribed_function(int i) {
    return new Function(opensimModelJNI.Coordinate_get_prescribed_function__SWIG_0(swigCPtr, this, i), false);
  }

  public Function upd_prescribed_function(int i) {
    return new Function(opensimModelJNI.Coordinate_upd_prescribed_function__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_prescribed_function(int i, Function value) {
    opensimModelJNI.Coordinate_set_prescribed_function__SWIG_0(swigCPtr, this, i, Function.getCPtr(value), value);
  }

  public int append_prescribed_function(Function value) {
    return opensimModelJNI.Coordinate_append_prescribed_function(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void constructProperty_prescribed_function() {
    opensimModelJNI.Coordinate_constructProperty_prescribed_function__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_prescribed_function(Function initValue) {
    opensimModelJNI.Coordinate_constructProperty_prescribed_function__SWIG_1(swigCPtr, this, Function.getCPtr(initValue), initValue);
  }

  public Function get_prescribed_function() {
    return new Function(opensimModelJNI.Coordinate_get_prescribed_function__SWIG_1(swigCPtr, this), false);
  }

  public Function upd_prescribed_function() {
    return new Function(opensimModelJNI.Coordinate_upd_prescribed_function__SWIG_1(swigCPtr, this), false);
  }

  public void set_prescribed_function(Function value) {
    opensimModelJNI.Coordinate_set_prescribed_function__SWIG_1(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void copyProperty_prescribed(Coordinate source) {
    opensimModelJNI.Coordinate_copyProperty_prescribed(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public boolean get_prescribed(int i) {
    return opensimModelJNI.Coordinate_get_prescribed__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_prescribed(int i) {
    return new SWIGTYPE_p_bool(opensimModelJNI.Coordinate_upd_prescribed__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_prescribed(int i, boolean value) {
    opensimModelJNI.Coordinate_set_prescribed__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_prescribed(boolean value) {
    return opensimModelJNI.Coordinate_append_prescribed(swigCPtr, this, value);
  }

  public void constructProperty_prescribed(boolean initValue) {
    opensimModelJNI.Coordinate_constructProperty_prescribed(swigCPtr, this, initValue);
  }

  public boolean get_prescribed() {
    return opensimModelJNI.Coordinate_get_prescribed__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_prescribed() {
    return new SWIGTYPE_p_bool(opensimModelJNI.Coordinate_upd_prescribed__SWIG_1(swigCPtr, this), false);
  }

  public void set_prescribed(boolean value) {
    opensimModelJNI.Coordinate_set_prescribed__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_is_free_to_satisfy_constraints(Coordinate source) {
    opensimModelJNI.Coordinate_copyProperty_is_free_to_satisfy_constraints(swigCPtr, this, Coordinate.getCPtr(source), source);
  }

  public boolean get_is_free_to_satisfy_constraints(int i) {
    return opensimModelJNI.Coordinate_get_is_free_to_satisfy_constraints__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_is_free_to_satisfy_constraints(int i) {
    return new SWIGTYPE_p_bool(opensimModelJNI.Coordinate_upd_is_free_to_satisfy_constraints__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_is_free_to_satisfy_constraints(int i, boolean value) {
    opensimModelJNI.Coordinate_set_is_free_to_satisfy_constraints__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_is_free_to_satisfy_constraints(boolean value) {
    return opensimModelJNI.Coordinate_append_is_free_to_satisfy_constraints(swigCPtr, this, value);
  }

  public void constructProperty_is_free_to_satisfy_constraints(boolean initValue) {
    opensimModelJNI.Coordinate_constructProperty_is_free_to_satisfy_constraints(swigCPtr, this, initValue);
  }

  public boolean get_is_free_to_satisfy_constraints() {
    return opensimModelJNI.Coordinate_get_is_free_to_satisfy_constraints__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_is_free_to_satisfy_constraints() {
    return new SWIGTYPE_p_bool(opensimModelJNI.Coordinate_upd_is_free_to_satisfy_constraints__SWIG_1(swigCPtr, this), false);
  }

  public void set_is_free_to_satisfy_constraints(boolean value) {
    opensimModelJNI.Coordinate_set_is_free_to_satisfy_constraints__SWIG_1(swigCPtr, this, value);
  }

  public Joint getJoint() {
    return new Joint(opensimModelJNI.Coordinate_getJoint(swigCPtr, this), false);
  }

  public Coordinate.MotionType getMotionType() {
    return Coordinate.MotionType.swigToEnum(opensimModelJNI.Coordinate_getMotionType(swigCPtr, this));
  }

  public void setMotionType(Coordinate.MotionType aMotionType) {
    opensimModelJNI.Coordinate_setMotionType(swigCPtr, this, aMotionType.swigValue());
  }

  public double getValue(State s) {
    return opensimModelJNI.Coordinate_getValue(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setValue(State s, double aValue, boolean aEnforceContraints) {
    opensimModelJNI.Coordinate_setValue__SWIG_0(swigCPtr, this, State.getCPtr(s), s, aValue, aEnforceContraints);
  }

  public void setValue(State s, double aValue) {
    opensimModelJNI.Coordinate_setValue__SWIG_1(swigCPtr, this, State.getCPtr(s), s, aValue);
  }

  public double getSpeedValue(State s) {
    return opensimModelJNI.Coordinate_getSpeedValue(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setSpeedValue(State s, double aValue) {
    opensimModelJNI.Coordinate_setSpeedValue(swigCPtr, this, State.getCPtr(s), s, aValue);
  }

  public String getSpeedName() {
    return opensimModelJNI.Coordinate_getSpeedName(swigCPtr, this);
  }

  public double getDefaultValue() {
    return opensimModelJNI.Coordinate_getDefaultValue(swigCPtr, this);
  }

  public void setDefaultValue(double aDefaultValue) {
    opensimModelJNI.Coordinate_setDefaultValue(swigCPtr, this, aDefaultValue);
  }

  public double getDefaultSpeedValue() {
    return opensimModelJNI.Coordinate_getDefaultSpeedValue(swigCPtr, this);
  }

  public void setDefaultSpeedValue(double aDefaultSpeedValue) {
    opensimModelJNI.Coordinate_setDefaultSpeedValue(swigCPtr, this, aDefaultSpeedValue);
  }

  public double getAccelerationValue(State s) {
    return opensimModelJNI.Coordinate_getAccelerationValue(swigCPtr, this, State.getCPtr(s), s);
  }

  public boolean getClamped(State s) {
    return opensimModelJNI.Coordinate_getClamped(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setClamped(State s, boolean aLocked) {
    opensimModelJNI.Coordinate_setClamped(swigCPtr, this, State.getCPtr(s), s, aLocked);
  }

  public boolean getDefaultClamped() {
    return opensimModelJNI.Coordinate_getDefaultClamped(swigCPtr, this);
  }

  public void setDefaultClamped(boolean aClamped) {
    opensimModelJNI.Coordinate_setDefaultClamped(swigCPtr, this, aClamped);
  }

  public double getRangeMin() {
    return opensimModelJNI.Coordinate_getRangeMin(swigCPtr, this);
  }

  public double getRangeMax() {
    return opensimModelJNI.Coordinate_getRangeMax(swigCPtr, this);
  }

  public void setRange(double[] aRange) {
    opensimModelJNI.Coordinate_setRange(swigCPtr, this, aRange);
  }

  public void setRangeMin(double aMin) {
    opensimModelJNI.Coordinate_setRangeMin(swigCPtr, this, aMin);
  }

  public void setRangeMax(double aMax) {
    opensimModelJNI.Coordinate_setRangeMax(swigCPtr, this, aMax);
  }

  public boolean getLocked(State s) {
    return opensimModelJNI.Coordinate_getLocked(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setLocked(State s, boolean aLocked) {
    opensimModelJNI.Coordinate_setLocked(swigCPtr, this, State.getCPtr(s), s, aLocked);
  }

  public boolean getDefaultLocked() {
    return opensimModelJNI.Coordinate_getDefaultLocked(swigCPtr, this);
  }

  public void setDefaultLocked(boolean aLocked) {
    opensimModelJNI.Coordinate_setDefaultLocked(swigCPtr, this, aLocked);
  }

  public boolean isPrescribed(State s) {
    return opensimModelJNI.Coordinate_isPrescribed(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setIsPrescribed(State s, boolean isPrescribed) {
    opensimModelJNI.Coordinate_setIsPrescribed(swigCPtr, this, State.getCPtr(s), s, isPrescribed);
  }

  public boolean getDefaultIsPrescribed() {
    return opensimModelJNI.Coordinate_getDefaultIsPrescribed(swigCPtr, this);
  }

  public void setDefaultIsPrescribed(boolean isPrescribed) {
    opensimModelJNI.Coordinate_setDefaultIsPrescribed(swigCPtr, this, isPrescribed);
  }

  public void setPrescribedFunction(Function function) {
    opensimModelJNI.Coordinate_setPrescribedFunction(swigCPtr, this, Function.getCPtr(function), function);
  }

  public Function getPrescribedFunction() {
    return new Function(opensimModelJNI.Coordinate_getPrescribedFunction(swigCPtr, this), false);
  }

  public boolean isDependent(State s) {
    return opensimModelJNI.Coordinate_isDependent(swigCPtr, this, State.getCPtr(s), s);
  }

  public boolean isConstrained(State s) {
    return opensimModelJNI.Coordinate_isConstrained(swigCPtr, this, State.getCPtr(s), s);
  }

  public int getMobilizerQIndex() {
    return opensimModelJNI.Coordinate_getMobilizerQIndex(swigCPtr, this);
  }

  public int getBodyIndex() {
    return opensimModelJNI.Coordinate_getBodyIndex(swigCPtr, this);
  }

  public Coordinate() {
    this(opensimModelJNI.new_Coordinate__SWIG_0(), true);
  }

  public Coordinate(String aName, Coordinate.MotionType aMotionType, double defualtValue, double aRangeMin, double aRangeMax) {
    this(opensimModelJNI.new_Coordinate__SWIG_1(aName, aMotionType.swigValue(), defualtValue, aRangeMin, aRangeMax), true);
  }

  public final static class MotionType {
    public final static Coordinate.MotionType Rotational = new Coordinate.MotionType("Rotational");
    public final static Coordinate.MotionType Translational = new Coordinate.MotionType("Translational");
    public final static Coordinate.MotionType Coupled = new Coordinate.MotionType("Coupled");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static MotionType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + MotionType.class + " with value " + swigValue);
    }

    private MotionType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private MotionType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private MotionType(String swigName, MotionType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static MotionType[] swigValues = { Rotational, Translational, Coupled };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
