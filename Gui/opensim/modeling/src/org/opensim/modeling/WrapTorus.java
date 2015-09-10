/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class WrapTorus extends WrapObject {
  private long swigCPtr;

  public WrapTorus(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.WrapTorus_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WrapTorus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_WrapTorus(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WrapTorus safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.WrapTorus_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WrapTorus(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.WrapTorus_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.WrapTorus_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.WrapTorus_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapTorus(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.WrapTorus_getConcreteClassName(swigCPtr, this);
  }

  public WrapTorus() {
    this(opensimModelJNI.new_WrapTorus__SWIG_0(), true);
  }

  public WrapTorus(WrapTorus aWrapTorus) {
    this(opensimModelJNI.new_WrapTorus__SWIG_1(WrapTorus.getCPtr(aWrapTorus), aWrapTorus), true);
  }

  public void copyData(WrapTorus aWrapTorus) {
    opensimModelJNI.WrapTorus_copyData(swigCPtr, this, WrapTorus.getCPtr(aWrapTorus), aWrapTorus);
  }

  public String getWrapTypeName() {
    return opensimModelJNI.WrapTorus_getWrapTypeName(swigCPtr, this);
  }

  public String getDimensionsString() {
    return opensimModelJNI.WrapTorus_getDimensionsString(swigCPtr, this);
  }

  public double getInnerRadius() {
    return opensimModelJNI.WrapTorus_getInnerRadius(swigCPtr, this);
  }

  public double getOuterRadius() {
    return opensimModelJNI.WrapTorus_getOuterRadius(swigCPtr, this);
  }

  public void scale(Vec3 aScaleFactors) {
    opensimModelJNI.WrapTorus_scale(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public void connectToModelAndBody(Model aModel, PhysicalFrame aBody) {
    opensimModelJNI.WrapTorus_connectToModelAndBody(swigCPtr, this, Model.getCPtr(aModel), aModel, PhysicalFrame.getCPtr(aBody), aBody);
  }

}
