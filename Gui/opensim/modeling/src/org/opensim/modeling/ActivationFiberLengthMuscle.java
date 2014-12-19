/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ActivationFiberLengthMuscle extends Muscle {
  private long swigCPtr;

  public ActivationFiberLengthMuscle(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ActivationFiberLengthMuscle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ActivationFiberLengthMuscle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ActivationFiberLengthMuscle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ActivationFiberLengthMuscle safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ActivationFiberLengthMuscle_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ActivationFiberLengthMuscle(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ActivationFiberLengthMuscle_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ActivationFiberLengthMuscle_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ActivationFiberLengthMuscle_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ActivationFiberLengthMuscle(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ActivationFiberLengthMuscle_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_default_activation(ActivationFiberLengthMuscle source) {
    opensimModelJNI.ActivationFiberLengthMuscle_copyProperty_default_activation(swigCPtr, this, ActivationFiberLengthMuscle.getCPtr(source), source);
  }

  public double get_default_activation(int i) {
    return opensimModelJNI.ActivationFiberLengthMuscle_get_default_activation__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_default_activation(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ActivationFiberLengthMuscle_upd_default_activation__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_default_activation(int i, double value) {
    opensimModelJNI.ActivationFiberLengthMuscle_set_default_activation__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_default_activation(double value) {
    return opensimModelJNI.ActivationFiberLengthMuscle_append_default_activation(swigCPtr, this, value);
  }

  public void constructProperty_default_activation(double initValue) {
    opensimModelJNI.ActivationFiberLengthMuscle_constructProperty_default_activation(swigCPtr, this, initValue);
  }

  public double get_default_activation() {
    return opensimModelJNI.ActivationFiberLengthMuscle_get_default_activation__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_default_activation() {
    return new SWIGTYPE_p_double(opensimModelJNI.ActivationFiberLengthMuscle_upd_default_activation__SWIG_1(swigCPtr, this), false);
  }

  public void set_default_activation(double value) {
    opensimModelJNI.ActivationFiberLengthMuscle_set_default_activation__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_default_fiber_length(ActivationFiberLengthMuscle source) {
    opensimModelJNI.ActivationFiberLengthMuscle_copyProperty_default_fiber_length(swigCPtr, this, ActivationFiberLengthMuscle.getCPtr(source), source);
  }

  public double get_default_fiber_length(int i) {
    return opensimModelJNI.ActivationFiberLengthMuscle_get_default_fiber_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_default_fiber_length(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ActivationFiberLengthMuscle_upd_default_fiber_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_default_fiber_length(int i, double value) {
    opensimModelJNI.ActivationFiberLengthMuscle_set_default_fiber_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_default_fiber_length(double value) {
    return opensimModelJNI.ActivationFiberLengthMuscle_append_default_fiber_length(swigCPtr, this, value);
  }

  public void constructProperty_default_fiber_length(double initValue) {
    opensimModelJNI.ActivationFiberLengthMuscle_constructProperty_default_fiber_length(swigCPtr, this, initValue);
  }

  public double get_default_fiber_length() {
    return opensimModelJNI.ActivationFiberLengthMuscle_get_default_fiber_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_default_fiber_length() {
    return new SWIGTYPE_p_double(opensimModelJNI.ActivationFiberLengthMuscle_upd_default_fiber_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_default_fiber_length(double value) {
    opensimModelJNI.ActivationFiberLengthMuscle_set_default_fiber_length__SWIG_1(swigCPtr, this, value);
  }

  public double getDefaultActivation() {
    return opensimModelJNI.ActivationFiberLengthMuscle_getDefaultActivation(swigCPtr, this);
  }

  public void setDefaultActivation(double activation) {
    opensimModelJNI.ActivationFiberLengthMuscle_setDefaultActivation(swigCPtr, this, activation);
  }

  public double getDefaultFiberLength() {
    return opensimModelJNI.ActivationFiberLengthMuscle_getDefaultFiberLength(swigCPtr, this);
  }

  public void setDefaultFiberLength(double length) {
    opensimModelJNI.ActivationFiberLengthMuscle_setDefaultFiberLength(swigCPtr, this, length);
  }

  public void setActivation(State s, double activation) {
    opensimModelJNI.ActivationFiberLengthMuscle_setActivation(swigCPtr, this, State.getCPtr(s), s, activation);
  }

  public void setFiberLength(State s, double fiberLength) {
    opensimModelJNI.ActivationFiberLengthMuscle_setFiberLength(swigCPtr, this, State.getCPtr(s), s, fiberLength);
  }

  public double getActivationRate(State s) {
    return opensimModelJNI.ActivationFiberLengthMuscle_getActivationRate(swigCPtr, this, State.getCPtr(s), s);
  }

}
