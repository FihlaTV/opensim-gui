/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class CoordinateSet extends ModelComponentSetCoordinates {
  private long swigCPtr;

  public CoordinateSet(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.CoordinateSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(CoordinateSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_CoordinateSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static CoordinateSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.CoordinateSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new CoordinateSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.CoordinateSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.CoordinateSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.CoordinateSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new CoordinateSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.CoordinateSet_getConcreteClassName(swigCPtr, this);
  }

  public CoordinateSet() {
    this(opensimModelJNI.new_CoordinateSet__SWIG_0(), true);
  }

  public CoordinateSet(Model model) {
    this(opensimModelJNI.new_CoordinateSet__SWIG_1(Model.getCPtr(model), model), true);
  }

  public CoordinateSet(Model model, String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_CoordinateSet__SWIG_2(Model.getCPtr(model), model, aFileName, aUpdateFromXMLNode), true);
  }

  public CoordinateSet(Model model, String aFileName) {
    this(opensimModelJNI.new_CoordinateSet__SWIG_3(Model.getCPtr(model), model, aFileName), true);
  }

  public CoordinateSet(CoordinateSet aCoordinateSet) {
    this(opensimModelJNI.new_CoordinateSet__SWIG_4(CoordinateSet.getCPtr(aCoordinateSet), aCoordinateSet), true);
  }

  public void populate(Model model) {
    opensimModelJNI.CoordinateSet_populate(swigCPtr, this, Model.getCPtr(model), model);
  }

  public void getSpeedNames(ArrayStr rNames) {
    opensimModelJNI.CoordinateSet_getSpeedNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

}
