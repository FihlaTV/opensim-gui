/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetProbes extends SetProbes {
  private long swigCPtr;

  public ModelComponentSetProbes(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ModelComponentSetProbes_SWIGUpcast(cPtr), cMemoryOwn);
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
        opensimModelJNI.delete_ModelComponentSetProbes(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetProbes safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ModelComponentSetProbes_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetProbes(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ModelComponentSetProbes_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ModelComponentSetProbes_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ModelComponentSetProbes_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetProbes(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ModelComponentSetProbes_getConcreteClassName(swigCPtr, this);
  }

  public ModelComponentSetProbes() {
    this(opensimModelJNI.new_ModelComponentSetProbes__SWIG_0(), true);
  }

  public ModelComponentSetProbes(Model model) {
    this(opensimModelJNI.new_ModelComponentSetProbes__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ModelComponentSetProbes(Model model, String fileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_ModelComponentSetProbes__SWIG_2(Model.getCPtr(model), model, fileName, aUpdateFromXMLNode), true);
  }

  public ModelComponentSetProbes(Model model, String fileName) {
    this(opensimModelJNI.new_ModelComponentSetProbes__SWIG_3(Model.getCPtr(model), model, fileName), true);
  }

  public ModelComponentSetProbes(ModelComponentSetProbes source) {
    this(opensimModelJNI.new_ModelComponentSetProbes__SWIG_4(ModelComponentSetProbes.getCPtr(source), source), true);
  }

  public boolean insert(int aIndex, Probe aObject) {
    return opensimModelJNI.ModelComponentSetProbes_insert(swigCPtr, this, aIndex, Probe.getCPtr(aObject), aObject);
  }

  public boolean set(int aIndex, Probe aObject, boolean preserveGroups) {
    return opensimModelJNI.ModelComponentSetProbes_set__SWIG_0(swigCPtr, this, aIndex, Probe.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Probe aObject) {
    return opensimModelJNI.ModelComponentSetProbes_set__SWIG_1(swigCPtr, this, aIndex, Probe.getCPtr(aObject), aObject);
  }

  public void invokeConnectToModel(Model model) {
    opensimModelJNI.ModelComponentSetProbes_invokeConnectToModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public void invokeInitStateFromProperties(State state) {
    opensimModelJNI.ModelComponentSetProbes_invokeInitStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeSetPropertiesFromState(State state) {
    opensimModelJNI.ModelComponentSetProbes_invokeSetPropertiesFromState(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeGenerateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelJNI.ModelComponentSetProbes_invokeGenerateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}
