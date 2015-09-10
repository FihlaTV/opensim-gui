/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Actuation extends Analysis {
  private long swigCPtr;

  public Actuation(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Actuation_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Actuation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Actuation(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Actuation safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Actuation_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Actuation(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Actuation_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Actuation_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Actuation_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Actuation(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Actuation_getConcreteClassName(swigCPtr, this);
  }

  public Actuation(Model aModel) {
    this(opensimModelJNI.new_Actuation__SWIG_0(Model.getCPtr(aModel), aModel), true);
  }

  public Actuation() {
    this(opensimModelJNI.new_Actuation__SWIG_1(), true);
  }

  public Actuation(String aFileName) {
    this(opensimModelJNI.new_Actuation__SWIG_2(aFileName), true);
  }

  public Actuation(Actuation aObject) {
    this(opensimModelJNI.new_Actuation__SWIG_3(Actuation.getCPtr(aObject), aObject), true);
  }

  public void setStorageCapacityIncrements(int aIncrement) {
    opensimModelJNI.Actuation_setStorageCapacityIncrements(swigCPtr, this, aIncrement);
  }

  public Storage getForceStorage() {
    long cPtr = opensimModelJNI.Actuation_getForceStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getSpeedStorage() {
    long cPtr = opensimModelJNI.Actuation_getSpeedStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getPowerStorage() {
    long cPtr = opensimModelJNI.Actuation_getPowerStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public void setModel(Model aModel) {
    opensimModelJNI.Actuation_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public int begin(State s) {
    return opensimModelJNI.Actuation_begin(swigCPtr, this, State.getCPtr(s), s);
  }

  public int step(State s, int setNumber) {
    return opensimModelJNI.Actuation_step(swigCPtr, this, State.getCPtr(s), s, setNumber);
  }

  public int end(State s) {
    return opensimModelJNI.Actuation_end(swigCPtr, this, State.getCPtr(s), s);
  }

  public int printResults(String aBaseName, String aDir, double aDT, String aExtension) {
    return opensimModelJNI.Actuation_printResults__SWIG_0(swigCPtr, this, aBaseName, aDir, aDT, aExtension);
  }

  public int printResults(String aBaseName, String aDir, double aDT) {
    return opensimModelJNI.Actuation_printResults__SWIG_1(swigCPtr, this, aBaseName, aDir, aDT);
  }

  public int printResults(String aBaseName, String aDir) {
    return opensimModelJNI.Actuation_printResults__SWIG_2(swigCPtr, this, aBaseName, aDir);
  }

  public int printResults(String aBaseName) {
    return opensimModelJNI.Actuation_printResults__SWIG_3(swigCPtr, this, aBaseName);
  }

}
