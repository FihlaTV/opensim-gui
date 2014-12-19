/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class WrapCylinderObst extends WrapObject {
  private long swigCPtr;

  public WrapCylinderObst(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.WrapCylinderObst_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WrapCylinderObst obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_WrapCylinderObst(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WrapCylinderObst safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.WrapCylinderObst_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WrapCylinderObst(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.WrapCylinderObst_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.WrapCylinderObst_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.WrapCylinderObst_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapCylinderObst(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.WrapCylinderObst_getConcreteClassName(swigCPtr, this);
  }

  public WrapCylinderObst() {
    this(opensimModelJNI.new_WrapCylinderObst__SWIG_0(), true);
  }

  public WrapCylinderObst(WrapCylinderObst aWrapCylinderObst) {
    this(opensimModelJNI.new_WrapCylinderObst__SWIG_1(WrapCylinderObst.getCPtr(aWrapCylinderObst), aWrapCylinderObst), true);
  }

  public void copyData(WrapCylinderObst aWrapCylinderObst) {
    opensimModelJNI.WrapCylinderObst_copyData(swigCPtr, this, WrapCylinderObst.getCPtr(aWrapCylinderObst), aWrapCylinderObst);
  }

  public double getRadius() {
    return opensimModelJNI.WrapCylinderObst_getRadius(swigCPtr, this);
  }

  public void setRadius(double aRadius) {
    opensimModelJNI.WrapCylinderObst_setRadius(swigCPtr, this, aRadius);
  }

  public double getLength() {
    return opensimModelJNI.WrapCylinderObst_getLength(swigCPtr, this);
  }

  public void setLength(double aLength) {
    opensimModelJNI.WrapCylinderObst_setLength(swigCPtr, this, aLength);
  }

  public int getWrapDirection() {
    return opensimModelJNI.WrapCylinderObst_getWrapDirection(swigCPtr, this);
  }

  public String getWrapTypeName() {
    return opensimModelJNI.WrapCylinderObst_getWrapTypeName(swigCPtr, this);
  }

  public String getDimensionsString() {
    return opensimModelJNI.WrapCylinderObst_getDimensionsString(swigCPtr, this);
  }

  public void scale(Vec3 aScaleFactors) {
    opensimModelJNI.WrapCylinderObst_scale(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public void connectToModelAndBody(Model aModel, Body aBody) {
    opensimModelJNI.WrapCylinderObst_connectToModelAndBody(swigCPtr, this, Model.getCPtr(aModel), aModel, Body.getCPtr(aBody), aBody);
  }

}
