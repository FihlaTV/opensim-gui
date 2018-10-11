/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponent extends Component {
  private transient long swigCPtr;

  public ModelComponent(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ModelComponent_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ModelComponent(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponent safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ModelComponent_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponent(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ModelComponent_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ModelComponent_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ModelComponent_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponent(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ModelComponent_getConcreteClassName(swigCPtr, this);
  }

  public void connectToModel(Model model) {
    opensimSimulationJNI.ModelComponent_connectToModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public Model getModel() {
    return new Model(opensimSimulationJNI.ModelComponent_getModel(swigCPtr, this), false);
  }

  public Model updModel() {
    return new Model(opensimSimulationJNI.ModelComponent_updModel(swigCPtr, this), false);
  }

  public boolean hasModel() {
    return opensimSimulationJNI.ModelComponent_hasModel(swigCPtr, this);
  }

  public void preScale(State s, ScaleSet scaleSet) {
    opensimSimulationJNI.ModelComponent_preScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(scaleSet), scaleSet);
  }

  public void scale(State s, ScaleSet scaleSet) {
    opensimSimulationJNI.ModelComponent_scale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(scaleSet), scaleSet);
  }

  public void postScale(State s, ScaleSet scaleSet) {
    opensimSimulationJNI.ModelComponent_postScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(scaleSet), scaleSet);
  }

}
