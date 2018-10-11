/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetMarkers extends SetMarkers {
  private transient long swigCPtr;

  public ModelComponentSetMarkers(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ModelComponentSetMarkers_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetMarkers obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ModelComponentSetMarkers(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetMarkers safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ModelComponentSetMarkers_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetMarkers(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ModelComponentSetMarkers_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ModelComponentSetMarkers_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ModelComponentSetMarkers_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetMarkers(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ModelComponentSetMarkers_getConcreteClassName(swigCPtr, this);
  }

  public void extendFinalizeFromProperties() {
    opensimSimulationJNI.ModelComponentSetMarkers_extendFinalizeFromProperties(swigCPtr, this);
  }

  public ModelComponentSetMarkers() {
    this(opensimSimulationJNI.new_ModelComponentSetMarkers(), true);
  }

}
