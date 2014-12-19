/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class WeldJoint extends Joint {
  private long swigCPtr;

  public WeldJoint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.WeldJoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WeldJoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_WeldJoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WeldJoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.WeldJoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WeldJoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.WeldJoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.WeldJoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.WeldJoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WeldJoint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.WeldJoint_getConcreteClassName(swigCPtr, this);
  }

  public WeldJoint() {
    this(opensimModelJNI.new_WeldJoint__SWIG_0(), true);
  }

  public WeldJoint(String name, Body parent, Vec3 locationInParent, Vec3 orientationInParent, Body child, Vec3 locationInchild, Vec3 orientationInChild, boolean reverse) {
    this(opensimModelJNI.new_WeldJoint__SWIG_1(name, Body.getCPtr(parent), parent, Vec3.getCPtr(locationInParent), locationInParent, Vec3.getCPtr(orientationInParent), orientationInParent, Body.getCPtr(child), child, Vec3.getCPtr(locationInchild), locationInchild, Vec3.getCPtr(orientationInChild), orientationInChild, reverse), true);
  }

  public WeldJoint(String name, Body parent, Vec3 locationInParent, Vec3 orientationInParent, Body child, Vec3 locationInchild, Vec3 orientationInChild) {
    this(opensimModelJNI.new_WeldJoint__SWIG_2(name, Body.getCPtr(parent), parent, Vec3.getCPtr(locationInParent), locationInParent, Vec3.getCPtr(orientationInParent), orientationInParent, Body.getCPtr(child), child, Vec3.getCPtr(locationInchild), locationInchild, Vec3.getCPtr(orientationInChild), orientationInChild), true);
  }

  public int numCoordinates() {
    return opensimModelJNI.WeldJoint_numCoordinates(swigCPtr, this);
  }

}
