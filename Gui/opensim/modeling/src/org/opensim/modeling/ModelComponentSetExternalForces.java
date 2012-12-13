/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetExternalForces extends SetExternalForces {
  private long swigCPtr;

  public ModelComponentSetExternalForces(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ModelComponentSetExternalForces_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetExternalForces obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ModelComponentSetExternalForces(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetExternalForces safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ModelComponentSetExternalForces_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetExternalForces(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ModelComponentSetExternalForces_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ModelComponentSetExternalForces_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ModelComponentSetExternalForces_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetExternalForces(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ModelComponentSetExternalForces_getConcreteClassName(swigCPtr, this);
  }

  public ModelComponentSetExternalForces() {
    this(opensimModelJNI.new_ModelComponentSetExternalForces__SWIG_0(), true);
  }

  public ModelComponentSetExternalForces(Model model) {
    this(opensimModelJNI.new_ModelComponentSetExternalForces__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ModelComponentSetExternalForces(Model model, String fileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_ModelComponentSetExternalForces__SWIG_2(Model.getCPtr(model), model, fileName, aUpdateFromXMLNode), true);
  }

  public ModelComponentSetExternalForces(Model model, String fileName) {
    this(opensimModelJNI.new_ModelComponentSetExternalForces__SWIG_3(Model.getCPtr(model), model, fileName), true);
  }

  public ModelComponentSetExternalForces(ModelComponentSetExternalForces source) {
    this(opensimModelJNI.new_ModelComponentSetExternalForces__SWIG_4(ModelComponentSetExternalForces.getCPtr(source), source), true);
  }

  public boolean insert(int aIndex, ExternalForce aObject) {
    return opensimModelJNI.ModelComponentSetExternalForces_insert(swigCPtr, this, aIndex, ExternalForce.getCPtr(aObject), aObject);
  }

  public boolean set(int aIndex, ExternalForce aObject, boolean preserveGroups) {
    return opensimModelJNI.ModelComponentSetExternalForces_set__SWIG_0(swigCPtr, this, aIndex, ExternalForce.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, ExternalForce aObject) {
    return opensimModelJNI.ModelComponentSetExternalForces_set__SWIG_1(swigCPtr, this, aIndex, ExternalForce.getCPtr(aObject), aObject);
  }

  public void invokeConnectToModel(Model model) {
    opensimModelJNI.ModelComponentSetExternalForces_invokeConnectToModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public void invokeAddToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimModelJNI.ModelComponentSetExternalForces_invokeAddToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void invokeInitStateFromProperties(SWIGTYPE_p_SimTK__State state) {
    opensimModelJNI.ModelComponentSetExternalForces_invokeInitStateFromProperties(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state));
  }

  public void invokeSetPropertiesFromState(SWIGTYPE_p_SimTK__State state) {
    opensimModelJNI.ModelComponentSetExternalForces_invokeSetPropertiesFromState(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state));
  }

  public void invokeGenerateDecorations(boolean fixed, ModelDisplayHints hints, SWIGTYPE_p_SimTK__State state, SWIGTYPE_p_SimTK__Array_T_SimTK__DecorativeGeometry_t appendToThis) {
    opensimModelJNI.ModelComponentSetExternalForces_invokeGenerateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, SWIGTYPE_p_SimTK__State.getCPtr(state), SWIGTYPE_p_SimTK__Array_T_SimTK__DecorativeGeometry_t.getCPtr(appendToThis));
  }

}
