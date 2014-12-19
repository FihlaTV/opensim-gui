/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter extends OpenSimObject {
  private long swigCPtr;

  public Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_specific_tension(Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter source) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_copyProperty_specific_tension(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public double get_specific_tension(int i) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_specific_tension__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_specific_tension(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_specific_tension__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_specific_tension(int i, double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_specific_tension__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_specific_tension(double value) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_append_specific_tension(swigCPtr, this, value);
  }

  public void constructProperty_specific_tension(double initValue) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_specific_tension(swigCPtr, this, initValue);
  }

  public double get_specific_tension() {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_specific_tension__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_specific_tension() {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_specific_tension__SWIG_1(swigCPtr, this), false);
  }

  public void set_specific_tension(double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_specific_tension__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_density(Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter source) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_copyProperty_density(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public double get_density(int i) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_density__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_density(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_density__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_density(int i, double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_density__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_density(double value) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_append_density(swigCPtr, this, value);
  }

  public void constructProperty_density(double initValue) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_density(swigCPtr, this, initValue);
  }

  public double get_density() {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_density__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_density() {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_density__SWIG_1(swigCPtr, this), false);
  }

  public void set_density(double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_density__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_ratio_slow_twitch_fibers(Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter source) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_copyProperty_ratio_slow_twitch_fibers(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public double get_ratio_slow_twitch_fibers(int i) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_ratio_slow_twitch_fibers__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_ratio_slow_twitch_fibers(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_ratio_slow_twitch_fibers__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_ratio_slow_twitch_fibers(int i, double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_ratio_slow_twitch_fibers__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_ratio_slow_twitch_fibers(double value) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_append_ratio_slow_twitch_fibers(swigCPtr, this, value);
  }

  public void constructProperty_ratio_slow_twitch_fibers(double initValue) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_ratio_slow_twitch_fibers(swigCPtr, this, initValue);
  }

  public double get_ratio_slow_twitch_fibers() {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_ratio_slow_twitch_fibers__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_ratio_slow_twitch_fibers() {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_ratio_slow_twitch_fibers__SWIG_1(swigCPtr, this), false);
  }

  public void set_ratio_slow_twitch_fibers(double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_ratio_slow_twitch_fibers__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_use_provided_muscle_mass(Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter source) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_copyProperty_use_provided_muscle_mass(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public boolean get_use_provided_muscle_mass(int i) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_use_provided_muscle_mass__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_use_provided_muscle_mass(int i) {
    return new SWIGTYPE_p_bool(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_use_provided_muscle_mass__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_use_provided_muscle_mass(int i, boolean value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_use_provided_muscle_mass__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_use_provided_muscle_mass(boolean value) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_append_use_provided_muscle_mass(swigCPtr, this, value);
  }

  public void constructProperty_use_provided_muscle_mass() {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_use_provided_muscle_mass__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_use_provided_muscle_mass(boolean initValue) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_use_provided_muscle_mass__SWIG_1(swigCPtr, this, initValue);
  }

  public boolean get_use_provided_muscle_mass() {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_use_provided_muscle_mass__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_use_provided_muscle_mass() {
    return new SWIGTYPE_p_bool(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_use_provided_muscle_mass__SWIG_1(swigCPtr, this), false);
  }

  public void set_use_provided_muscle_mass(boolean value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_use_provided_muscle_mass__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_provided_muscle_mass(Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter source) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_copyProperty_provided_muscle_mass(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public double get_provided_muscle_mass(int i) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_provided_muscle_mass__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_provided_muscle_mass(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_provided_muscle_mass__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_provided_muscle_mass(int i, double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_provided_muscle_mass__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_provided_muscle_mass(double value) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_append_provided_muscle_mass(swigCPtr, this, value);
  }

  public void constructProperty_provided_muscle_mass() {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_provided_muscle_mass__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_provided_muscle_mass(double initValue) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_provided_muscle_mass__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_provided_muscle_mass() {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_provided_muscle_mass__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_provided_muscle_mass() {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_provided_muscle_mass__SWIG_1(swigCPtr, this), false);
  }

  public void set_provided_muscle_mass(double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_provided_muscle_mass__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_activation_constant_slow_twitch(Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter source) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_copyProperty_activation_constant_slow_twitch(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public double get_activation_constant_slow_twitch(int i) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_activation_constant_slow_twitch__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_activation_constant_slow_twitch(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_activation_constant_slow_twitch__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_activation_constant_slow_twitch(int i, double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_activation_constant_slow_twitch__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_activation_constant_slow_twitch(double value) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_append_activation_constant_slow_twitch(swigCPtr, this, value);
  }

  public void constructProperty_activation_constant_slow_twitch(double initValue) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_activation_constant_slow_twitch(swigCPtr, this, initValue);
  }

  public double get_activation_constant_slow_twitch() {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_activation_constant_slow_twitch__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_activation_constant_slow_twitch() {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_activation_constant_slow_twitch__SWIG_1(swigCPtr, this), false);
  }

  public void set_activation_constant_slow_twitch(double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_activation_constant_slow_twitch__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_activation_constant_fast_twitch(Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter source) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_copyProperty_activation_constant_fast_twitch(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public double get_activation_constant_fast_twitch(int i) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_activation_constant_fast_twitch__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_activation_constant_fast_twitch(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_activation_constant_fast_twitch__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_activation_constant_fast_twitch(int i, double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_activation_constant_fast_twitch__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_activation_constant_fast_twitch(double value) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_append_activation_constant_fast_twitch(swigCPtr, this, value);
  }

  public void constructProperty_activation_constant_fast_twitch(double initValue) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_activation_constant_fast_twitch(swigCPtr, this, initValue);
  }

  public double get_activation_constant_fast_twitch() {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_activation_constant_fast_twitch__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_activation_constant_fast_twitch() {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_activation_constant_fast_twitch__SWIG_1(swigCPtr, this), false);
  }

  public void set_activation_constant_fast_twitch(double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_activation_constant_fast_twitch__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_maintenance_constant_slow_twitch(Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter source) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_copyProperty_maintenance_constant_slow_twitch(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public double get_maintenance_constant_slow_twitch(int i) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_maintenance_constant_slow_twitch__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_maintenance_constant_slow_twitch(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_maintenance_constant_slow_twitch__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_maintenance_constant_slow_twitch(int i, double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_maintenance_constant_slow_twitch__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_maintenance_constant_slow_twitch(double value) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_append_maintenance_constant_slow_twitch(swigCPtr, this, value);
  }

  public void constructProperty_maintenance_constant_slow_twitch(double initValue) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_maintenance_constant_slow_twitch(swigCPtr, this, initValue);
  }

  public double get_maintenance_constant_slow_twitch() {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_maintenance_constant_slow_twitch__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_maintenance_constant_slow_twitch() {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_maintenance_constant_slow_twitch__SWIG_1(swigCPtr, this), false);
  }

  public void set_maintenance_constant_slow_twitch(double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_maintenance_constant_slow_twitch__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_maintenance_constant_fast_twitch(Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter source) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_copyProperty_maintenance_constant_fast_twitch(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter.getCPtr(source), source);
  }

  public double get_maintenance_constant_fast_twitch(int i) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_maintenance_constant_fast_twitch__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_maintenance_constant_fast_twitch(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_maintenance_constant_fast_twitch__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_maintenance_constant_fast_twitch(int i, double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_maintenance_constant_fast_twitch__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_maintenance_constant_fast_twitch(double value) {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_append_maintenance_constant_fast_twitch(swigCPtr, this, value);
  }

  public void constructProperty_maintenance_constant_fast_twitch(double initValue) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_constructProperty_maintenance_constant_fast_twitch(swigCPtr, this, initValue);
  }

  public double get_maintenance_constant_fast_twitch() {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_get_maintenance_constant_fast_twitch__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_maintenance_constant_fast_twitch() {
    return new SWIGTYPE_p_double(opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_upd_maintenance_constant_fast_twitch__SWIG_1(swigCPtr, this), false);
  }

  public void set_maintenance_constant_fast_twitch(double value) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_set_maintenance_constant_fast_twitch__SWIG_1(swigCPtr, this, value);
  }

  public Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter() {
    this(opensimModelJNI.new_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter__SWIG_0(), true);
  }

  public Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter(String muscleName, double ratio_slow_twitch_fibers, double muscle_mass) {
    this(opensimModelJNI.new_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter__SWIG_1(muscleName, ratio_slow_twitch_fibers, muscle_mass), true);
  }

  public Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter(String muscleName, double ratio_slow_twitch_fibers) {
    this(opensimModelJNI.new_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter__SWIG_2(muscleName, ratio_slow_twitch_fibers), true);
  }

  public Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter(String muscleName, double ratio_slow_twitch_fibers, double activation_constant_slow_twitch, double activation_constant_fast_twitch, double maintenance_constant_slow_twitch, double maintenance_constant_fast_twitch, double muscle_mass) {
    this(opensimModelJNI.new_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter__SWIG_3(muscleName, ratio_slow_twitch_fibers, activation_constant_slow_twitch, activation_constant_fast_twitch, maintenance_constant_slow_twitch, maintenance_constant_fast_twitch, muscle_mass), true);
  }

  public Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter(String muscleName, double ratio_slow_twitch_fibers, double activation_constant_slow_twitch, double activation_constant_fast_twitch, double maintenance_constant_slow_twitch, double maintenance_constant_fast_twitch) {
    this(opensimModelJNI.new_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter__SWIG_4(muscleName, ratio_slow_twitch_fibers, activation_constant_slow_twitch, activation_constant_fast_twitch, maintenance_constant_slow_twitch, maintenance_constant_fast_twitch), true);
  }

  public double getMuscleMass() {
    return opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_getMuscleMass(swigCPtr, this);
  }

  public void setMuscleMass() {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_setMuscleMass(swigCPtr, this);
  }

  public Muscle getMuscle() {
    long cPtr = opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_getMuscle(swigCPtr, this);
    return (cPtr == 0) ? null : new Muscle(cPtr, false);
  }

  public void setMuscle(Muscle m) {
    opensimModelJNI.Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameter_setMuscle(swigCPtr, this, Muscle.getCPtr(m), m);
  }

}
