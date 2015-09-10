/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ForceVelocityCurve extends Function {
  private long swigCPtr;

  public ForceVelocityCurve(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ForceVelocityCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ForceVelocityCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ForceVelocityCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ForceVelocityCurve safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ForceVelocityCurve_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ForceVelocityCurve(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ForceVelocityCurve_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ForceVelocityCurve_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ForceVelocityCurve_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ForceVelocityCurve(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ForceVelocityCurve_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_concentric_slope_at_vmax(ForceVelocityCurve source) {
    opensimModelJNI.ForceVelocityCurve_copyProperty_concentric_slope_at_vmax(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_concentric_slope_at_vmax(int i) {
    return opensimModelJNI.ForceVelocityCurve_get_concentric_slope_at_vmax__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_concentric_slope_at_vmax(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_concentric_slope_at_vmax__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_concentric_slope_at_vmax(int i, double value) {
    opensimModelJNI.ForceVelocityCurve_set_concentric_slope_at_vmax__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_concentric_slope_at_vmax(double value) {
    return opensimModelJNI.ForceVelocityCurve_append_concentric_slope_at_vmax(swigCPtr, this, value);
  }

  public void constructProperty_concentric_slope_at_vmax(double initValue) {
    opensimModelJNI.ForceVelocityCurve_constructProperty_concentric_slope_at_vmax(swigCPtr, this, initValue);
  }

  public double get_concentric_slope_at_vmax() {
    return opensimModelJNI.ForceVelocityCurve_get_concentric_slope_at_vmax__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_concentric_slope_at_vmax() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_concentric_slope_at_vmax__SWIG_1(swigCPtr, this), false);
  }

  public void set_concentric_slope_at_vmax(double value) {
    opensimModelJNI.ForceVelocityCurve_set_concentric_slope_at_vmax__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_concentric_slope_near_vmax(ForceVelocityCurve source) {
    opensimModelJNI.ForceVelocityCurve_copyProperty_concentric_slope_near_vmax(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_concentric_slope_near_vmax(int i) {
    return opensimModelJNI.ForceVelocityCurve_get_concentric_slope_near_vmax__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_concentric_slope_near_vmax(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_concentric_slope_near_vmax__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_concentric_slope_near_vmax(int i, double value) {
    opensimModelJNI.ForceVelocityCurve_set_concentric_slope_near_vmax__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_concentric_slope_near_vmax(double value) {
    return opensimModelJNI.ForceVelocityCurve_append_concentric_slope_near_vmax(swigCPtr, this, value);
  }

  public void constructProperty_concentric_slope_near_vmax(double initValue) {
    opensimModelJNI.ForceVelocityCurve_constructProperty_concentric_slope_near_vmax(swigCPtr, this, initValue);
  }

  public double get_concentric_slope_near_vmax() {
    return opensimModelJNI.ForceVelocityCurve_get_concentric_slope_near_vmax__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_concentric_slope_near_vmax() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_concentric_slope_near_vmax__SWIG_1(swigCPtr, this), false);
  }

  public void set_concentric_slope_near_vmax(double value) {
    opensimModelJNI.ForceVelocityCurve_set_concentric_slope_near_vmax__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_isometric_slope(ForceVelocityCurve source) {
    opensimModelJNI.ForceVelocityCurve_copyProperty_isometric_slope(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_isometric_slope(int i) {
    return opensimModelJNI.ForceVelocityCurve_get_isometric_slope__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_isometric_slope(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_isometric_slope__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_isometric_slope(int i, double value) {
    opensimModelJNI.ForceVelocityCurve_set_isometric_slope__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_isometric_slope(double value) {
    return opensimModelJNI.ForceVelocityCurve_append_isometric_slope(swigCPtr, this, value);
  }

  public void constructProperty_isometric_slope(double initValue) {
    opensimModelJNI.ForceVelocityCurve_constructProperty_isometric_slope(swigCPtr, this, initValue);
  }

  public double get_isometric_slope() {
    return opensimModelJNI.ForceVelocityCurve_get_isometric_slope__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_isometric_slope() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_isometric_slope__SWIG_1(swigCPtr, this), false);
  }

  public void set_isometric_slope(double value) {
    opensimModelJNI.ForceVelocityCurve_set_isometric_slope__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_eccentric_slope_at_vmax(ForceVelocityCurve source) {
    opensimModelJNI.ForceVelocityCurve_copyProperty_eccentric_slope_at_vmax(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_eccentric_slope_at_vmax(int i) {
    return opensimModelJNI.ForceVelocityCurve_get_eccentric_slope_at_vmax__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_eccentric_slope_at_vmax(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_eccentric_slope_at_vmax__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_eccentric_slope_at_vmax(int i, double value) {
    opensimModelJNI.ForceVelocityCurve_set_eccentric_slope_at_vmax__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_eccentric_slope_at_vmax(double value) {
    return opensimModelJNI.ForceVelocityCurve_append_eccentric_slope_at_vmax(swigCPtr, this, value);
  }

  public void constructProperty_eccentric_slope_at_vmax(double initValue) {
    opensimModelJNI.ForceVelocityCurve_constructProperty_eccentric_slope_at_vmax(swigCPtr, this, initValue);
  }

  public double get_eccentric_slope_at_vmax() {
    return opensimModelJNI.ForceVelocityCurve_get_eccentric_slope_at_vmax__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_eccentric_slope_at_vmax() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_eccentric_slope_at_vmax__SWIG_1(swigCPtr, this), false);
  }

  public void set_eccentric_slope_at_vmax(double value) {
    opensimModelJNI.ForceVelocityCurve_set_eccentric_slope_at_vmax__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_eccentric_slope_near_vmax(ForceVelocityCurve source) {
    opensimModelJNI.ForceVelocityCurve_copyProperty_eccentric_slope_near_vmax(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_eccentric_slope_near_vmax(int i) {
    return opensimModelJNI.ForceVelocityCurve_get_eccentric_slope_near_vmax__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_eccentric_slope_near_vmax(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_eccentric_slope_near_vmax__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_eccentric_slope_near_vmax(int i, double value) {
    opensimModelJNI.ForceVelocityCurve_set_eccentric_slope_near_vmax__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_eccentric_slope_near_vmax(double value) {
    return opensimModelJNI.ForceVelocityCurve_append_eccentric_slope_near_vmax(swigCPtr, this, value);
  }

  public void constructProperty_eccentric_slope_near_vmax(double initValue) {
    opensimModelJNI.ForceVelocityCurve_constructProperty_eccentric_slope_near_vmax(swigCPtr, this, initValue);
  }

  public double get_eccentric_slope_near_vmax() {
    return opensimModelJNI.ForceVelocityCurve_get_eccentric_slope_near_vmax__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_eccentric_slope_near_vmax() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_eccentric_slope_near_vmax__SWIG_1(swigCPtr, this), false);
  }

  public void set_eccentric_slope_near_vmax(double value) {
    opensimModelJNI.ForceVelocityCurve_set_eccentric_slope_near_vmax__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_max_eccentric_velocity_force_multiplier(ForceVelocityCurve source) {
    opensimModelJNI.ForceVelocityCurve_copyProperty_max_eccentric_velocity_force_multiplier(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_max_eccentric_velocity_force_multiplier(int i) {
    return opensimModelJNI.ForceVelocityCurve_get_max_eccentric_velocity_force_multiplier__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_max_eccentric_velocity_force_multiplier(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_max_eccentric_velocity_force_multiplier__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_max_eccentric_velocity_force_multiplier(int i, double value) {
    opensimModelJNI.ForceVelocityCurve_set_max_eccentric_velocity_force_multiplier__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_max_eccentric_velocity_force_multiplier(double value) {
    return opensimModelJNI.ForceVelocityCurve_append_max_eccentric_velocity_force_multiplier(swigCPtr, this, value);
  }

  public void constructProperty_max_eccentric_velocity_force_multiplier(double initValue) {
    opensimModelJNI.ForceVelocityCurve_constructProperty_max_eccentric_velocity_force_multiplier(swigCPtr, this, initValue);
  }

  public double get_max_eccentric_velocity_force_multiplier() {
    return opensimModelJNI.ForceVelocityCurve_get_max_eccentric_velocity_force_multiplier__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_max_eccentric_velocity_force_multiplier() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_max_eccentric_velocity_force_multiplier__SWIG_1(swigCPtr, this), false);
  }

  public void set_max_eccentric_velocity_force_multiplier(double value) {
    opensimModelJNI.ForceVelocityCurve_set_max_eccentric_velocity_force_multiplier__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_concentric_curviness(ForceVelocityCurve source) {
    opensimModelJNI.ForceVelocityCurve_copyProperty_concentric_curviness(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_concentric_curviness(int i) {
    return opensimModelJNI.ForceVelocityCurve_get_concentric_curviness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_concentric_curviness(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_concentric_curviness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_concentric_curviness(int i, double value) {
    opensimModelJNI.ForceVelocityCurve_set_concentric_curviness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_concentric_curviness(double value) {
    return opensimModelJNI.ForceVelocityCurve_append_concentric_curviness(swigCPtr, this, value);
  }

  public void constructProperty_concentric_curviness(double initValue) {
    opensimModelJNI.ForceVelocityCurve_constructProperty_concentric_curviness(swigCPtr, this, initValue);
  }

  public double get_concentric_curviness() {
    return opensimModelJNI.ForceVelocityCurve_get_concentric_curviness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_concentric_curviness() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_concentric_curviness__SWIG_1(swigCPtr, this), false);
  }

  public void set_concentric_curviness(double value) {
    opensimModelJNI.ForceVelocityCurve_set_concentric_curviness__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_eccentric_curviness(ForceVelocityCurve source) {
    opensimModelJNI.ForceVelocityCurve_copyProperty_eccentric_curviness(swigCPtr, this, ForceVelocityCurve.getCPtr(source), source);
  }

  public double get_eccentric_curviness(int i) {
    return opensimModelJNI.ForceVelocityCurve_get_eccentric_curviness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_eccentric_curviness(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_eccentric_curviness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_eccentric_curviness(int i, double value) {
    opensimModelJNI.ForceVelocityCurve_set_eccentric_curviness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_eccentric_curviness(double value) {
    return opensimModelJNI.ForceVelocityCurve_append_eccentric_curviness(swigCPtr, this, value);
  }

  public void constructProperty_eccentric_curviness(double initValue) {
    opensimModelJNI.ForceVelocityCurve_constructProperty_eccentric_curviness(swigCPtr, this, initValue);
  }

  public double get_eccentric_curviness() {
    return opensimModelJNI.ForceVelocityCurve_get_eccentric_curviness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_eccentric_curviness() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityCurve_upd_eccentric_curviness__SWIG_1(swigCPtr, this), false);
  }

  public void set_eccentric_curviness(double value) {
    opensimModelJNI.ForceVelocityCurve_set_eccentric_curviness__SWIG_1(swigCPtr, this, value);
  }

  public ForceVelocityCurve() {
    this(opensimModelJNI.new_ForceVelocityCurve__SWIG_0(), true);
  }

  public ForceVelocityCurve(double concentricSlopeAtVmax, double concentricSlopeNearVmax, double isometricSlope, double eccentricSlopeAtVmax, double eccentricSlopeNearVmax, double maxEccentricVelocityForceMultiplier, double concentricCurviness, double eccentricCurviness) {
    this(opensimModelJNI.new_ForceVelocityCurve__SWIG_1(concentricSlopeAtVmax, concentricSlopeNearVmax, isometricSlope, eccentricSlopeAtVmax, eccentricSlopeNearVmax, maxEccentricVelocityForceMultiplier, concentricCurviness, eccentricCurviness), true);
  }

  public double getConcentricSlopeAtVmax() {
    return opensimModelJNI.ForceVelocityCurve_getConcentricSlopeAtVmax(swigCPtr, this);
  }

  public double getConcentricSlopeNearVmax() {
    return opensimModelJNI.ForceVelocityCurve_getConcentricSlopeNearVmax(swigCPtr, this);
  }

  public double getIsometricSlope() {
    return opensimModelJNI.ForceVelocityCurve_getIsometricSlope(swigCPtr, this);
  }

  public double getEccentricSlopeAtVmax() {
    return opensimModelJNI.ForceVelocityCurve_getEccentricSlopeAtVmax(swigCPtr, this);
  }

  public double getEccentricSlopeNearVmax() {
    return opensimModelJNI.ForceVelocityCurve_getEccentricSlopeNearVmax(swigCPtr, this);
  }

  public double getMaxEccentricVelocityForceMultiplier() {
    return opensimModelJNI.ForceVelocityCurve_getMaxEccentricVelocityForceMultiplier(swigCPtr, this);
  }

  public double getConcentricCurviness() {
    return opensimModelJNI.ForceVelocityCurve_getConcentricCurviness(swigCPtr, this);
  }

  public double getEccentricCurviness() {
    return opensimModelJNI.ForceVelocityCurve_getEccentricCurviness(swigCPtr, this);
  }

  public void setCurveShape(double aConcentricSlopeAtVmax, double aConcentricSlopeNearVmax, double aIsometricSlope, double aEccentricSlopeAtVmax, double aEccentricSlopeNearVmax, double aMaxForceMultiplier) {
    opensimModelJNI.ForceVelocityCurve_setCurveShape(swigCPtr, this, aConcentricSlopeAtVmax, aConcentricSlopeNearVmax, aIsometricSlope, aEccentricSlopeAtVmax, aEccentricSlopeNearVmax, aMaxForceMultiplier);
  }

  public void setConcentricCurviness(double aConcentricCurviness) {
    opensimModelJNI.ForceVelocityCurve_setConcentricCurviness(swigCPtr, this, aConcentricCurviness);
  }

  public void setEccentricCurviness(double aEccentricCurviness) {
    opensimModelJNI.ForceVelocityCurve_setEccentricCurviness(swigCPtr, this, aEccentricCurviness);
  }

  public double calcValue(Vector x) {
    return opensimModelJNI.ForceVelocityCurve_calcValue__SWIG_0(swigCPtr, this, Vector.getCPtr(x), x);
  }

  public double calcValue(double normFiberVelocity) {
    return opensimModelJNI.ForceVelocityCurve_calcValue__SWIG_1(swigCPtr, this, normFiberVelocity);
  }

  public double calcDerivative(double normFiberVelocity, int order) {
    return opensimModelJNI.ForceVelocityCurve_calcDerivative(swigCPtr, this, normFiberVelocity, order);
  }

  public Vec2 getCurveDomain() {
    return new Vec2(opensimModelJNI.ForceVelocityCurve_getCurveDomain(swigCPtr, this), true);
  }

  public void printMuscleCurveToCSVFile(String path) {
    opensimModelJNI.ForceVelocityCurve_printMuscleCurveToCSVFile(swigCPtr, this, path);
  }

  public void ensureCurveUpToDate() {
    opensimModelJNI.ForceVelocityCurve_ensureCurveUpToDate(swigCPtr, this);
  }

}
