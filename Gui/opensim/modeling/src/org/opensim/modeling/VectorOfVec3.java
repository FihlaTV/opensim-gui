/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class VectorOfVec3 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public VectorOfVec3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(VectorOfVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_VectorOfVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public VectorOfVec3() {
    this(opensimModelJNI.new_VectorOfVec3__SWIG_0(), true);
  }

  public VectorOfVec3(VectorOfVec3 src) {
    this(opensimModelJNI.new_VectorOfVec3__SWIG_1(VectorOfVec3.getCPtr(src), src), true);
  }

  public VectorOfVec3(int m, Vec3 initialValue) {
    this(opensimModelJNI.new_VectorOfVec3__SWIG_2(m, Vec3.getCPtr(initialValue), initialValue), true);
  }

  public String toString() {
    return opensimModelJNI.VectorOfVec3_toString(swigCPtr, this);
  }

  public Vec3 get(int i) {
    return new Vec3(opensimModelJNI.VectorOfVec3_get(swigCPtr, this, i), false);
  }

  public void set(int i, Vec3 value) {
    opensimModelJNI.VectorOfVec3_set(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

}
