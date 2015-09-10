/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class IKTask extends OpenSimObject {
  private long swigCPtr;

  public IKTask(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.IKTask_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(IKTask obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_IKTask(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static IKTask safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.IKTask_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new IKTask(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.IKTask_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.IKTask_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.IKTask_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new IKTask(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.IKTask_getConcreteClassName(swigCPtr, this);
  }

  public boolean getApply() {
    return opensimModelJNI.IKTask_getApply(swigCPtr, this);
  }

  public void setApply(boolean aApply) {
    opensimModelJNI.IKTask_setApply(swigCPtr, this, aApply);
  }

  public double getWeight() {
    return opensimModelJNI.IKTask_getWeight(swigCPtr, this);
  }

  public void setWeight(double weight) {
    opensimModelJNI.IKTask_setWeight(swigCPtr, this, weight);
  }

}
