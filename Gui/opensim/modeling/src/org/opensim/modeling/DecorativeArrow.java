/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DecorativeArrow extends DecorativeGeometry {
  private long swigCPtr;

  public DecorativeArrow(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.DecorativeArrow_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(DecorativeArrow obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_DecorativeArrow(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DecorativeArrow(Vec3 startPoint, Vec3 endPoint, double tipLength) {
    this(opensimModelJNI.new_DecorativeArrow__SWIG_0(Vec3.getCPtr(startPoint), startPoint, Vec3.getCPtr(endPoint), endPoint, tipLength), true);
  }

  public DecorativeArrow(Vec3 startPoint, Vec3 endPoint) {
    this(opensimModelJNI.new_DecorativeArrow__SWIG_1(Vec3.getCPtr(startPoint), startPoint, Vec3.getCPtr(endPoint), endPoint), true);
  }

  public DecorativeArrow(Vec3 startPoint) {
    this(opensimModelJNI.new_DecorativeArrow__SWIG_2(Vec3.getCPtr(startPoint), startPoint), true);
  }

  public DecorativeArrow() {
    this(opensimModelJNI.new_DecorativeArrow__SWIG_3(), true);
  }

  public Vec3 getStartPoint() {
    return new Vec3(opensimModelJNI.DecorativeArrow_getStartPoint(swigCPtr, this), false);
  }

  public Vec3 getEndPoint() {
    return new Vec3(opensimModelJNI.DecorativeArrow_getEndPoint(swigCPtr, this), false);
  }

  public double getTipLength() {
    return opensimModelJNI.DecorativeArrow_getTipLength(swigCPtr, this);
  }

  public DecorativeArrow setStartPoint(Vec3 start) {
    return new DecorativeArrow(opensimModelJNI.DecorativeArrow_setStartPoint(swigCPtr, this, Vec3.getCPtr(start), start), false);
  }

  public DecorativeArrow setEndPoint(Vec3 end) {
    return new DecorativeArrow(opensimModelJNI.DecorativeArrow_setEndPoint(swigCPtr, this, Vec3.getCPtr(end), end), false);
  }

  public DecorativeArrow setTipLength(double arg0) {
    return new DecorativeArrow(opensimModelJNI.DecorativeArrow_setTipLength(swigCPtr, this, arg0), false);
  }

  public DecorativeArrow setBodyId(int b) {
    return new DecorativeArrow(opensimModelJNI.DecorativeArrow_setBodyId(swigCPtr, this, b), false);
  }

  public DecorativeArrow setIndexOnBody(int x) {
    return new DecorativeArrow(opensimModelJNI.DecorativeArrow_setIndexOnBody(swigCPtr, this, x), false);
  }

  public DecorativeArrow setUserRef(SWIGTYPE_p_void p) {
    return new DecorativeArrow(opensimModelJNI.DecorativeArrow_setUserRef(swigCPtr, this, SWIGTYPE_p_void.getCPtr(p)), false);
  }

  public DecorativeArrow setTransform(Transform X_BD) {
    return new DecorativeArrow(opensimModelJNI.DecorativeArrow_setTransform(swigCPtr, this, Transform.getCPtr(X_BD), X_BD), false);
  }

  public DecorativeArrow setResolution(double r) {
    return new DecorativeArrow(opensimModelJNI.DecorativeArrow_setResolution(swigCPtr, this, r), false);
  }

  public DecorativeArrow setScaleFactors(Vec3 s) {
    return new DecorativeArrow(opensimModelJNI.DecorativeArrow_setScaleFactors(swigCPtr, this, Vec3.getCPtr(s), s), false);
  }

  public DecorativeArrow setColor(Vec3 rgb) {
    return new DecorativeArrow(opensimModelJNI.DecorativeArrow_setColor(swigCPtr, this, Vec3.getCPtr(rgb), rgb), false);
  }

  public DecorativeArrow setOpacity(double o) {
    return new DecorativeArrow(opensimModelJNI.DecorativeArrow_setOpacity(swigCPtr, this, o), false);
  }

  public DecorativeArrow setLineThickness(double t) {
    return new DecorativeArrow(opensimModelJNI.DecorativeArrow_setLineThickness(swigCPtr, this, t), false);
  }

  public DecorativeArrow setRepresentation(DecorativeGeometry.Representation r) {
    return new DecorativeArrow(opensimModelJNI.DecorativeArrow_setRepresentation(swigCPtr, this, r.swigValue()), false);
  }

  public DecorativeArrow clone() {
    long cPtr = opensimModelJNI.DecorativeArrow_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new DecorativeArrow(cPtr, true);
  }

}
