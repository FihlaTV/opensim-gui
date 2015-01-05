/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ForceIterator {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ForceIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ForceIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ForceIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Force __ref__() {
    return new Force(opensimModelJNI.ForceIterator___ref__(swigCPtr, this), false);
  }

  public Force __deref__() {
    long cPtr = opensimModelJNI.ForceIterator___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Force(cPtr, false);
  }

  public ForceIterator next() {
    return new ForceIterator(opensimModelJNI.ForceIterator_next(swigCPtr, this), false);
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ForceIterator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Force(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ForceIterator_getConcreteClassName(swigCPtr, this);
  }

  public boolean get_isDisabled(int i) {
    return opensimModelJNI.ForceIterator_get_isDisabled__SWIG_0(swigCPtr, this, i);
  }

  public boolean get_isDisabled() {
    return opensimModelJNI.ForceIterator_get_isDisabled__SWIG_1(swigCPtr, this);
  }

  public boolean shouldBeParallelized() {
    return opensimModelJNI.ForceIterator_shouldBeParallelized(swigCPtr, this);
  }

  public boolean isDisabled(State s) {
    return opensimModelJNI.ForceIterator_isDisabled(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setDisabled(State s, boolean disabled) {
    opensimModelJNI.ForceIterator_setDisabled(swigCPtr, this, State.getCPtr(s), s, disabled);
  }

  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimModelJNI.ForceIterator_getRecordLabels(swigCPtr, this), true);
  }

  public ArrayDouble getRecordValues(State state) {
    return new ArrayDouble(opensimModelJNI.ForceIterator_getRecordValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public boolean hasGeometryPath() {
    return opensimModelJNI.ForceIterator_hasGeometryPath(swigCPtr, this);
  }

  public Geometry get_GeometrySet(int i) {
    return new Geometry(opensimModelJNI.ForceIterator_get_GeometrySet(swigCPtr, this, i), false);
  }

  public Model getModel() {
    return new Model(opensimModelJNI.ForceIterator_getModel(swigCPtr, this), false);
  }

  public int getGeometrySize() {
    return opensimModelJNI.ForceIterator_getGeometrySize(swigCPtr, this);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelJNI.ForceIterator_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimModelJNI.ForceIterator_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimModelJNI.ForceIterator_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimModelJNI.ForceIterator_getSystem(swigCPtr, this), false);
  }

  public Component getComponent(String name) {
    return new Component(opensimModelJNI.ForceIterator_getComponent(swigCPtr, this, name), false);
  }

  public Component updComponent(String name) {
    return new Component(opensimModelJNI.ForceIterator_updComponent(swigCPtr, this, name), false);
  }

  public int getNumStateVariables() {
    return opensimModelJNI.ForceIterator_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimModelJNI.ForceIterator_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumConnectors() {
    return opensimModelJNI.ForceIterator_getNumConnectors(swigCPtr, this);
  }

  public AbstractConnector getConnector(int i) {
    return new AbstractConnector(opensimModelJNI.ForceIterator_getConnector(swigCPtr, this, i), false);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimModelJNI.ForceIterator_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimModelJNI.ForceIterator_getOutput(swigCPtr, this, name), false);
  }

  public SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator getOutputsBegin() {
    return new SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator(opensimModelJNI.ForceIterator_getOutputsBegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator getOutputsEnd() {
    return new SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator(opensimModelJNI.ForceIterator_getOutputsEnd(swigCPtr, this), true);
  }

  public int getModelingOption(State state, String name) {
    return opensimModelJNI.ForceIterator_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimModelJNI.ForceIterator_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimModelJNI.ForceIterator_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimModelJNI.ForceIterator_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimModelJNI.ForceIterator_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimModelJNI.ForceIterator_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimModelJNI.ForceIterator_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimModelJNI.ForceIterator_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimModelJNI.ForceIterator_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimModelJNI.ForceIterator_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimModelJNI.ForceIterator_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public String getPathName() {
    return opensimModelJNI.ForceIterator_getPathName(swigCPtr, this);
  }

  public void dumpPathName() {
    opensimModelJNI.ForceIterator_dumpPathName(swigCPtr, this);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimModelJNI.ForceIterator_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public String getName() {
    return opensimModelJNI.ForceIterator_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimModelJNI.ForceIterator_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimModelJNI.ForceIterator_getAuthors(swigCPtr, this);
  }

  public String getReferences() {
    return opensimModelJNI.ForceIterator_getReferences(swigCPtr, this);
  }

  public int getNumProperties() {
    return opensimModelJNI.ForceIterator_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimModelJNI.ForceIterator_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimModelJNI.ForceIterator_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimModelJNI.ForceIterator_getPropertyByName(swigCPtr, this, name), false);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimModelJNI.ForceIterator_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimModelJNI.ForceIterator_updateXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimModelJNI.ForceIterator_getInlined(swigCPtr, this);
  }

  public String getDocumentFileName() {
    return opensimModelJNI.ForceIterator_getDocumentFileName(swigCPtr, this);
  }

  public boolean print(String fileName) {
    return opensimModelJNI.ForceIterator_print(swigCPtr, this, fileName);
  }

  public boolean isA(String type) {
    return opensimModelJNI.ForceIterator_isA(swigCPtr, this, type);
  }

  public String toString() {
    return opensimModelJNI.ForceIterator_toString(swigCPtr, this);
  }

}