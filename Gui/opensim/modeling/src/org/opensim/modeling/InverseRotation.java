/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class InverseRotation {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public InverseRotation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(InverseRotation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_InverseRotation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public InverseRotation() {
    this(opensimModelJNI.new_InverseRotation__SWIG_0(), true);
  }

  public InverseRotation(InverseRotation R) {
    this(opensimModelJNI.new_InverseRotation__SWIG_1(InverseRotation.getCPtr(R), R), true);
  }

  public Rotation invert() {
    return new Rotation(opensimModelJNI.InverseRotation_invert(swigCPtr, this), false);
  }

  public Rotation transpose() {
    return new Rotation(opensimModelJNI.InverseRotation_transpose(swigCPtr, this), false);
  }

}
