/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class VectorOfSpatialVec {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public VectorOfSpatialVec(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(VectorOfSpatialVec obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_VectorOfSpatialVec(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public VectorOfSpatialVec() {
    this(opensimModelJNI.new_VectorOfSpatialVec__SWIG_0(), true);
  }

  public VectorOfSpatialVec(VectorOfSpatialVec src) {
    this(opensimModelJNI.new_VectorOfSpatialVec__SWIG_1(VectorOfSpatialVec.getCPtr(src), src), true);
  }

  public VectorOfSpatialVec(int m, SpatialVec initialValue) {
    this(opensimModelJNI.new_VectorOfSpatialVec__SWIG_2(m, SpatialVec.getCPtr(initialValue), initialValue), true);
  }

  public String toString() {
    return opensimModelJNI.VectorOfSpatialVec_toString(swigCPtr, this);
  }

  public SpatialVec get(int i) {
    return new SpatialVec(opensimModelJNI.VectorOfSpatialVec_get(swigCPtr, this, i), false);
  }

  public void set(int i, SpatialVec value) {
    opensimModelJNI.VectorOfSpatialVec_set(swigCPtr, this, i, SpatialVec.getCPtr(value), value);
  }

}
