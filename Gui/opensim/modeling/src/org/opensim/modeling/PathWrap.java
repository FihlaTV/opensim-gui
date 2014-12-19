/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PathWrap extends OpenSimObject {
  private long swigCPtr;

  public PathWrap(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.PathWrap_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PathWrap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_PathWrap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PathWrap safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.PathWrap_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PathWrap(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.PathWrap_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.PathWrap_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.PathWrap_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PathWrap(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.PathWrap_getConcreteClassName(swigCPtr, this);
  }

  public PathWrap() {
    this(opensimModelJNI.new_PathWrap__SWIG_0(), true);
  }

  public PathWrap(PathWrap aPathWrap) {
    this(opensimModelJNI.new_PathWrap__SWIG_1(PathWrap.getCPtr(aPathWrap), aPathWrap), true);
  }

  public void copyData(PathWrap aPathWrap) {
    opensimModelJNI.PathWrap_copyData(swigCPtr, this, PathWrap.getCPtr(aPathWrap), aPathWrap);
  }

  public int getStartPoint() {
    return opensimModelJNI.PathWrap_getStartPoint(swigCPtr, this);
  }

  public int getEndPoint() {
    return opensimModelJNI.PathWrap_getEndPoint(swigCPtr, this);
  }

  public String getWrapObjectName() {
    return opensimModelJNI.PathWrap_getWrapObjectName(swigCPtr, this);
  }

  public WrapObject getWrapObject() {
    long cPtr = opensimModelJNI.PathWrap_getWrapObject(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapObject(cPtr, false);
  }

  public void setWrapObject(WrapObject aWrapObject) {
    opensimModelJNI.PathWrap_setWrapObject(swigCPtr, this, WrapObject.getCPtr(aWrapObject), aWrapObject);
  }

  public SWIGTYPE_p_PathWrapPoint getWrapPoint(int aIndex) {
    return new SWIGTYPE_p_PathWrapPoint(opensimModelJNI.PathWrap_getWrapPoint(swigCPtr, this, aIndex), false);
  }

  public PathWrap.WrapMethod getMethod() {
    return PathWrap.WrapMethod.swigToEnum(opensimModelJNI.PathWrap_getMethod(swigCPtr, this));
  }

  public void setMethod(PathWrap.WrapMethod aMethod) {
    opensimModelJNI.PathWrap_setMethod(swigCPtr, this, aMethod.swigValue());
  }

  public String getMethodName() {
    return opensimModelJNI.PathWrap_getMethodName(swigCPtr, this);
  }

  public GeometryPath getPath() {
    long cPtr = opensimModelJNI.PathWrap_getPath(swigCPtr, this);
    return (cPtr == 0) ? null : new GeometryPath(cPtr, false);
  }

  public SWIGTYPE_p_OpenSim__WrapResult getPreviousWrap() {
    return new SWIGTYPE_p_OpenSim__WrapResult(opensimModelJNI.PathWrap_getPreviousWrap(swigCPtr, this), false);
  }

  public void setPreviousWrap(SWIGTYPE_p_OpenSim__WrapResult aWrapResult) {
    opensimModelJNI.PathWrap_setPreviousWrap(swigCPtr, this, SWIGTYPE_p_OpenSim__WrapResult.getCPtr(aWrapResult));
  }

  public void resetPreviousWrap() {
    opensimModelJNI.PathWrap_resetPreviousWrap(swigCPtr, this);
  }

  public final static class WrapMethod {
    public final static PathWrap.WrapMethod hybrid = new PathWrap.WrapMethod("hybrid");
    public final static PathWrap.WrapMethod midpoint = new PathWrap.WrapMethod("midpoint");
    public final static PathWrap.WrapMethod axial = new PathWrap.WrapMethod("axial");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static WrapMethod swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + WrapMethod.class + " with value " + swigValue);
    }

    private WrapMethod(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private WrapMethod(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private WrapMethod(String swigName, WrapMethod swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static WrapMethod[] swigValues = { hybrid, midpoint, axial };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
