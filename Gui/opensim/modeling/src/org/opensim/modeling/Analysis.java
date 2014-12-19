/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Analysis extends OpenSimObject {
  private long swigCPtr;

  public Analysis(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Analysis_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Analysis obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Analysis(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Analysis safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Analysis_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Analysis(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Analysis_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Analysis_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Analysis_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Analysis(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Analysis_getConcreteClassName(swigCPtr, this);
  }

  public void set_model(Model value) {
    opensimModelJNI.Analysis__model_set(swigCPtr, this, Model.getCPtr(value), value);
  }

  public Model get_model() {
    long cPtr = opensimModelJNI.Analysis__model_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Model(cPtr, false);
  }

  public void set_statesStore(Storage value) {
    opensimModelJNI.Analysis__statesStore_set(swigCPtr, this, Storage.getCPtr(value), value);
  }

  public Storage get_statesStore() {
    long cPtr = opensimModelJNI.Analysis__statesStore_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public int begin(State s) {
    return opensimModelJNI.Analysis_begin(swigCPtr, this, State.getCPtr(s), s);
  }

  public int step(State s, int stepNumber) {
    return opensimModelJNI.Analysis_step(swigCPtr, this, State.getCPtr(s), s, stepNumber);
  }

  public int end(State s) {
    return opensimModelJNI.Analysis_end(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setModel(Model aModel) {
    opensimModelJNI.Analysis_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public void setStatesStore(Storage aStatesStore) {
    opensimModelJNI.Analysis_setStatesStore(swigCPtr, this, Storage.getCPtr(aStatesStore), aStatesStore);
  }

  public void setOn(boolean aTrueFalse) {
    opensimModelJNI.Analysis_setOn(swigCPtr, this, aTrueFalse);
  }

  public boolean getOn() {
    return opensimModelJNI.Analysis_getOn(swigCPtr, this);
  }

  public void setStartTime(double aStartTime) {
    opensimModelJNI.Analysis_setStartTime(swigCPtr, this, aStartTime);
  }

  public double getStartTime() {
    return opensimModelJNI.Analysis_getStartTime(swigCPtr, this);
  }

  public void setEndTime(double aEndTime) {
    opensimModelJNI.Analysis_setEndTime(swigCPtr, this, aEndTime);
  }

  public double getEndTime() {
    return opensimModelJNI.Analysis_getEndTime(swigCPtr, this);
  }

  public void setInDegrees(boolean aTrueFalse) {
    opensimModelJNI.Analysis_setInDegrees(swigCPtr, this, aTrueFalse);
  }

  public boolean getInDegrees() {
    return opensimModelJNI.Analysis_getInDegrees(swigCPtr, this);
  }

  public boolean proceed(int aStep) {
    return opensimModelJNI.Analysis_proceed__SWIG_0(swigCPtr, this, aStep);
  }

  public boolean proceed() {
    return opensimModelJNI.Analysis_proceed__SWIG_1(swigCPtr, this);
  }

  public void setStepInterval(int aStepInterval) {
    opensimModelJNI.Analysis_setStepInterval(swigCPtr, this, aStepInterval);
  }

  public int getStepInterval() {
    return opensimModelJNI.Analysis_getStepInterval(swigCPtr, this);
  }

  public void setColumnLabels(ArrayStr aLabels) {
    opensimModelJNI.Analysis_setColumnLabels(swigCPtr, this, ArrayStr.getCPtr(aLabels), aLabels);
  }

  public ArrayStr getColumnLabels() {
    return new ArrayStr(opensimModelJNI.Analysis_getColumnLabels(swigCPtr, this), false);
  }

  public ArrayStorage getStorageList() {
    return new ArrayStorage(opensimModelJNI.Analysis_getStorageList(swigCPtr, this), false);
  }

  public void setPrintResultFiles(boolean aToWrite) {
    opensimModelJNI.Analysis_setPrintResultFiles(swigCPtr, this, aToWrite);
  }

  public boolean getPrintResultFiles() {
    return opensimModelJNI.Analysis_getPrintResultFiles(swigCPtr, this);
  }

  public int printResults(String aBaseName, String aDir, double aDT, String aExtension) {
    return opensimModelJNI.Analysis_printResults__SWIG_0(swigCPtr, this, aBaseName, aDir, aDT, aExtension);
  }

  public int printResults(String aBaseName, String aDir, double aDT) {
    return opensimModelJNI.Analysis_printResults__SWIG_1(swigCPtr, this, aBaseName, aDir, aDT);
  }

  public int printResults(String aBaseName, String aDir) {
    return opensimModelJNI.Analysis_printResults__SWIG_2(swigCPtr, this, aBaseName, aDir);
  }

  public int printResults(String aBaseName) {
    return opensimModelJNI.Analysis_printResults__SWIG_3(swigCPtr, this, aBaseName);
  }

}
