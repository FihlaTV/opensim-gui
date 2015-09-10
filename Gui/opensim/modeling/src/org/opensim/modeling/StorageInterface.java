/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class StorageInterface extends OpenSimObject {
  private long swigCPtr;

  public StorageInterface(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.StorageInterface_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(StorageInterface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_StorageInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static StorageInterface safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.StorageInterface_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new StorageInterface(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.StorageInterface_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.StorageInterface_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.StorageInterface_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new StorageInterface(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.StorageInterface_getConcreteClassName(swigCPtr, this);
  }

  public int getSize() {
    return opensimModelJNI.StorageInterface_getSize(swigCPtr, this);
  }

  public StateVector getStateVector(int aTimeIndex) {
    long cPtr = opensimModelJNI.StorageInterface_getStateVector(swigCPtr, this, aTimeIndex);
    return (cPtr == 0) ? null : new StateVector(cPtr, false);
  }

  public StateVector getLastStateVector() {
    long cPtr = opensimModelJNI.StorageInterface_getLastStateVector(swigCPtr, this);
    return (cPtr == 0) ? null : new StateVector(cPtr, false);
  }

  public double getFirstTime() {
    return opensimModelJNI.StorageInterface_getFirstTime(swigCPtr, this);
  }

  public double getLastTime() {
    return opensimModelJNI.StorageInterface_getLastTime(swigCPtr, this);
  }

  public int getTimeColumn(ArrayDouble rTimes, int aStateIndex) {
    return opensimModelJNI.StorageInterface_getTimeColumn__SWIG_0(swigCPtr, this, ArrayDouble.getCPtr(rTimes), rTimes, aStateIndex);
  }

  public int getTimeColumn(ArrayDouble rTimes) {
    return opensimModelJNI.StorageInterface_getTimeColumn__SWIG_1(swigCPtr, this, ArrayDouble.getCPtr(rTimes), rTimes);
  }

  public void getTimeColumnWithStartTime(ArrayDouble rTimes, double startTime) {
    opensimModelJNI.StorageInterface_getTimeColumnWithStartTime__SWIG_0(swigCPtr, this, ArrayDouble.getCPtr(rTimes), rTimes, startTime);
  }

  public void getTimeColumnWithStartTime(ArrayDouble rTimes) {
    opensimModelJNI.StorageInterface_getTimeColumnWithStartTime__SWIG_1(swigCPtr, this, ArrayDouble.getCPtr(rTimes), rTimes);
  }

  public int getDataAtTime(double aTime, int aN, ArrayDouble rData) {
    return opensimModelJNI.StorageInterface_getDataAtTime(swigCPtr, this, aTime, aN, ArrayDouble.getCPtr(rData), rData);
  }

  public void getDataColumn(String columnName, ArrayDouble data, double startTime) {
    opensimModelJNI.StorageInterface_getDataColumn__SWIG_0(swigCPtr, this, columnName, ArrayDouble.getCPtr(data), data, startTime);
  }

  public void getDataColumn(String columnName, ArrayDouble data) {
    opensimModelJNI.StorageInterface_getDataColumn__SWIG_1(swigCPtr, this, columnName, ArrayDouble.getCPtr(data), data);
  }

  public int append(StateVector aVec, boolean aCheckForDuplicateTime) {
    return opensimModelJNI.StorageInterface_append__SWIG_0(swigCPtr, this, StateVector.getCPtr(aVec), aVec, aCheckForDuplicateTime);
  }

  public int append(StateVector aVec) {
    return opensimModelJNI.StorageInterface_append__SWIG_1(swigCPtr, this, StateVector.getCPtr(aVec), aVec);
  }

  public int append(ArrayStateVector aArray) {
    return opensimModelJNI.StorageInterface_append__SWIG_2(swigCPtr, this, ArrayStateVector.getCPtr(aArray), aArray);
  }

  public int append(double aT, int aN, SWIGTYPE_p_double aY, boolean aCheckForDuplicateTime) {
    return opensimModelJNI.StorageInterface_append__SWIG_3(swigCPtr, this, aT, aN, SWIGTYPE_p_double.getCPtr(aY), aCheckForDuplicateTime);
  }

  public int append(double aT, int aN, SWIGTYPE_p_double aY) {
    return opensimModelJNI.StorageInterface_append__SWIG_4(swigCPtr, this, aT, aN, SWIGTYPE_p_double.getCPtr(aY));
  }

  public int append(double aT, Vector aY, boolean aCheckForDuplicateTime) {
    return opensimModelJNI.StorageInterface_append__SWIG_5(swigCPtr, this, aT, Vector.getCPtr(aY), aY, aCheckForDuplicateTime);
  }

  public int append(double aT, Vector aY) {
    return opensimModelJNI.StorageInterface_append__SWIG_6(swigCPtr, this, aT, Vector.getCPtr(aY), aY);
  }

  public int append(double aT, Vec3 aY, boolean aCheckForDuplicateTime) {
    return opensimModelJNI.StorageInterface_append__SWIG_7(swigCPtr, this, aT, Vec3.getCPtr(aY), aY, aCheckForDuplicateTime);
  }

  public int append(double aT, Vec3 aY) {
    return opensimModelJNI.StorageInterface_append__SWIG_8(swigCPtr, this, aT, Vec3.getCPtr(aY), aY);
  }

  public int store(int aStep, double aT, int aN, SWIGTYPE_p_double aY) {
    return opensimModelJNI.StorageInterface_store(swigCPtr, this, aStep, aT, aN, SWIGTYPE_p_double.getCPtr(aY));
  }

  public int findIndex(double aT) {
    return opensimModelJNI.StorageInterface_findIndex__SWIG_0(swigCPtr, this, aT);
  }

  public int findIndex(int aI, double aT) {
    return opensimModelJNI.StorageInterface_findIndex__SWIG_1(swigCPtr, this, aI, aT);
  }

  public void setOutputFileName(String aFileName) {
    opensimModelJNI.StorageInterface_setOutputFileName(swigCPtr, this, aFileName);
  }

}
