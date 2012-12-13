/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetContactGeometry extends SetContactGeometry {
  private long swigCPtr;

  public ModelComponentSetContactGeometry(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ModelComponentSetContactGeometry_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetContactGeometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ModelComponentSetContactGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetContactGeometry safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ModelComponentSetContactGeometry_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetContactGeometry(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ModelComponentSetContactGeometry_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ModelComponentSetContactGeometry_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ModelComponentSetContactGeometry_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetContactGeometry(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ModelComponentSetContactGeometry_getConcreteClassName(swigCPtr, this);
  }

  public ModelComponentSetContactGeometry() {
    this(opensimModelJNI.new_ModelComponentSetContactGeometry__SWIG_0(), true);
  }

  public ModelComponentSetContactGeometry(Model model) {
    this(opensimModelJNI.new_ModelComponentSetContactGeometry__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ModelComponentSetContactGeometry(Model model, String fileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_ModelComponentSetContactGeometry__SWIG_2(Model.getCPtr(model), model, fileName, aUpdateFromXMLNode), true);
  }

  public ModelComponentSetContactGeometry(Model model, String fileName) {
    this(opensimModelJNI.new_ModelComponentSetContactGeometry__SWIG_3(Model.getCPtr(model), model, fileName), true);
  }

  public ModelComponentSetContactGeometry(ModelComponentSetContactGeometry source) {
    this(opensimModelJNI.new_ModelComponentSetContactGeometry__SWIG_4(ModelComponentSetContactGeometry.getCPtr(source), source), true);
  }

  public boolean insert(int aIndex, ContactGeometry aObject) {
    return opensimModelJNI.ModelComponentSetContactGeometry_insert(swigCPtr, this, aIndex, ContactGeometry.getCPtr(aObject), aObject);
  }

  public boolean set(int aIndex, ContactGeometry aObject, boolean preserveGroups) {
    return opensimModelJNI.ModelComponentSetContactGeometry_set__SWIG_0(swigCPtr, this, aIndex, ContactGeometry.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, ContactGeometry aObject) {
    return opensimModelJNI.ModelComponentSetContactGeometry_set__SWIG_1(swigCPtr, this, aIndex, ContactGeometry.getCPtr(aObject), aObject);
  }

  public void invokeConnectToModel(Model model) {
    opensimModelJNI.ModelComponentSetContactGeometry_invokeConnectToModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public void invokeAddToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimModelJNI.ModelComponentSetContactGeometry_invokeAddToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void invokeInitStateFromProperties(SWIGTYPE_p_SimTK__State state) {
    opensimModelJNI.ModelComponentSetContactGeometry_invokeInitStateFromProperties(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state));
  }

  public void invokeSetPropertiesFromState(SWIGTYPE_p_SimTK__State state) {
    opensimModelJNI.ModelComponentSetContactGeometry_invokeSetPropertiesFromState(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state));
  }

  public void invokeGenerateDecorations(boolean fixed, ModelDisplayHints hints, SWIGTYPE_p_SimTK__State state, SWIGTYPE_p_SimTK__Array_T_SimTK__DecorativeGeometry_t appendToThis) {
    opensimModelJNI.ModelComponentSetContactGeometry_invokeGenerateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, SWIGTYPE_p_SimTK__State.getCPtr(state), SWIGTYPE_p_SimTK__Array_T_SimTK__DecorativeGeometry_t.getCPtr(appendToThis));
  }

}
