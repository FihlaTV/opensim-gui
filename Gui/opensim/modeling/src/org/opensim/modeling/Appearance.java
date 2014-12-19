/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Appearance extends OpenSimObject {
  private long swigCPtr;

  public Appearance(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Appearance_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Appearance obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Appearance(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Appearance safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Appearance_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Appearance(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Appearance_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Appearance_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Appearance_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Appearance(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Appearance_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_color(Appearance source) {
    opensimModelJNI.Appearance_copyProperty_color(swigCPtr, this, Appearance.getCPtr(source), source);
  }

  public Vec3 get_color(int i) {
    return new Vec3(opensimModelJNI.Appearance_get_color__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_color(int i) {
    return new Vec3(opensimModelJNI.Appearance_upd_color__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_color(int i, Vec3 value) {
    opensimModelJNI.Appearance_set_color__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_color(Vec3 value) {
    return opensimModelJNI.Appearance_append_color(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_color(Vec3 initValue) {
    opensimModelJNI.Appearance_constructProperty_color(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_color() {
    return new Vec3(opensimModelJNI.Appearance_get_color__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_color() {
    return new Vec3(opensimModelJNI.Appearance_upd_color__SWIG_1(swigCPtr, this), false);
  }

  public void set_color(Vec3 value) {
    opensimModelJNI.Appearance_set_color__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_opacity(Appearance source) {
    opensimModelJNI.Appearance_copyProperty_opacity(swigCPtr, this, Appearance.getCPtr(source), source);
  }

  public double get_opacity(int i) {
    return opensimModelJNI.Appearance_get_opacity__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_opacity(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Appearance_upd_opacity__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_opacity(int i, double value) {
    opensimModelJNI.Appearance_set_opacity__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_opacity(double value) {
    return opensimModelJNI.Appearance_append_opacity(swigCPtr, this, value);
  }

  public void constructProperty_opacity(double initValue) {
    opensimModelJNI.Appearance_constructProperty_opacity(swigCPtr, this, initValue);
  }

  public double get_opacity() {
    return opensimModelJNI.Appearance_get_opacity__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_opacity() {
    return new SWIGTYPE_p_double(opensimModelJNI.Appearance_upd_opacity__SWIG_1(swigCPtr, this), false);
  }

  public void set_opacity(double value) {
    opensimModelJNI.Appearance_set_opacity__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_representation(Appearance source) {
    opensimModelJNI.Appearance_copyProperty_representation(swigCPtr, this, Appearance.getCPtr(source), source);
  }

  public int get_representation(int i) {
    return opensimModelJNI.Appearance_get_representation__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_int upd_representation(int i) {
    return new SWIGTYPE_p_int(opensimModelJNI.Appearance_upd_representation__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_representation(int i, int value) {
    opensimModelJNI.Appearance_set_representation__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_representation(int value) {
    return opensimModelJNI.Appearance_append_representation(swigCPtr, this, value);
  }

  public void constructProperty_representation(int initValue) {
    opensimModelJNI.Appearance_constructProperty_representation(swigCPtr, this, initValue);
  }

  public int get_representation() {
    return opensimModelJNI.Appearance_get_representation__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_int upd_representation() {
    return new SWIGTYPE_p_int(opensimModelJNI.Appearance_upd_representation__SWIG_1(swigCPtr, this), false);
  }

  public void set_representation(int value) {
    opensimModelJNI.Appearance_set_representation__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_texture_file(Appearance source) {
    opensimModelJNI.Appearance_copyProperty_texture_file(swigCPtr, this, Appearance.getCPtr(source), source);
  }

  public String get_texture_file(int i) {
    return opensimModelJNI.Appearance_get_texture_file__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_texture_file(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.Appearance_upd_texture_file__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_texture_file(int i, String value) {
    opensimModelJNI.Appearance_set_texture_file__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_texture_file(String value) {
    return opensimModelJNI.Appearance_append_texture_file(swigCPtr, this, value);
  }

  public void constructProperty_texture_file() {
    opensimModelJNI.Appearance_constructProperty_texture_file__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_texture_file(String initValue) {
    opensimModelJNI.Appearance_constructProperty_texture_file__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_texture_file() {
    return opensimModelJNI.Appearance_get_texture_file__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_texture_file() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.Appearance_upd_texture_file__SWIG_1(swigCPtr, this), false);
  }

  public void set_texture_file(String value) {
    opensimModelJNI.Appearance_set_texture_file__SWIG_1(swigCPtr, this, value);
  }

  public Appearance() {
    this(opensimModelJNI.new_Appearance(), true);
  }

}
