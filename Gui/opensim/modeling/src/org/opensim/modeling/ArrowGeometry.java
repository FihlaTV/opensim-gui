/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrowGeometry extends LineGeometry {
  private long swigCPtr;

  public ArrowGeometry(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ArrowGeometry_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrowGeometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ArrowGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ArrowGeometry safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ArrowGeometry_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ArrowGeometry(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ArrowGeometry_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ArrowGeometry_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ArrowGeometry_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ArrowGeometry(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ArrowGeometry_getConcreteClassName(swigCPtr, this);
  }

  public ArrowGeometry(Vec3 aPoint1, Vec3 aUnitDirTo, double aLength) {
    this(opensimModelJNI.new_ArrowGeometry(Vec3.getCPtr(aPoint1), aPoint1, Vec3.getCPtr(aUnitDirTo), aUnitDirTo, aLength), true);
  }

  public void createDecorativeGeometry(ArrayDecorativeGeometry decoGeoms) {
    opensimModelJNI.ArrowGeometry_createDecorativeGeometry(swigCPtr, this, ArrayDecorativeGeometry.getCPtr(decoGeoms), decoGeoms);
  }

}
