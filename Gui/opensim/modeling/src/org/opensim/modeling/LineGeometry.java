/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class LineGeometry extends Geometry {
  private long swigCPtr;

  public LineGeometry(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.LineGeometry_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(LineGeometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_LineGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static LineGeometry safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.LineGeometry_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new LineGeometry(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.LineGeometry_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.LineGeometry_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.LineGeometry_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new LineGeometry(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.LineGeometry_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_start_point(LineGeometry source) {
    opensimModelJNI.LineGeometry_copyProperty_start_point(swigCPtr, this, LineGeometry.getCPtr(source), source);
  }

  public Vec3 get_start_point(int i) {
    return new Vec3(opensimModelJNI.LineGeometry_get_start_point__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_start_point(int i) {
    return new Vec3(opensimModelJNI.LineGeometry_upd_start_point__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_start_point(int i, Vec3 value) {
    opensimModelJNI.LineGeometry_set_start_point__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_start_point(Vec3 value) {
    return opensimModelJNI.LineGeometry_append_start_point(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_start_point(Vec3 initValue) {
    opensimModelJNI.LineGeometry_constructProperty_start_point(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_start_point() {
    return new Vec3(opensimModelJNI.LineGeometry_get_start_point__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_start_point() {
    return new Vec3(opensimModelJNI.LineGeometry_upd_start_point__SWIG_1(swigCPtr, this), false);
  }

  public void set_start_point(Vec3 value) {
    opensimModelJNI.LineGeometry_set_start_point__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_end_point(LineGeometry source) {
    opensimModelJNI.LineGeometry_copyProperty_end_point(swigCPtr, this, LineGeometry.getCPtr(source), source);
  }

  public Vec3 get_end_point(int i) {
    return new Vec3(opensimModelJNI.LineGeometry_get_end_point__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_end_point(int i) {
    return new Vec3(opensimModelJNI.LineGeometry_upd_end_point__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_end_point(int i, Vec3 value) {
    opensimModelJNI.LineGeometry_set_end_point__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_end_point(Vec3 value) {
    return opensimModelJNI.LineGeometry_append_end_point(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_end_point(Vec3 initValue) {
    opensimModelJNI.LineGeometry_constructProperty_end_point(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_end_point() {
    return new Vec3(opensimModelJNI.LineGeometry_get_end_point__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_end_point() {
    return new Vec3(opensimModelJNI.LineGeometry_upd_end_point__SWIG_1(swigCPtr, this), false);
  }

  public void set_end_point(Vec3 value) {
    opensimModelJNI.LineGeometry_set_end_point__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public LineGeometry(Vec3 aPoint1, Vec3 aPoint2) {
    this(opensimModelJNI.new_LineGeometry__SWIG_0(Vec3.getCPtr(aPoint1), aPoint1, Vec3.getCPtr(aPoint2), aPoint2), true);
  }

  public LineGeometry() {
    this(opensimModelJNI.new_LineGeometry__SWIG_1(), true);
  }

  public void getPoints(Vec3 rPoint1, Vec3 rPoint2) {
    opensimModelJNI.LineGeometry_getPoints(swigCPtr, this, Vec3.getCPtr(rPoint1), rPoint1, Vec3.getCPtr(rPoint2), rPoint2);
  }

  public void setPoints(Vec3 aPoint1, Vec3 aPoint2) {
    opensimModelJNI.LineGeometry_setPoints(swigCPtr, this, Vec3.getCPtr(aPoint1), aPoint1, Vec3.getCPtr(aPoint2), aPoint2);
  }

  public void createDecorativeGeometry(ArrayDecorativeGeometry decoGeoms) {
    opensimModelJNI.LineGeometry_createDecorativeGeometry(swigCPtr, this, ArrayDecorativeGeometry.getCPtr(decoGeoms), decoGeoms);
  }

}
