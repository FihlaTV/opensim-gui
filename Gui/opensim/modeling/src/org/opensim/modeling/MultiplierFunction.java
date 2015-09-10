/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MultiplierFunction extends Function {
  private long swigCPtr;

  public MultiplierFunction(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.MultiplierFunction_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MultiplierFunction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_MultiplierFunction(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MultiplierFunction safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.MultiplierFunction_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MultiplierFunction(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.MultiplierFunction_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.MultiplierFunction_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.MultiplierFunction_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MultiplierFunction(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.MultiplierFunction_getConcreteClassName(swigCPtr, this);
  }

  public MultiplierFunction() {
    this(opensimModelJNI.new_MultiplierFunction__SWIG_0(), true);
  }

  public MultiplierFunction(Function aFunction) {
    this(opensimModelJNI.new_MultiplierFunction__SWIG_1(Function.getCPtr(aFunction), aFunction), true);
  }

  public MultiplierFunction(Function aFunction, double aScaleFactor) {
    this(opensimModelJNI.new_MultiplierFunction__SWIG_2(Function.getCPtr(aFunction), aFunction, aScaleFactor), true);
  }

  public MultiplierFunction(MultiplierFunction aFunction) {
    this(opensimModelJNI.new_MultiplierFunction__SWIG_3(MultiplierFunction.getCPtr(aFunction), aFunction), true);
  }

  public void init(Function aFunction) {
    opensimModelJNI.MultiplierFunction_init(swigCPtr, this, Function.getCPtr(aFunction), aFunction);
  }

  public void setFunction(Function aFunction) {
    opensimModelJNI.MultiplierFunction_setFunction(swigCPtr, this, Function.getCPtr(aFunction), aFunction);
  }

  public void setScale(double aScaleFactor) {
    opensimModelJNI.MultiplierFunction_setScale(swigCPtr, this, aScaleFactor);
  }

  public Function getFunction() {
    long cPtr = opensimModelJNI.MultiplierFunction_getFunction(swigCPtr, this);
    return (cPtr == 0) ? null : new Function(cPtr, false);
  }

  public double getScale() {
    return opensimModelJNI.MultiplierFunction_getScale(swigCPtr, this);
  }

  public double calcValue(Vector x) {
    return opensimModelJNI.MultiplierFunction_calcValue(swigCPtr, this, Vector.getCPtr(x), x);
  }

  public double calcDerivative(StdVecInt derivComponents, Vector x) {
    return opensimModelJNI.MultiplierFunction_calcDerivative(swigCPtr, this, StdVecInt.getCPtr(derivComponents), derivComponents, Vector.getCPtr(x), x);
  }

  public int getArgumentSize() {
    return opensimModelJNI.MultiplierFunction_getArgumentSize(swigCPtr, this);
  }

  public int getMaxDerivativeOrder() {
    return opensimModelJNI.MultiplierFunction_getMaxDerivativeOrder(swigCPtr, this);
  }

  public SWIGTYPE_p_SimTK__Function createSimTKFunction() {
    long cPtr = opensimModelJNI.MultiplierFunction_createSimTKFunction(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SimTK__Function(cPtr, false);
  }

}
