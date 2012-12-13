/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class BushingForce extends Force {
  private long swigCPtr;

  public BushingForce(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.BushingForce_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(BushingForce obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_BushingForce(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static BushingForce safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.BushingForce_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new BushingForce(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.BushingForce_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.BushingForce_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.BushingForce_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new BushingForce(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.BushingForce_getConcreteClassName(swigCPtr, this);
  }

  public void setPropertyIndex_body_1(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.BushingForce_PropertyIndex_body_1_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_body_1() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.BushingForce_PropertyIndex_body_1_get(swigCPtr, this), true);
  }

  public void copyProperty_body_1(BushingForce source) {
    opensimModelJNI.BushingForce_copyProperty_body_1(swigCPtr, this, BushingForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_std__string_t getProperty_body_1() {
    return new SWIGTYPE_p_OpenSim__PropertyT_std__string_t(opensimModelJNI.BushingForce_getProperty_body_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_std__string_t updProperty_body_1() {
    return new SWIGTYPE_p_OpenSim__PropertyT_std__string_t(opensimModelJNI.BushingForce_updProperty_body_1(swigCPtr, this), false);
  }

  public String get_body_1(int i) {
    return opensimModelJNI.BushingForce_get_body_1__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_body_1(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.BushingForce_upd_body_1__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_body_1(int i, String value) {
    opensimModelJNI.BushingForce_set_body_1__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_body_1(String value) {
    return opensimModelJNI.BushingForce_append_body_1(swigCPtr, this, value);
  }

  public void constructProperty_body_1() {
    opensimModelJNI.BushingForce_constructProperty_body_1__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_body_1(String initValue) {
    opensimModelJNI.BushingForce_constructProperty_body_1__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_body_1() {
    return opensimModelJNI.BushingForce_get_body_1__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_body_1() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.BushingForce_upd_body_1__SWIG_1(swigCPtr, this), false);
  }

  public void set_body_1(String value) {
    opensimModelJNI.BushingForce_set_body_1__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_body_2(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.BushingForce_PropertyIndex_body_2_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_body_2() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.BushingForce_PropertyIndex_body_2_get(swigCPtr, this), true);
  }

  public void copyProperty_body_2(BushingForce source) {
    opensimModelJNI.BushingForce_copyProperty_body_2(swigCPtr, this, BushingForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_std__string_t getProperty_body_2() {
    return new SWIGTYPE_p_OpenSim__PropertyT_std__string_t(opensimModelJNI.BushingForce_getProperty_body_2(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_std__string_t updProperty_body_2() {
    return new SWIGTYPE_p_OpenSim__PropertyT_std__string_t(opensimModelJNI.BushingForce_updProperty_body_2(swigCPtr, this), false);
  }

  public String get_body_2(int i) {
    return opensimModelJNI.BushingForce_get_body_2__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_body_2(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.BushingForce_upd_body_2__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_body_2(int i, String value) {
    opensimModelJNI.BushingForce_set_body_2__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_body_2(String value) {
    return opensimModelJNI.BushingForce_append_body_2(swigCPtr, this, value);
  }

  public void constructProperty_body_2() {
    opensimModelJNI.BushingForce_constructProperty_body_2__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_body_2(String initValue) {
    opensimModelJNI.BushingForce_constructProperty_body_2__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_body_2() {
    return opensimModelJNI.BushingForce_get_body_2__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_body_2() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.BushingForce_upd_body_2__SWIG_1(swigCPtr, this), false);
  }

  public void set_body_2(String value) {
    opensimModelJNI.BushingForce_set_body_2__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_location_body_1(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.BushingForce_PropertyIndex_location_body_1_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_location_body_1() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.BushingForce_PropertyIndex_location_body_1_get(swigCPtr, this), true);
  }

  public void copyProperty_location_body_1(BushingForce source) {
    opensimModelJNI.BushingForce_copyProperty_location_body_1(swigCPtr, this, BushingForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t getProperty_location_body_1() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_getProperty_location_body_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t updProperty_location_body_1() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_updProperty_location_body_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 get_location_body_1(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_location_body_1__SWIG_0(swigCPtr, this, i), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_location_body_1(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_location_body_1__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_location_body_1(int i, SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_location_body_1__SWIG_0(swigCPtr, this, i, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public int append_location_body_1(SWIGTYPE_p_SimTK__Vec3 value) {
    return opensimModelJNI.BushingForce_append_location_body_1(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public void constructProperty_location_body_1(SWIGTYPE_p_SimTK__Vec3 initValue) {
    opensimModelJNI.BushingForce_constructProperty_location_body_1(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(initValue));
  }

  public SWIGTYPE_p_SimTK__Vec3 get_location_body_1() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_location_body_1__SWIG_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_location_body_1() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_location_body_1__SWIG_1(swigCPtr, this), false);
  }

  public void set_location_body_1(SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_location_body_1__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public void setPropertyIndex_orientation_body_1(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.BushingForce_PropertyIndex_orientation_body_1_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_orientation_body_1() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.BushingForce_PropertyIndex_orientation_body_1_get(swigCPtr, this), true);
  }

  public void copyProperty_orientation_body_1(BushingForce source) {
    opensimModelJNI.BushingForce_copyProperty_orientation_body_1(swigCPtr, this, BushingForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t getProperty_orientation_body_1() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_getProperty_orientation_body_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t updProperty_orientation_body_1() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_updProperty_orientation_body_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 get_orientation_body_1(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_orientation_body_1__SWIG_0(swigCPtr, this, i), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_orientation_body_1(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_orientation_body_1__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_orientation_body_1(int i, SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_orientation_body_1__SWIG_0(swigCPtr, this, i, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public int append_orientation_body_1(SWIGTYPE_p_SimTK__Vec3 value) {
    return opensimModelJNI.BushingForce_append_orientation_body_1(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public void constructProperty_orientation_body_1(SWIGTYPE_p_SimTK__Vec3 initValue) {
    opensimModelJNI.BushingForce_constructProperty_orientation_body_1(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(initValue));
  }

  public SWIGTYPE_p_SimTK__Vec3 get_orientation_body_1() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_orientation_body_1__SWIG_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_orientation_body_1() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_orientation_body_1__SWIG_1(swigCPtr, this), false);
  }

  public void set_orientation_body_1(SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_orientation_body_1__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public void setPropertyIndex_location_body_2(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.BushingForce_PropertyIndex_location_body_2_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_location_body_2() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.BushingForce_PropertyIndex_location_body_2_get(swigCPtr, this), true);
  }

  public void copyProperty_location_body_2(BushingForce source) {
    opensimModelJNI.BushingForce_copyProperty_location_body_2(swigCPtr, this, BushingForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t getProperty_location_body_2() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_getProperty_location_body_2(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t updProperty_location_body_2() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_updProperty_location_body_2(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 get_location_body_2(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_location_body_2__SWIG_0(swigCPtr, this, i), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_location_body_2(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_location_body_2__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_location_body_2(int i, SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_location_body_2__SWIG_0(swigCPtr, this, i, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public int append_location_body_2(SWIGTYPE_p_SimTK__Vec3 value) {
    return opensimModelJNI.BushingForce_append_location_body_2(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public void constructProperty_location_body_2(SWIGTYPE_p_SimTK__Vec3 initValue) {
    opensimModelJNI.BushingForce_constructProperty_location_body_2(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(initValue));
  }

  public SWIGTYPE_p_SimTK__Vec3 get_location_body_2() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_location_body_2__SWIG_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_location_body_2() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_location_body_2__SWIG_1(swigCPtr, this), false);
  }

  public void set_location_body_2(SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_location_body_2__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public void setPropertyIndex_orientation_body_2(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.BushingForce_PropertyIndex_orientation_body_2_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_orientation_body_2() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.BushingForce_PropertyIndex_orientation_body_2_get(swigCPtr, this), true);
  }

  public void copyProperty_orientation_body_2(BushingForce source) {
    opensimModelJNI.BushingForce_copyProperty_orientation_body_2(swigCPtr, this, BushingForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t getProperty_orientation_body_2() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_getProperty_orientation_body_2(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t updProperty_orientation_body_2() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_updProperty_orientation_body_2(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 get_orientation_body_2(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_orientation_body_2__SWIG_0(swigCPtr, this, i), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_orientation_body_2(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_orientation_body_2__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_orientation_body_2(int i, SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_orientation_body_2__SWIG_0(swigCPtr, this, i, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public int append_orientation_body_2(SWIGTYPE_p_SimTK__Vec3 value) {
    return opensimModelJNI.BushingForce_append_orientation_body_2(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public void constructProperty_orientation_body_2(SWIGTYPE_p_SimTK__Vec3 initValue) {
    opensimModelJNI.BushingForce_constructProperty_orientation_body_2(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(initValue));
  }

  public SWIGTYPE_p_SimTK__Vec3 get_orientation_body_2() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_orientation_body_2__SWIG_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_orientation_body_2() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_orientation_body_2__SWIG_1(swigCPtr, this), false);
  }

  public void set_orientation_body_2(SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_orientation_body_2__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public void setPropertyIndex_rotational_stiffness(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.BushingForce_PropertyIndex_rotational_stiffness_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_rotational_stiffness() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.BushingForce_PropertyIndex_rotational_stiffness_get(swigCPtr, this), true);
  }

  public void copyProperty_rotational_stiffness(BushingForce source) {
    opensimModelJNI.BushingForce_copyProperty_rotational_stiffness(swigCPtr, this, BushingForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t getProperty_rotational_stiffness() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_getProperty_rotational_stiffness(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t updProperty_rotational_stiffness() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_updProperty_rotational_stiffness(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 get_rotational_stiffness(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_rotational_stiffness__SWIG_0(swigCPtr, this, i), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_rotational_stiffness(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_rotational_stiffness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_rotational_stiffness(int i, SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_rotational_stiffness__SWIG_0(swigCPtr, this, i, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public int append_rotational_stiffness(SWIGTYPE_p_SimTK__Vec3 value) {
    return opensimModelJNI.BushingForce_append_rotational_stiffness(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public void constructProperty_rotational_stiffness(SWIGTYPE_p_SimTK__Vec3 initValue) {
    opensimModelJNI.BushingForce_constructProperty_rotational_stiffness(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(initValue));
  }

  public SWIGTYPE_p_SimTK__Vec3 get_rotational_stiffness() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_rotational_stiffness__SWIG_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_rotational_stiffness() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_rotational_stiffness__SWIG_1(swigCPtr, this), false);
  }

  public void set_rotational_stiffness(SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_rotational_stiffness__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public void setPropertyIndex_translational_stiffness(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.BushingForce_PropertyIndex_translational_stiffness_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_translational_stiffness() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.BushingForce_PropertyIndex_translational_stiffness_get(swigCPtr, this), true);
  }

  public void copyProperty_translational_stiffness(BushingForce source) {
    opensimModelJNI.BushingForce_copyProperty_translational_stiffness(swigCPtr, this, BushingForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t getProperty_translational_stiffness() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_getProperty_translational_stiffness(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t updProperty_translational_stiffness() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_updProperty_translational_stiffness(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 get_translational_stiffness(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_translational_stiffness__SWIG_0(swigCPtr, this, i), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_translational_stiffness(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_translational_stiffness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_translational_stiffness(int i, SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_translational_stiffness__SWIG_0(swigCPtr, this, i, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public int append_translational_stiffness(SWIGTYPE_p_SimTK__Vec3 value) {
    return opensimModelJNI.BushingForce_append_translational_stiffness(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public void constructProperty_translational_stiffness(SWIGTYPE_p_SimTK__Vec3 initValue) {
    opensimModelJNI.BushingForce_constructProperty_translational_stiffness(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(initValue));
  }

  public SWIGTYPE_p_SimTK__Vec3 get_translational_stiffness() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_translational_stiffness__SWIG_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_translational_stiffness() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_translational_stiffness__SWIG_1(swigCPtr, this), false);
  }

  public void set_translational_stiffness(SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_translational_stiffness__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public void setPropertyIndex_rotational_damping(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.BushingForce_PropertyIndex_rotational_damping_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_rotational_damping() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.BushingForce_PropertyIndex_rotational_damping_get(swigCPtr, this), true);
  }

  public void copyProperty_rotational_damping(BushingForce source) {
    opensimModelJNI.BushingForce_copyProperty_rotational_damping(swigCPtr, this, BushingForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t getProperty_rotational_damping() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_getProperty_rotational_damping(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t updProperty_rotational_damping() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_updProperty_rotational_damping(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 get_rotational_damping(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_rotational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_rotational_damping(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_rotational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_rotational_damping(int i, SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_rotational_damping__SWIG_0(swigCPtr, this, i, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public int append_rotational_damping(SWIGTYPE_p_SimTK__Vec3 value) {
    return opensimModelJNI.BushingForce_append_rotational_damping(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public void constructProperty_rotational_damping(SWIGTYPE_p_SimTK__Vec3 initValue) {
    opensimModelJNI.BushingForce_constructProperty_rotational_damping(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(initValue));
  }

  public SWIGTYPE_p_SimTK__Vec3 get_rotational_damping() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_rotational_damping__SWIG_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_rotational_damping() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_rotational_damping__SWIG_1(swigCPtr, this), false);
  }

  public void set_rotational_damping(SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_rotational_damping__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public void setPropertyIndex_translational_damping(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.BushingForce_PropertyIndex_translational_damping_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_translational_damping() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.BushingForce_PropertyIndex_translational_damping_get(swigCPtr, this), true);
  }

  public void copyProperty_translational_damping(BushingForce source) {
    opensimModelJNI.BushingForce_copyProperty_translational_damping(swigCPtr, this, BushingForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t getProperty_translational_damping() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_getProperty_translational_damping(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t updProperty_translational_damping() {
    return new SWIGTYPE_p_OpenSim__PropertyT_SimTK__Vec3_t(opensimModelJNI.BushingForce_updProperty_translational_damping(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 get_translational_damping(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_translational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_translational_damping(int i) {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_translational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_translational_damping(int i, SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_translational_damping__SWIG_0(swigCPtr, this, i, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public int append_translational_damping(SWIGTYPE_p_SimTK__Vec3 value) {
    return opensimModelJNI.BushingForce_append_translational_damping(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public void constructProperty_translational_damping(SWIGTYPE_p_SimTK__Vec3 initValue) {
    opensimModelJNI.BushingForce_constructProperty_translational_damping(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(initValue));
  }

  public SWIGTYPE_p_SimTK__Vec3 get_translational_damping() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_get_translational_damping__SWIG_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__Vec3 upd_translational_damping() {
    return new SWIGTYPE_p_SimTK__Vec3(opensimModelJNI.BushingForce_upd_translational_damping__SWIG_1(swigCPtr, this), false);
  }

  public void set_translational_damping(SWIGTYPE_p_SimTK__Vec3 value) {
    opensimModelJNI.BushingForce_set_translational_damping__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(value));
  }

  public BushingForce() {
    this(opensimModelJNI.new_BushingForce__SWIG_0(), true);
  }

  public BushingForce(String body1Name, SWIGTYPE_p_SimTK__Vec3 point1, SWIGTYPE_p_SimTK__Vec3 orientation1, String body2Name, SWIGTYPE_p_SimTK__Vec3 point2, SWIGTYPE_p_SimTK__Vec3 orientation2, SWIGTYPE_p_SimTK__Vec3 transStiffness, SWIGTYPE_p_SimTK__Vec3 rotStiffness, SWIGTYPE_p_SimTK__Vec3 transDamping, SWIGTYPE_p_SimTK__Vec3 rotDamping) {
    this(opensimModelJNI.new_BushingForce__SWIG_1(body1Name, SWIGTYPE_p_SimTK__Vec3.getCPtr(point1), SWIGTYPE_p_SimTK__Vec3.getCPtr(orientation1), body2Name, SWIGTYPE_p_SimTK__Vec3.getCPtr(point2), SWIGTYPE_p_SimTK__Vec3.getCPtr(orientation2), SWIGTYPE_p_SimTK__Vec3.getCPtr(transStiffness), SWIGTYPE_p_SimTK__Vec3.getCPtr(rotStiffness), SWIGTYPE_p_SimTK__Vec3.getCPtr(transDamping), SWIGTYPE_p_SimTK__Vec3.getCPtr(rotDamping)), true);
  }

  public void setBody1ByName(String aBodyName) {
    opensimModelJNI.BushingForce_setBody1ByName(swigCPtr, this, aBodyName);
  }

  public void setBody1BushingLocation(SWIGTYPE_p_SimTK__Vec3 location, SWIGTYPE_p_SimTK__Vec3 orientation) {
    opensimModelJNI.BushingForce_setBody1BushingLocation__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(location), SWIGTYPE_p_SimTK__Vec3.getCPtr(orientation));
  }

  public void setBody1BushingLocation(SWIGTYPE_p_SimTK__Vec3 location) {
    opensimModelJNI.BushingForce_setBody1BushingLocation__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(location));
  }

  public void setBody2ByName(String aBodyName) {
    opensimModelJNI.BushingForce_setBody2ByName(swigCPtr, this, aBodyName);
  }

  public void setBody2BushingLocation(SWIGTYPE_p_SimTK__Vec3 location, SWIGTYPE_p_SimTK__Vec3 orientation) {
    opensimModelJNI.BushingForce_setBody2BushingLocation__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(location), SWIGTYPE_p_SimTK__Vec3.getCPtr(orientation));
  }

  public void setBody2BushingLocation(SWIGTYPE_p_SimTK__Vec3 location) {
    opensimModelJNI.BushingForce_setBody2BushingLocation__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Vec3.getCPtr(location));
  }

  public double computePotentialEnergy(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.BushingForce_computePotentialEnergy(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimModelJNI.BushingForce_getRecordLabels(swigCPtr, this), true);
  }

  public ArrayDouble getRecordValues(SWIGTYPE_p_SimTK__State state) {
    return new ArrayDouble(opensimModelJNI.BushingForce_getRecordValues(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state)), true);
  }

}
