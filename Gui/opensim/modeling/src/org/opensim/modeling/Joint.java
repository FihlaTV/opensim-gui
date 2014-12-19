/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Joint extends ModelComponent {
  private long swigCPtr;

  public Joint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Joint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Joint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Joint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Joint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Joint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Joint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Joint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Joint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Joint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Joint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Joint_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_location_in_parent(Joint source) {
    opensimModelJNI.Joint_copyProperty_location_in_parent(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public Vec3 get_location_in_parent(int i) {
    return new Vec3(opensimModelJNI.Joint_get_location_in_parent__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_location_in_parent(int i) {
    return new Vec3(opensimModelJNI.Joint_upd_location_in_parent__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_location_in_parent(int i, Vec3 value) {
    opensimModelJNI.Joint_set_location_in_parent__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_location_in_parent(Vec3 value) {
    return opensimModelJNI.Joint_append_location_in_parent(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_location_in_parent(Vec3 initValue) {
    opensimModelJNI.Joint_constructProperty_location_in_parent(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_location_in_parent() {
    return new Vec3(opensimModelJNI.Joint_get_location_in_parent__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_location_in_parent() {
    return new Vec3(opensimModelJNI.Joint_upd_location_in_parent__SWIG_1(swigCPtr, this), false);
  }

  public void set_location_in_parent(Vec3 value) {
    opensimModelJNI.Joint_set_location_in_parent__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_orientation_in_parent(Joint source) {
    opensimModelJNI.Joint_copyProperty_orientation_in_parent(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public Vec3 get_orientation_in_parent(int i) {
    return new Vec3(opensimModelJNI.Joint_get_orientation_in_parent__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_orientation_in_parent(int i) {
    return new Vec3(opensimModelJNI.Joint_upd_orientation_in_parent__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_orientation_in_parent(int i, Vec3 value) {
    opensimModelJNI.Joint_set_orientation_in_parent__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_orientation_in_parent(Vec3 value) {
    return opensimModelJNI.Joint_append_orientation_in_parent(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_orientation_in_parent(Vec3 initValue) {
    opensimModelJNI.Joint_constructProperty_orientation_in_parent(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_orientation_in_parent() {
    return new Vec3(opensimModelJNI.Joint_get_orientation_in_parent__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_orientation_in_parent() {
    return new Vec3(opensimModelJNI.Joint_upd_orientation_in_parent__SWIG_1(swigCPtr, this), false);
  }

  public void set_orientation_in_parent(Vec3 value) {
    opensimModelJNI.Joint_set_orientation_in_parent__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_location_in_child(Joint source) {
    opensimModelJNI.Joint_copyProperty_location_in_child(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public Vec3 get_location_in_child(int i) {
    return new Vec3(opensimModelJNI.Joint_get_location_in_child__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_location_in_child(int i) {
    return new Vec3(opensimModelJNI.Joint_upd_location_in_child__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_location_in_child(int i, Vec3 value) {
    opensimModelJNI.Joint_set_location_in_child__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_location_in_child(Vec3 value) {
    return opensimModelJNI.Joint_append_location_in_child(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_location_in_child(Vec3 initValue) {
    opensimModelJNI.Joint_constructProperty_location_in_child(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_location_in_child() {
    return new Vec3(opensimModelJNI.Joint_get_location_in_child__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_location_in_child() {
    return new Vec3(opensimModelJNI.Joint_upd_location_in_child__SWIG_1(swigCPtr, this), false);
  }

  public void set_location_in_child(Vec3 value) {
    opensimModelJNI.Joint_set_location_in_child__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_orientation_in_child(Joint source) {
    opensimModelJNI.Joint_copyProperty_orientation_in_child(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public Vec3 get_orientation_in_child(int i) {
    return new Vec3(opensimModelJNI.Joint_get_orientation_in_child__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_orientation_in_child(int i) {
    return new Vec3(opensimModelJNI.Joint_upd_orientation_in_child__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_orientation_in_child(int i, Vec3 value) {
    opensimModelJNI.Joint_set_orientation_in_child__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_orientation_in_child(Vec3 value) {
    return opensimModelJNI.Joint_append_orientation_in_child(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_orientation_in_child(Vec3 initValue) {
    opensimModelJNI.Joint_constructProperty_orientation_in_child(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_orientation_in_child() {
    return new Vec3(opensimModelJNI.Joint_get_orientation_in_child__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_orientation_in_child() {
    return new Vec3(opensimModelJNI.Joint_upd_orientation_in_child__SWIG_1(swigCPtr, this), false);
  }

  public void set_orientation_in_child(Vec3 value) {
    opensimModelJNI.Joint_set_orientation_in_child__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_CoordinateSet(Joint source) {
    opensimModelJNI.Joint_copyProperty_CoordinateSet(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public CoordinateSet get_CoordinateSet(int i) {
    return new CoordinateSet(opensimModelJNI.Joint_get_CoordinateSet__SWIG_0(swigCPtr, this, i), false);
  }

  public CoordinateSet upd_CoordinateSet(int i) {
    return new CoordinateSet(opensimModelJNI.Joint_upd_CoordinateSet__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_CoordinateSet(int i, CoordinateSet value) {
    opensimModelJNI.Joint_set_CoordinateSet__SWIG_0(swigCPtr, this, i, CoordinateSet.getCPtr(value), value);
  }

  public int append_CoordinateSet(CoordinateSet value) {
    return opensimModelJNI.Joint_append_CoordinateSet(swigCPtr, this, CoordinateSet.getCPtr(value), value);
  }

  public void constructProperty_CoordinateSet(CoordinateSet initValue) {
    opensimModelJNI.Joint_constructProperty_CoordinateSet(swigCPtr, this, CoordinateSet.getCPtr(initValue), initValue);
  }

  public CoordinateSet get_CoordinateSet() {
    return new CoordinateSet(opensimModelJNI.Joint_get_CoordinateSet__SWIG_1(swigCPtr, this), false);
  }

  public CoordinateSet upd_CoordinateSet() {
    return new CoordinateSet(opensimModelJNI.Joint_upd_CoordinateSet__SWIG_1(swigCPtr, this), false);
  }

  public void set_CoordinateSet(CoordinateSet value) {
    opensimModelJNI.Joint_set_CoordinateSet__SWIG_1(swigCPtr, this, CoordinateSet.getCPtr(value), value);
  }

  public void copyProperty_reverse(Joint source) {
    opensimModelJNI.Joint_copyProperty_reverse(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public boolean get_reverse(int i) {
    return opensimModelJNI.Joint_get_reverse__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_reverse(int i) {
    return new SWIGTYPE_p_bool(opensimModelJNI.Joint_upd_reverse__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_reverse(int i, boolean value) {
    opensimModelJNI.Joint_set_reverse__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_reverse(boolean value) {
    return opensimModelJNI.Joint_append_reverse(swigCPtr, this, value);
  }

  public void constructProperty_reverse(boolean initValue) {
    opensimModelJNI.Joint_constructProperty_reverse(swigCPtr, this, initValue);
  }

  public boolean get_reverse() {
    return opensimModelJNI.Joint_get_reverse__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_reverse() {
    return new SWIGTYPE_p_bool(opensimModelJNI.Joint_upd_reverse__SWIG_1(swigCPtr, this), false);
  }

  public void set_reverse(boolean value) {
    opensimModelJNI.Joint_set_reverse__SWIG_1(swigCPtr, this, value);
  }

  public void setChildBodyName(String name) {
    opensimModelJNI.Joint_setChildBodyName(swigCPtr, this, name);
  }

  public String getChildBodyName() {
    return opensimModelJNI.Joint_getChildBodyName(swigCPtr, this);
  }

  public void setChildBody(Body child) {
    opensimModelJNI.Joint_setChildBody(swigCPtr, this, Body.getCPtr(child), child);
  }

  public Body getChildBody() {
    return new Body(opensimModelJNI.Joint_getChildBody(swigCPtr, this), false);
  }

  public void setLocationInChild(Vec3 aLocation) {
    opensimModelJNI.Joint_setLocationInChild(swigCPtr, this, Vec3.getCPtr(aLocation), aLocation);
  }

  public Vec3 getLocationInChild() {
    return new Vec3(opensimModelJNI.Joint_getLocationInChild(swigCPtr, this), false);
  }

  public void setOrientationInChild(Vec3 aOrientation) {
    opensimModelJNI.Joint_setOrientationInChild(swigCPtr, this, Vec3.getCPtr(aOrientation), aOrientation);
  }

  public Vec3 getOrientationInChild() {
    return new Vec3(opensimModelJNI.Joint_getOrientationInChild(swigCPtr, this), false);
  }

  public void setParentBodyName(String aName) {
    opensimModelJNI.Joint_setParentBodyName(swigCPtr, this, aName);
  }

  public String getParentBodyName() {
    return opensimModelJNI.Joint_getParentBodyName(swigCPtr, this);
  }

  public void setParentBody(Body parent) {
    opensimModelJNI.Joint_setParentBody(swigCPtr, this, Body.getCPtr(parent), parent);
  }

  public Body getParentBody() {
    return new Body(opensimModelJNI.Joint_getParentBody(swigCPtr, this), false);
  }

  public void setLocationInParent(Vec3 aLocation) {
    opensimModelJNI.Joint_setLocationInParent(swigCPtr, this, Vec3.getCPtr(aLocation), aLocation);
  }

  public Vec3 getLocationInParent() {
    return new Vec3(opensimModelJNI.Joint_getLocationInParent(swigCPtr, this), false);
  }

  public void setOrientationInParent(Vec3 aOrientation) {
    opensimModelJNI.Joint_setOrientationInParent(swigCPtr, this, Vec3.getCPtr(aOrientation), aOrientation);
  }

  public Vec3 getOrientationInParent() {
    return new Vec3(opensimModelJNI.Joint_getOrientationInParent(swigCPtr, this), false);
  }

  public Transform getParentTransform() {
    return new Transform(opensimModelJNI.Joint_getParentTransform(swigCPtr, this), false);
  }

  public Transform getChildTransform() {
    return new Transform(opensimModelJNI.Joint_getChildTransform(swigCPtr, this), false);
  }

  public CoordinateSet getCoordinateSet() {
    return new CoordinateSet(opensimModelJNI.Joint_getCoordinateSet(swigCPtr, this), false);
  }

  public boolean getReverse() {
    return opensimModelJNI.Joint_getReverse(swigCPtr, this);
  }

  public int numCoordinates() {
    return opensimModelJNI.Joint_numCoordinates(swigCPtr, this);
  }

  public boolean isCoordinateUsed(Coordinate aCoordinate) {
    return opensimModelJNI.Joint_isCoordinateUsed(swigCPtr, this, Coordinate.getCPtr(aCoordinate), aCoordinate);
  }

  public SpatialVec calcEquivalentSpatialForce(State s, Vector mobilityForces) {
    return new SpatialVec(opensimModelJNI.Joint_calcEquivalentSpatialForce(swigCPtr, this, State.getCPtr(s), s, Vector.getCPtr(mobilityForces), mobilityForces), true);
  }

  public double calcPower(State s) {
    return opensimModelJNI.Joint_calcPower(swigCPtr, this, State.getCPtr(s), s);
  }

  public void scale(ScaleSet aScaleSet) {
    opensimModelJNI.Joint_scale(swigCPtr, this, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

}
