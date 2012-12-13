/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetJoints extends SetJoints {
  private long swigCPtr;

  public ModelComponentSetJoints(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ModelComponentSetJoints_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetJoints obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ModelComponentSetJoints(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetJoints safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ModelComponentSetJoints_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetJoints(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ModelComponentSetJoints_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ModelComponentSetJoints_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ModelComponentSetJoints_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetJoints(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ModelComponentSetJoints_getConcreteClassName(swigCPtr, this);
  }

  public ModelComponentSetJoints() {
    this(opensimModelJNI.new_ModelComponentSetJoints__SWIG_0(), true);
  }

  public ModelComponentSetJoints(Model model) {
    this(opensimModelJNI.new_ModelComponentSetJoints__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ModelComponentSetJoints(Model model, String fileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_ModelComponentSetJoints__SWIG_2(Model.getCPtr(model), model, fileName, aUpdateFromXMLNode), true);
  }

  public ModelComponentSetJoints(Model model, String fileName) {
    this(opensimModelJNI.new_ModelComponentSetJoints__SWIG_3(Model.getCPtr(model), model, fileName), true);
  }

  public ModelComponentSetJoints(ModelComponentSetJoints source) {
    this(opensimModelJNI.new_ModelComponentSetJoints__SWIG_4(ModelComponentSetJoints.getCPtr(source), source), true);
  }

  public boolean insert(int aIndex, Joint aObject) {
    return opensimModelJNI.ModelComponentSetJoints_insert(swigCPtr, this, aIndex, Joint.getCPtr(aObject), aObject);
  }

  public boolean set(int aIndex, Joint aObject, boolean preserveGroups) {
    return opensimModelJNI.ModelComponentSetJoints_set__SWIG_0(swigCPtr, this, aIndex, Joint.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Joint aObject) {
    return opensimModelJNI.ModelComponentSetJoints_set__SWIG_1(swigCPtr, this, aIndex, Joint.getCPtr(aObject), aObject);
  }

  public void invokeConnectToModel(Model model) {
    opensimModelJNI.ModelComponentSetJoints_invokeConnectToModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public void invokeAddToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimModelJNI.ModelComponentSetJoints_invokeAddToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void invokeInitStateFromProperties(SWIGTYPE_p_SimTK__State state) {
    opensimModelJNI.ModelComponentSetJoints_invokeInitStateFromProperties(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state));
  }

  public void invokeSetPropertiesFromState(SWIGTYPE_p_SimTK__State state) {
    opensimModelJNI.ModelComponentSetJoints_invokeSetPropertiesFromState(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state));
  }

  public void invokeGenerateDecorations(boolean fixed, ModelDisplayHints hints, SWIGTYPE_p_SimTK__State state, SWIGTYPE_p_SimTK__Array_T_SimTK__DecorativeGeometry_t appendToThis) {
    opensimModelJNI.ModelComponentSetJoints_invokeGenerateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, SWIGTYPE_p_SimTK__State.getCPtr(state), SWIGTYPE_p_SimTK__Array_T_SimTK__DecorativeGeometry_t.getCPtr(appendToThis));
  }

}
