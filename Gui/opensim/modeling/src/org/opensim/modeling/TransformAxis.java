/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TransformAxis extends OpenSimObject {
  private long swigCPtr;

  public TransformAxis(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.TransformAxis_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TransformAxis obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_TransformAxis(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static TransformAxis safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.TransformAxis_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new TransformAxis(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.TransformAxis_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.TransformAxis_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.TransformAxis_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TransformAxis(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.TransformAxis_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_coordinates(TransformAxis source) {
    opensimModelJNI.TransformAxis_copyProperty_coordinates(swigCPtr, this, TransformAxis.getCPtr(source), source);
  }

  public String get_coordinates(int i) {
    return opensimModelJNI.TransformAxis_get_coordinates(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_coordinates(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.TransformAxis_upd_coordinates(swigCPtr, this, i), false);
  }

  public void set_coordinates(int i, String value) {
    opensimModelJNI.TransformAxis_set_coordinates(swigCPtr, this, i, value);
  }

  public int append_coordinates(String value) {
    return opensimModelJNI.TransformAxis_append_coordinates(swigCPtr, this, value);
  }

  public void constructProperty_coordinates() {
    opensimModelJNI.TransformAxis_constructProperty_coordinates(swigCPtr, this);
  }

  public void copyProperty_axis(TransformAxis source) {
    opensimModelJNI.TransformAxis_copyProperty_axis(swigCPtr, this, TransformAxis.getCPtr(source), source);
  }

  public Vec3 get_axis(int i) {
    return new Vec3(opensimModelJNI.TransformAxis_get_axis__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_axis(int i) {
    return new Vec3(opensimModelJNI.TransformAxis_upd_axis__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_axis(int i, Vec3 value) {
    opensimModelJNI.TransformAxis_set_axis__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_axis(Vec3 value) {
    return opensimModelJNI.TransformAxis_append_axis(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_axis(Vec3 initValue) {
    opensimModelJNI.TransformAxis_constructProperty_axis(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_axis() {
    return new Vec3(opensimModelJNI.TransformAxis_get_axis__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_axis() {
    return new Vec3(opensimModelJNI.TransformAxis_upd_axis__SWIG_1(swigCPtr, this), false);
  }

  public void set_axis(Vec3 value) {
    opensimModelJNI.TransformAxis_set_axis__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_function(TransformAxis source) {
    opensimModelJNI.TransformAxis_copyProperty_function(swigCPtr, this, TransformAxis.getCPtr(source), source);
  }

  public Function get_function(int i) {
    return new Function(opensimModelJNI.TransformAxis_get_function__SWIG_0(swigCPtr, this, i), false);
  }

  public Function upd_function(int i) {
    return new Function(opensimModelJNI.TransformAxis_upd_function__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_function(int i, Function value) {
    opensimModelJNI.TransformAxis_set_function__SWIG_0(swigCPtr, this, i, Function.getCPtr(value), value);
  }

  public int append_function(Function value) {
    return opensimModelJNI.TransformAxis_append_function(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void constructProperty_function(Function initValue) {
    opensimModelJNI.TransformAxis_constructProperty_function(swigCPtr, this, Function.getCPtr(initValue), initValue);
  }

  public Function get_function() {
    return new Function(opensimModelJNI.TransformAxis_get_function__SWIG_1(swigCPtr, this), false);
  }

  public Function upd_function() {
    return new Function(opensimModelJNI.TransformAxis_upd_function__SWIG_1(swigCPtr, this), false);
  }

  public void set_function(Function value) {
    opensimModelJNI.TransformAxis_set_function__SWIG_1(swigCPtr, this, Function.getCPtr(value), value);
  }

  public TransformAxis() {
    this(opensimModelJNI.new_TransformAxis__SWIG_0(), true);
  }

  public TransformAxis(ArrayStr coordNames, Vec3 axis) {
    this(opensimModelJNI.new_TransformAxis__SWIG_1(ArrayStr.getCPtr(coordNames), coordNames, Vec3.getCPtr(axis), axis), true);
  }

  public TransformAxis(SWIGTYPE_p_SimTK__Xml__Element node) {
    this(opensimModelJNI.new_TransformAxis__SWIG_2(SWIGTYPE_p_SimTK__Xml__Element.getCPtr(node)), true);
  }

  public void setCoordinateNames(ArrayStr coordNames) {
    opensimModelJNI.TransformAxis_setCoordinateNames(swigCPtr, this, ArrayStr.getCPtr(coordNames), coordNames);
  }

  public PropertyString getCoordinateNames() {
    return new PropertyString(opensimModelJNI.TransformAxis_getCoordinateNames(swigCPtr, this), false);
  }

  public ArrayStr getCoordinateNamesInArray() {
    return new ArrayStr(opensimModelJNI.TransformAxis_getCoordinateNamesInArray(swigCPtr, this), true);
  }

  public void setAxis(Vec3 axis) {
    opensimModelJNI.TransformAxis_setAxis(swigCPtr, this, Vec3.getCPtr(axis), axis);
  }

  public Vec3 getAxis() {
    return new Vec3(opensimModelJNI.TransformAxis_getAxis__SWIG_0(swigCPtr, this), false);
  }

  public void getAxis(Vec3 axis) {
    opensimModelJNI.TransformAxis_getAxis__SWIG_1(swigCPtr, this, Vec3.getCPtr(axis), axis);
  }

  public void getAxis(double[] rAxis) {
    opensimModelJNI.TransformAxis_getAxis__SWIG_2(swigCPtr, this, rAxis);
  }

  public double getAxis(int which) {
    return opensimModelJNI.TransformAxis_getAxis__SWIG_3(swigCPtr, this, which);
  }

  public boolean hasFunction() {
    return opensimModelJNI.TransformAxis_hasFunction(swigCPtr, this);
  }

  public Function getFunction() {
    return new Function(opensimModelJNI.TransformAxis_getFunction(swigCPtr, this), false);
  }

  public Function updFunction() {
    return new Function(opensimModelJNI.TransformAxis_updFunction(swigCPtr, this), false);
  }

  public void setFunction(Function function) {
    opensimModelJNI.TransformAxis_setFunction__SWIG_0(swigCPtr, this, Function.getCPtr(function), function);
  }

  public Joint getJoint() {
    return new Joint(opensimModelJNI.TransformAxis_getJoint(swigCPtr, this), false);
  }

  public double getValue(State s) {
    return opensimModelJNI.TransformAxis_getValue(swigCPtr, this, State.getCPtr(s), s);
  }

  public void connectToJoint(Joint owningJoint) {
    opensimModelJNI.TransformAxis_connectToJoint(swigCPtr, this, Joint.getCPtr(owningJoint), owningJoint);
  }

}
