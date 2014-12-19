/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class StatesReporter extends Analysis {
  private long swigCPtr;

  public StatesReporter(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.StatesReporter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(StatesReporter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_StatesReporter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static StatesReporter safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.StatesReporter_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new StatesReporter(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.StatesReporter_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.StatesReporter_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.StatesReporter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new StatesReporter(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.StatesReporter_getConcreteClassName(swigCPtr, this);
  }

  public StatesReporter(Model aModel) {
    this(opensimModelJNI.new_StatesReporter__SWIG_0(Model.getCPtr(aModel), aModel), true);
  }

  public StatesReporter() {
    this(opensimModelJNI.new_StatesReporter__SWIG_1(), true);
  }

  public StatesReporter(String aFileName) {
    this(opensimModelJNI.new_StatesReporter__SWIG_2(aFileName), true);
  }

  public StatesReporter(StatesReporter aObject) {
    this(opensimModelJNI.new_StatesReporter__SWIG_3(StatesReporter.getCPtr(aObject), aObject), true);
  }

  public Storage getStatesStorage() {
    return new Storage(opensimModelJNI.StatesReporter_getStatesStorage(swigCPtr, this), false);
  }

  public Storage updStatesStorage() {
    return new Storage(opensimModelJNI.StatesReporter_updStatesStorage(swigCPtr, this), false);
  }

  public int begin(State s) {
    return opensimModelJNI.StatesReporter_begin(swigCPtr, this, State.getCPtr(s), s);
  }

  public int step(State s, int setNumber) {
    return opensimModelJNI.StatesReporter_step(swigCPtr, this, State.getCPtr(s), s, setNumber);
  }

  public int end(State s) {
    return opensimModelJNI.StatesReporter_end(swigCPtr, this, State.getCPtr(s), s);
  }

  public int printResults(String aBaseName, String aDir, double aDT, String aExtension) {
    return opensimModelJNI.StatesReporter_printResults__SWIG_0(swigCPtr, this, aBaseName, aDir, aDT, aExtension);
  }

  public int printResults(String aBaseName, String aDir, double aDT) {
    return opensimModelJNI.StatesReporter_printResults__SWIG_1(swigCPtr, this, aBaseName, aDir, aDT);
  }

  public int printResults(String aBaseName, String aDir) {
    return opensimModelJNI.StatesReporter_printResults__SWIG_2(swigCPtr, this, aBaseName, aDir);
  }

  public int printResults(String aBaseName) {
    return opensimModelJNI.StatesReporter_printResults__SWIG_3(swigCPtr, this, aBaseName);
  }

}
