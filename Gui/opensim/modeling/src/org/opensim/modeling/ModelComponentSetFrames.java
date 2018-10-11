/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetFrames extends SetFrames {
  private transient long swigCPtr;

  public ModelComponentSetFrames(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ModelComponentSetFrames_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetFrames obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ModelComponentSetFrames(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetFrames safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ModelComponentSetFrames_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetFrames(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ModelComponentSetFrames_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ModelComponentSetFrames_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ModelComponentSetFrames_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetFrames(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ModelComponentSetFrames_getConcreteClassName(swigCPtr, this);
  }

  public void extendFinalizeFromProperties() {
    opensimSimulationJNI.ModelComponentSetFrames_extendFinalizeFromProperties(swigCPtr, this);
  }

  public ModelComponentSetFrames() {
    this(opensimSimulationJNI.new_ModelComponentSetFrames(), true);
  }

}
