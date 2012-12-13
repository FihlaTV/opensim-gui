/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PointKinematics extends Analysis {
  private long swigCPtr;

  public PointKinematics(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.PointKinematics_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PointKinematics obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_PointKinematics(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PointKinematics safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.PointKinematics_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PointKinematics(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.PointKinematics_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.PointKinematics_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.PointKinematics_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PointKinematics(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.PointKinematics_getConcreteClassName(swigCPtr, this);
  }

  public static int getNAME_LENGTH() {
    return opensimModelJNI.PointKinematics_NAME_LENGTH_get();
  }

  public static int getBUFFER_LENGTH() {
    return opensimModelJNI.PointKinematics_BUFFER_LENGTH_get();
  }

  public PointKinematics(Model aModel) {
    this(opensimModelJNI.new_PointKinematics__SWIG_0(Model.getCPtr(aModel), aModel), true);
  }

  public PointKinematics() {
    this(opensimModelJNI.new_PointKinematics__SWIG_1(), true);
  }

  public PointKinematics(String aFileName) {
    this(opensimModelJNI.new_PointKinematics__SWIG_2(aFileName), true);
  }

  public PointKinematics(PointKinematics aObject) {
    this(opensimModelJNI.new_PointKinematics__SWIG_3(PointKinematics.getCPtr(aObject), aObject), true);
  }

  public void setBodyPoint(String aBody, SWIGTYPE_p_SimTK__Vec3 aPoint) {
    opensimModelJNI.PointKinematics_setBodyPoint(swigCPtr, this, aBody, SWIGTYPE_p_SimTK__Vec3.getCPtr(aPoint));
  }

  public void setBody(Body aBody) {
    opensimModelJNI.PointKinematics_setBody(swigCPtr, this, Body.getCPtr(aBody), aBody);
  }

  public void setRelativeToBody(Body aBody) {
    opensimModelJNI.PointKinematics_setRelativeToBody(swigCPtr, this, Body.getCPtr(aBody), aBody);
  }

  public Body getBody() {
    long cPtr = opensimModelJNI.PointKinematics_getBody(swigCPtr, this);
    return (cPtr == 0) ? null : new Body(cPtr, false);
  }

  public Body getRelativeToBody() {
    long cPtr = opensimModelJNI.PointKinematics_getRelativeToBody(swigCPtr, this);
    return (cPtr == 0) ? null : new Body(cPtr, false);
  }

  public void setPoint(SWIGTYPE_p_SimTK__Vec3 aPoint) {
    opensimModelJNI.PointKinematics_setPoint(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(aPoint));
  }

  public void getPoint(SWIGTYPE_p_SimTK__Vec3 rPoint) {
    opensimModelJNI.PointKinematics_getPoint(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(rPoint));
  }

  public void setPointName(String aName) {
    opensimModelJNI.PointKinematics_setPointName(swigCPtr, this, aName);
  }

  public String getPointName() {
    return opensimModelJNI.PointKinematics_getPointName(swigCPtr, this);
  }

  public void setModel(Model aModel) {
    opensimModelJNI.PointKinematics_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public void setStorageCapacityIncrements(int aIncrement) {
    opensimModelJNI.PointKinematics_setStorageCapacityIncrements(swigCPtr, this, aIncrement);
  }

  public Storage getAccelerationStorage() {
    long cPtr = opensimModelJNI.PointKinematics_getAccelerationStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getVelocityStorage() {
    long cPtr = opensimModelJNI.PointKinematics_getVelocityStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage getPositionStorage() {
    long cPtr = opensimModelJNI.PointKinematics_getPositionStorage(swigCPtr, this);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public int begin(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.PointKinematics_begin(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public int step(SWIGTYPE_p_SimTK__State s, int setNumber) {
    return opensimModelJNI.PointKinematics_step(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), setNumber);
  }

  public int end(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.PointKinematics_end(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public int printResults(String aBaseName, String aDir, double aDT, String aExtension) {
    return opensimModelJNI.PointKinematics_printResults__SWIG_0(swigCPtr, this, aBaseName, aDir, aDT, aExtension);
  }

  public int printResults(String aBaseName, String aDir, double aDT) {
    return opensimModelJNI.PointKinematics_printResults__SWIG_1(swigCPtr, this, aBaseName, aDir, aDT);
  }

  public int printResults(String aBaseName, String aDir) {
    return opensimModelJNI.PointKinematics_printResults__SWIG_2(swigCPtr, this, aBaseName, aDir);
  }

  public int printResults(String aBaseName) {
    return opensimModelJNI.PointKinematics_printResults__SWIG_3(swigCPtr, this, aBaseName);
  }

}
