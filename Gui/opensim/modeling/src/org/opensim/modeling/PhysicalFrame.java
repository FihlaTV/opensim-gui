/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PhysicalFrame extends Frame {
  private long swigCPtr;

  public PhysicalFrame(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.PhysicalFrame_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PhysicalFrame obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_PhysicalFrame(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PhysicalFrame safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.PhysicalFrame_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PhysicalFrame(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.PhysicalFrame_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.PhysicalFrame_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.PhysicalFrame_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PhysicalFrame(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.PhysicalFrame_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_WrapObjectSet(PhysicalFrame source) {
    opensimModelJNI.PhysicalFrame_copyProperty_WrapObjectSet(swigCPtr, this, PhysicalFrame.getCPtr(source), source);
  }

  public WrapObjectSet get_WrapObjectSet(int i) {
    return new WrapObjectSet(opensimModelJNI.PhysicalFrame_get_WrapObjectSet__SWIG_0(swigCPtr, this, i), false);
  }

  public WrapObjectSet upd_WrapObjectSet(int i) {
    return new WrapObjectSet(opensimModelJNI.PhysicalFrame_upd_WrapObjectSet__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_WrapObjectSet(int i, WrapObjectSet value) {
    opensimModelJNI.PhysicalFrame_set_WrapObjectSet__SWIG_0(swigCPtr, this, i, WrapObjectSet.getCPtr(value), value);
  }

  public int append_WrapObjectSet(WrapObjectSet value) {
    return opensimModelJNI.PhysicalFrame_append_WrapObjectSet(swigCPtr, this, WrapObjectSet.getCPtr(value), value);
  }

  public void constructProperty_WrapObjectSet(WrapObjectSet initValue) {
    opensimModelJNI.PhysicalFrame_constructProperty_WrapObjectSet(swigCPtr, this, WrapObjectSet.getCPtr(initValue), initValue);
  }

  public WrapObjectSet get_WrapObjectSet() {
    return new WrapObjectSet(opensimModelJNI.PhysicalFrame_get_WrapObjectSet__SWIG_1(swigCPtr, this), false);
  }

  public WrapObjectSet upd_WrapObjectSet() {
    return new WrapObjectSet(opensimModelJNI.PhysicalFrame_upd_WrapObjectSet__SWIG_1(swigCPtr, this), false);
  }

  public void set_WrapObjectSet(WrapObjectSet value) {
    opensimModelJNI.PhysicalFrame_set_WrapObjectSet__SWIG_1(swigCPtr, this, WrapObjectSet.getCPtr(value), value);
  }

  public int getMobilizedBodyIndex() {
    return opensimModelJNI.PhysicalFrame_getMobilizedBodyIndex(swigCPtr, this);
  }

  public SWIGTYPE_p_SimTK__MobilizedBody getMobilizedBody() {
    return new SWIGTYPE_p_SimTK__MobilizedBody(opensimModelJNI.PhysicalFrame_getMobilizedBody(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__MobilizedBody updMobilizedBody() {
    return new SWIGTYPE_p_SimTK__MobilizedBody(opensimModelJNI.PhysicalFrame_updMobilizedBody(swigCPtr, this), false);
  }

  public void scale(Vec3 aScaleFactors) {
    opensimModelJNI.PhysicalFrame_scale(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public WrapObject getWrapObject(String aName) {
    long cPtr = opensimModelJNI.PhysicalFrame_getWrapObject(swigCPtr, this, aName);
    return (cPtr == 0) ? null : new WrapObject(cPtr, false);
  }

  public WrapObjectSet getWrapObjectSet() {
    return new WrapObjectSet(opensimModelJNI.PhysicalFrame_getWrapObjectSet(swigCPtr, this), false);
  }

  public void addWrapObject(WrapObject wrapObject) {
    opensimModelJNI.PhysicalFrame_addWrapObject(swigCPtr, this, WrapObject.getCPtr(wrapObject), wrapObject);
  }

}
