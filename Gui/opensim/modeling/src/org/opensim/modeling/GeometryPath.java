/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class GeometryPath extends ModelComponent {
  private long swigCPtr;

  public GeometryPath(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.GeometryPath_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(GeometryPath obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_GeometryPath(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static GeometryPath safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.GeometryPath_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new GeometryPath(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.GeometryPath_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.GeometryPath_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.GeometryPath_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new GeometryPath(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.GeometryPath_getConcreteClassName(swigCPtr, this);
  }

  public GeometryPath() {
    this(opensimModelJNI.new_GeometryPath(), true);
  }

  public PathPointSet getPathPointSet() {
    return new PathPointSet(opensimModelJNI.GeometryPath_getPathPointSet(swigCPtr, this), false);
  }

  public PathPointSet updPathPointSet() {
    return new PathPointSet(opensimModelJNI.GeometryPath_updPathPointSet(swigCPtr, this), false);
  }

  public PathWrapSet getWrapSet() {
    return new PathWrapSet(opensimModelJNI.GeometryPath_getWrapSet(swigCPtr, this), false);
  }

  public void addPathWrap(WrapObject aWrapObject) {
    opensimModelJNI.GeometryPath_addPathWrap(swigCPtr, this, WrapObject.getCPtr(aWrapObject), aWrapObject);
  }

  public PathPoint addPathPoint(State s, int aIndex, Body aBody) {
    long cPtr = opensimModelJNI.GeometryPath_addPathPoint(swigCPtr, this, State.getCPtr(s), s, aIndex, Body.getCPtr(aBody), aBody);
    return (cPtr == 0) ? null : new PathPoint(cPtr, false);
  }

  public PathPoint appendNewPathPoint(String proposedName, Body aBody, Vec3 aPositionOnBody) {
    long cPtr = opensimModelJNI.GeometryPath_appendNewPathPoint(swigCPtr, this, proposedName, Body.getCPtr(aBody), aBody, Vec3.getCPtr(aPositionOnBody), aPositionOnBody);
    return (cPtr == 0) ? null : new PathPoint(cPtr, false);
  }

  public boolean canDeletePathPoint(int aIndex) {
    return opensimModelJNI.GeometryPath_canDeletePathPoint(swigCPtr, this, aIndex);
  }

  public boolean deletePathPoint(State s, int aIndex) {
    return opensimModelJNI.GeometryPath_deletePathPoint(swigCPtr, this, State.getCPtr(s), s, aIndex);
  }

  public void moveUpPathWrap(State s, int aIndex) {
    opensimModelJNI.GeometryPath_moveUpPathWrap(swigCPtr, this, State.getCPtr(s), s, aIndex);
  }

  public void moveDownPathWrap(State s, int aIndex) {
    opensimModelJNI.GeometryPath_moveDownPathWrap(swigCPtr, this, State.getCPtr(s), s, aIndex);
  }

  public void deletePathWrap(State s, int aIndex) {
    opensimModelJNI.GeometryPath_deletePathWrap(swigCPtr, this, State.getCPtr(s), s, aIndex);
  }

  public boolean replacePathPoint(State s, PathPoint aOldPathPoint, PathPoint aNewPathPoint) {
    return opensimModelJNI.GeometryPath_replacePathPoint(swigCPtr, this, State.getCPtr(s), s, PathPoint.getCPtr(aOldPathPoint), aOldPathPoint, PathPoint.getCPtr(aNewPathPoint), aNewPathPoint);
  }

  public OpenSimObject getOwner() {
    long cPtr = opensimModelJNI.GeometryPath_getOwner(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public void setOwner(OpenSimObject anObject) {
    opensimModelJNI.GeometryPath_setOwner(swigCPtr, this, OpenSimObject.getCPtr(anObject), anObject);
  }

  public void setDefaultColor(Vec3 color) {
    opensimModelJNI.GeometryPath_setDefaultColor(swigCPtr, this, Vec3.getCPtr(color), color);
  }

  public Vec3 getDefaultColor() {
    return new Vec3(opensimModelJNI.GeometryPath_getDefaultColor(swigCPtr, this), false);
  }

  public void setColor(State s, Vec3 color) {
    opensimModelJNI.GeometryPath_setColor(swigCPtr, this, State.getCPtr(s), s, Vec3.getCPtr(color), color);
  }

  public Vec3 getColor(State s) {
    return new Vec3(opensimModelJNI.GeometryPath_getColor(swigCPtr, this, State.getCPtr(s), s), true);
  }

  public double getLength(State s) {
    return opensimModelJNI.GeometryPath_getLength(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setLength(State s, double length) {
    opensimModelJNI.GeometryPath_setLength(swigCPtr, this, State.getCPtr(s), s, length);
  }

  public double getPreScaleLength(State s) {
    return opensimModelJNI.GeometryPath_getPreScaleLength(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setPreScaleLength(State s, double preScaleLength) {
    opensimModelJNI.GeometryPath_setPreScaleLength(swigCPtr, this, State.getCPtr(s), s, preScaleLength);
  }

  public ArrayPathPoint getCurrentPath(State s) {
    return new ArrayPathPoint(opensimModelJNI.GeometryPath_getCurrentPath(swigCPtr, this, State.getCPtr(s), s), false);
  }

  public ArrayPathPoint getCurrentDisplayPath(State s) {
    return new ArrayPathPoint(opensimModelJNI.GeometryPath_getCurrentDisplayPath(swigCPtr, this, State.getCPtr(s), s), false);
  }

  public double getLengtheningSpeed(State s) {
    return opensimModelJNI.GeometryPath_getLengtheningSpeed(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setLengtheningSpeed(State s, double speed) {
    opensimModelJNI.GeometryPath_setLengtheningSpeed(swigCPtr, this, State.getCPtr(s), s, speed);
  }

  public void getPointForceDirections(State s, ArrayPointForceDirection rPFDs) {
    opensimModelJNI.GeometryPath_getPointForceDirections(swigCPtr, this, State.getCPtr(s), s, ArrayPointForceDirection.getCPtr(rPFDs), rPFDs);
  }

  public void addInEquivalentForces(State state, double tension, VectorOfSpatialVec bodyForces, Vector mobilityForces) {
    opensimModelJNI.GeometryPath_addInEquivalentForces(swigCPtr, this, State.getCPtr(state), state, tension, VectorOfSpatialVec.getCPtr(bodyForces), bodyForces, Vector.getCPtr(mobilityForces), mobilityForces);
  }

  public double computeMomentArm(State s, Coordinate aCoord) {
    return opensimModelJNI.GeometryPath_computeMomentArm(swigCPtr, this, State.getCPtr(s), s, Coordinate.getCPtr(aCoord), aCoord);
  }

  public void preScale(State s, ScaleSet aScaleSet) {
    opensimModelJNI.GeometryPath_preScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

  public void scale(State s, ScaleSet aScaleSet) {
    opensimModelJNI.GeometryPath_scale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

  public void postScale(State s, ScaleSet aScaleSet) {
    opensimModelJNI.GeometryPath_postScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

  public void updateGeometry(State s) {
    opensimModelJNI.GeometryPath_updateGeometry(swigCPtr, this, State.getCPtr(s), s);
  }

}
