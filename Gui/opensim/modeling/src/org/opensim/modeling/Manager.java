/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Manager {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Manager(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Manager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Manager(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Manager(Model arg0, SWIGTYPE_p_SimTK__Integrator arg1) {
    this(opensimModelJNI.new_Manager__SWIG_0(Model.getCPtr(arg0), arg0, SWIGTYPE_p_SimTK__Integrator.getCPtr(arg1)), true);
  }

  public Manager(Model aModel) {
    this(opensimModelJNI.new_Manager__SWIG_1(Model.getCPtr(aModel), aModel), true);
  }

  public Manager() {
    this(opensimModelJNI.new_Manager__SWIG_2(), true);
  }

  public void setSessionName(String name) {
    opensimModelJNI.Manager_setSessionName(swigCPtr, this, name);
  }

  public void setModel(Model aModel) {
    opensimModelJNI.Manager_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public String getSessionName() {
    return opensimModelJNI.Manager_getSessionName(swigCPtr, this);
  }

  public String toString() {
    return opensimModelJNI.Manager_toString(swigCPtr, this);
  }

  public void setPerformAnalyses(boolean performAnalyses) {
    opensimModelJNI.Manager_setPerformAnalyses(swigCPtr, this, performAnalyses);
  }

  public void setWriteToStorage(boolean writeToStorage) {
    opensimModelJNI.Manager_setWriteToStorage(swigCPtr, this, writeToStorage);
  }

  public SWIGTYPE_p_SimTK__Integrator getIntegrator() {
    return new SWIGTYPE_p_SimTK__Integrator(opensimModelJNI.Manager_getIntegrator(swigCPtr, this), false);
  }

  public void setIntegrator(SWIGTYPE_p_SimTK__Integrator arg0) {
    opensimModelJNI.Manager_setIntegrator(swigCPtr, this, SWIGTYPE_p_SimTK__Integrator.getCPtr(arg0));
  }

  public void setInitialTime(double aTI) {
    opensimModelJNI.Manager_setInitialTime(swigCPtr, this, aTI);
  }

  public double getInitialTime() {
    return opensimModelJNI.Manager_getInitialTime(swigCPtr, this);
  }

  public void setFinalTime(double aTF) {
    opensimModelJNI.Manager_setFinalTime(swigCPtr, this, aTF);
  }

  public double getFinalTime() {
    return opensimModelJNI.Manager_getFinalTime(swigCPtr, this);
  }

  public void setFirstDT(double aDT) {
    opensimModelJNI.Manager_setFirstDT(swigCPtr, this, aDT);
  }

  public double getFirstDT() {
    return opensimModelJNI.Manager_getFirstDT(swigCPtr, this);
  }

  public void setUseSpecifiedDT(boolean aTrueFalse) {
    opensimModelJNI.Manager_setUseSpecifiedDT(swigCPtr, this, aTrueFalse);
  }

  public boolean getUseSpecifiedDT() {
    return opensimModelJNI.Manager_getUseSpecifiedDT(swigCPtr, this);
  }

  public void setUseConstantDT(boolean aTrueFalse) {
    opensimModelJNI.Manager_setUseConstantDT(swigCPtr, this, aTrueFalse);
  }

  public boolean getUseConstantDT() {
    return opensimModelJNI.Manager_getUseConstantDT(swigCPtr, this);
  }

  public ArrayDouble getDTArray() {
    return new ArrayDouble(opensimModelJNI.Manager_getDTArray(swigCPtr, this), false);
  }

  public void setDTArray(int aN, double[] aDT, double aTI) {
    opensimModelJNI.Manager_setDTArray__SWIG_0(swigCPtr, this, aN, aDT, aTI);
  }

  public void setDTArray(int aN, double[] aDT) {
    opensimModelJNI.Manager_setDTArray__SWIG_1(swigCPtr, this, aN, aDT);
  }

  public double getDTArrayDT(int aStep) {
    return opensimModelJNI.Manager_getDTArrayDT(swigCPtr, this, aStep);
  }

  public void printDTArray(String aFileName) {
    opensimModelJNI.Manager_printDTArray__SWIG_0(swigCPtr, this, aFileName);
  }

  public void printDTArray() {
    opensimModelJNI.Manager_printDTArray__SWIG_1(swigCPtr, this);
  }

  public ArrayDouble getTimeArray() {
    return new ArrayDouble(opensimModelJNI.Manager_getTimeArray(swigCPtr, this), false);
  }

  public double getTimeArrayTime(int aStep) {
    return opensimModelJNI.Manager_getTimeArrayTime(swigCPtr, this, aStep);
  }

  public int getTimeArrayStep(double aTime) {
    return opensimModelJNI.Manager_getTimeArrayStep(swigCPtr, this, aTime);
  }

  public void printTimeArray(String aFileName) {
    opensimModelJNI.Manager_printTimeArray__SWIG_0(swigCPtr, this, aFileName);
  }

  public void printTimeArray() {
    opensimModelJNI.Manager_printTimeArray__SWIG_1(swigCPtr, this);
  }

  public void resetTimeAndDTArrays(double aTime) {
    opensimModelJNI.Manager_resetTimeAndDTArrays(swigCPtr, this, aTime);
  }

  public double getNextTimeArrayTime(double aTime) {
    return opensimModelJNI.Manager_getNextTimeArrayTime(swigCPtr, this, aTime);
  }

  public void setSystem(SWIGTYPE_p_SimTK__System system) {
    opensimModelJNI.Manager_setSystem(swigCPtr, this, SWIGTYPE_p_SimTK__System.getCPtr(system));
  }

  public boolean integrate(State s, double dtFirst) {
    return opensimModelJNI.Manager_integrate__SWIG_0(swigCPtr, this, State.getCPtr(s), s, dtFirst);
  }

  public boolean integrate(State s) {
    return opensimModelJNI.Manager_integrate__SWIG_1(swigCPtr, this, State.getCPtr(s), s);
  }

  public boolean doIntegration(State s, int step, double dtFirst) {
    return opensimModelJNI.Manager_doIntegration(swigCPtr, this, State.getCPtr(s), s, step, dtFirst);
  }

  public void initialize(State s, double dt) {
    opensimModelJNI.Manager_initialize(swigCPtr, this, State.getCPtr(s), s, dt);
  }

  public void finalize(State s) {
    opensimModelJNI.Manager_finalize(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFixedStepSize(int tArrayStep) {
    return opensimModelJNI.Manager_getFixedStepSize(swigCPtr, this, tArrayStep);
  }

  public boolean hasStateStorage() {
    return opensimModelJNI.Manager_hasStateStorage(swigCPtr, this);
  }

  public void setStateStorage(Storage aStorage) {
    opensimModelJNI.Manager_setStateStorage(swigCPtr, this, Storage.getCPtr(aStorage), aStorage);
  }

  public Storage getStateStorage() {
    return new Storage(opensimModelJNI.Manager_getStateStorage(swigCPtr, this), false);
  }

  public void halt() {
    opensimModelJNI.Manager_halt(swigCPtr, this);
  }

  public void clearHalt() {
    opensimModelJNI.Manager_clearHalt(swigCPtr, this);
  }

  public boolean checkHalt() {
    return opensimModelJNI.Manager_checkHalt(swigCPtr, this);
  }

  public void setIntegratorAccuracy(double accuracy) {
    opensimModelJNI.Manager_setIntegratorAccuracy(swigCPtr, this, accuracy);
  }

}
