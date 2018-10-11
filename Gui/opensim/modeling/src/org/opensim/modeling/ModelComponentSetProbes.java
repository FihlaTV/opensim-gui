/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetProbes extends SetProbes {
  private transient long swigCPtr;

  public ModelComponentSetProbes(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ModelComponentSetProbes_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetProbes obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ModelComponentSetProbes(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetProbes safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ModelComponentSetProbes_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetProbes(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ModelComponentSetProbes_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ModelComponentSetProbes_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ModelComponentSetProbes_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetProbes(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ModelComponentSetProbes_getConcreteClassName(swigCPtr, this);
  }

  public void extendFinalizeFromProperties() {
    opensimSimulationJNI.ModelComponentSetProbes_extendFinalizeFromProperties(swigCPtr, this);
  }

  public ModelComponentSetProbes() {
    this(opensimSimulationJNI.new_ModelComponentSetProbes(), true);
  }

}
