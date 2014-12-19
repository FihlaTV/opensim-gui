/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MuscleFixedWidthPennationModel extends OpenSimObject {
  private long swigCPtr;

  public MuscleFixedWidthPennationModel(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.MuscleFixedWidthPennationModel_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MuscleFixedWidthPennationModel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_MuscleFixedWidthPennationModel(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MuscleFixedWidthPennationModel safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.MuscleFixedWidthPennationModel_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MuscleFixedWidthPennationModel(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.MuscleFixedWidthPennationModel_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.MuscleFixedWidthPennationModel_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.MuscleFixedWidthPennationModel_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MuscleFixedWidthPennationModel(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.MuscleFixedWidthPennationModel_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_optimal_fiber_length(MuscleFixedWidthPennationModel source) {
    opensimModelJNI.MuscleFixedWidthPennationModel_copyProperty_optimal_fiber_length(swigCPtr, this, MuscleFixedWidthPennationModel.getCPtr(source), source);
  }

  public double get_optimal_fiber_length(int i) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_get_optimal_fiber_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_optimal_fiber_length(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleFixedWidthPennationModel_upd_optimal_fiber_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_optimal_fiber_length(int i, double value) {
    opensimModelJNI.MuscleFixedWidthPennationModel_set_optimal_fiber_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_optimal_fiber_length(double value) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_append_optimal_fiber_length(swigCPtr, this, value);
  }

  public void constructProperty_optimal_fiber_length(double initValue) {
    opensimModelJNI.MuscleFixedWidthPennationModel_constructProperty_optimal_fiber_length(swigCPtr, this, initValue);
  }

  public double get_optimal_fiber_length() {
    return opensimModelJNI.MuscleFixedWidthPennationModel_get_optimal_fiber_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_optimal_fiber_length() {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleFixedWidthPennationModel_upd_optimal_fiber_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_optimal_fiber_length(double value) {
    opensimModelJNI.MuscleFixedWidthPennationModel_set_optimal_fiber_length__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_optimal_pennation_angle(MuscleFixedWidthPennationModel source) {
    opensimModelJNI.MuscleFixedWidthPennationModel_copyProperty_optimal_pennation_angle(swigCPtr, this, MuscleFixedWidthPennationModel.getCPtr(source), source);
  }

  public double get_optimal_pennation_angle(int i) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_get_optimal_pennation_angle__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_optimal_pennation_angle(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleFixedWidthPennationModel_upd_optimal_pennation_angle__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_optimal_pennation_angle(int i, double value) {
    opensimModelJNI.MuscleFixedWidthPennationModel_set_optimal_pennation_angle__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_optimal_pennation_angle(double value) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_append_optimal_pennation_angle(swigCPtr, this, value);
  }

  public void constructProperty_optimal_pennation_angle(double initValue) {
    opensimModelJNI.MuscleFixedWidthPennationModel_constructProperty_optimal_pennation_angle(swigCPtr, this, initValue);
  }

  public double get_optimal_pennation_angle() {
    return opensimModelJNI.MuscleFixedWidthPennationModel_get_optimal_pennation_angle__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_optimal_pennation_angle() {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleFixedWidthPennationModel_upd_optimal_pennation_angle__SWIG_1(swigCPtr, this), false);
  }

  public void set_optimal_pennation_angle(double value) {
    opensimModelJNI.MuscleFixedWidthPennationModel_set_optimal_pennation_angle__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_maximum_pennation_angle(MuscleFixedWidthPennationModel source) {
    opensimModelJNI.MuscleFixedWidthPennationModel_copyProperty_maximum_pennation_angle(swigCPtr, this, MuscleFixedWidthPennationModel.getCPtr(source), source);
  }

  public double get_maximum_pennation_angle(int i) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_get_maximum_pennation_angle__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_maximum_pennation_angle(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleFixedWidthPennationModel_upd_maximum_pennation_angle__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_maximum_pennation_angle(int i, double value) {
    opensimModelJNI.MuscleFixedWidthPennationModel_set_maximum_pennation_angle__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_maximum_pennation_angle(double value) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_append_maximum_pennation_angle(swigCPtr, this, value);
  }

  public void constructProperty_maximum_pennation_angle(double initValue) {
    opensimModelJNI.MuscleFixedWidthPennationModel_constructProperty_maximum_pennation_angle(swigCPtr, this, initValue);
  }

  public double get_maximum_pennation_angle() {
    return opensimModelJNI.MuscleFixedWidthPennationModel_get_maximum_pennation_angle__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_maximum_pennation_angle() {
    return new SWIGTYPE_p_double(opensimModelJNI.MuscleFixedWidthPennationModel_upd_maximum_pennation_angle__SWIG_1(swigCPtr, this), false);
  }

  public void set_maximum_pennation_angle(double value) {
    opensimModelJNI.MuscleFixedWidthPennationModel_set_maximum_pennation_angle__SWIG_1(swigCPtr, this, value);
  }

  public MuscleFixedWidthPennationModel() {
    this(opensimModelJNI.new_MuscleFixedWidthPennationModel__SWIG_0(), true);
  }

  public MuscleFixedWidthPennationModel(double optimalFiberLength, double optimalPennationAngle, double maximumPennationAngle) {
    this(opensimModelJNI.new_MuscleFixedWidthPennationModel__SWIG_1(optimalFiberLength, optimalPennationAngle, maximumPennationAngle), true);
  }

  public double getParallelogramHeight() {
    return opensimModelJNI.MuscleFixedWidthPennationModel_getParallelogramHeight(swigCPtr, this);
  }

  public double getOptimalFiberLength() {
    return opensimModelJNI.MuscleFixedWidthPennationModel_getOptimalFiberLength(swigCPtr, this);
  }

  public double getMinimumFiberLength() {
    return opensimModelJNI.MuscleFixedWidthPennationModel_getMinimumFiberLength(swigCPtr, this);
  }

  public double getMinimumFiberLengthAlongTendon() {
    return opensimModelJNI.MuscleFixedWidthPennationModel_getMinimumFiberLengthAlongTendon(swigCPtr, this);
  }

  public double getOptimalPennationAngle() {
    return opensimModelJNI.MuscleFixedWidthPennationModel_getOptimalPennationAngle(swigCPtr, this);
  }

  public double getMaximumPennationAngle() {
    return opensimModelJNI.MuscleFixedWidthPennationModel_getMaximumPennationAngle(swigCPtr, this);
  }

  public boolean setOptimalFiberLength(double aOptimalFiberLength) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_setOptimalFiberLength(swigCPtr, this, aOptimalFiberLength);
  }

  public boolean setOptimalPennationAngle(double aOptimalPennationAngle) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_setOptimalPennationAngle(swigCPtr, this, aOptimalPennationAngle);
  }

  public boolean setMaximumPennationAngle(double aMaximumPennationAngle) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_setMaximumPennationAngle(swigCPtr, this, aMaximumPennationAngle);
  }

  public double clampFiberLength(double fiberLength) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_clampFiberLength(swigCPtr, this, fiberLength);
  }

  public double calcPennationAngle(double fiberLength) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_calcPennationAngle(swigCPtr, this, fiberLength);
  }

  public double calcTendonLength(double cosPennationAngle, double fiberLength, double muscleLength) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_calcTendonLength(swigCPtr, this, cosPennationAngle, fiberLength, muscleLength);
  }

  public double calcFiberLengthAlongTendon(double fiberLength, double cosPennationAngle) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_calcFiberLengthAlongTendon(swigCPtr, this, fiberLength, cosPennationAngle);
  }

  public double calcPennationAngularVelocity(double tanPennationAngle, double fiberLength, double fiberVelocity) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_calcPennationAngularVelocity(swigCPtr, this, tanPennationAngle, fiberLength, fiberVelocity);
  }

  public double calcTendonVelocity(double cosPennationAngle, double sinPennationAngle, double pennationAngularVelocity, double fiberLength, double fiberVelocity, double muscleVelocity) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_calcTendonVelocity(swigCPtr, this, cosPennationAngle, sinPennationAngle, pennationAngularVelocity, fiberLength, fiberVelocity, muscleVelocity);
  }

  public double calcFiberVelocityAlongTendon(double fiberLength, double fiberVelocity, double sinPennationAngle, double cosPennationAngle, double pennationAngularVelocity) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_calcFiberVelocityAlongTendon(swigCPtr, this, fiberLength, fiberVelocity, sinPennationAngle, cosPennationAngle, pennationAngularVelocity);
  }

  public double calcPennationAngularAcceleration(double fiberLength, double fiberVelocity, double fiberAcceleration, double sinPennationAngle, double cosPennationAngle, double pennationAngularVelocity) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_calcPennationAngularAcceleration(swigCPtr, this, fiberLength, fiberVelocity, fiberAcceleration, sinPennationAngle, cosPennationAngle, pennationAngularVelocity);
  }

  public double calcFiberAccelerationAlongTendon(double fiberLength, double fiberVelocity, double fiberAcceleration, double sinPennationAngle, double cosPennationAngle, double pennationAngularVelocity, double pennationAngularAcceleration) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_calcFiberAccelerationAlongTendon(swigCPtr, this, fiberLength, fiberVelocity, fiberAcceleration, sinPennationAngle, cosPennationAngle, pennationAngularVelocity, pennationAngularAcceleration);
  }

  public double calc_DFiberLengthAlongTendon_DfiberLength(double fiberLength, double sinPennationAngle, double cosPennationAngle, double DpennationAngle_DfiberLength) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_calc_DFiberLengthAlongTendon_DfiberLength(swigCPtr, this, fiberLength, sinPennationAngle, cosPennationAngle, DpennationAngle_DfiberLength);
  }

  public double calc_DPennationAngularVelocity_DfiberLength(double fiberLength, double fiberVelocity, double sinPennationAngle, double cosPennationAngle, double pennationAngularVelocity, double DpennationAngle_DfiberLength) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_calc_DPennationAngularVelocity_DfiberLength(swigCPtr, this, fiberLength, fiberVelocity, sinPennationAngle, cosPennationAngle, pennationAngularVelocity, DpennationAngle_DfiberLength);
  }

  public double calc_DFiberVelocityAlongTendon_DfiberLength(double fiberLength, double fiberVelocity, double sinPennationAngle, double cosPennationAngle, double pennationAngularVelocity, double DpennationAngle_DfiberLength, double DpennationAngularVelocity_DfiberLength) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_calc_DFiberVelocityAlongTendon_DfiberLength(swigCPtr, this, fiberLength, fiberVelocity, sinPennationAngle, cosPennationAngle, pennationAngularVelocity, DpennationAngle_DfiberLength, DpennationAngularVelocity_DfiberLength);
  }

  public double calc_DPennationAngle_DfiberLength(double fiberLength) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_calc_DPennationAngle_DfiberLength(swigCPtr, this, fiberLength);
  }

  public double calc_DTendonLength_DfiberLength(double fiberLength, double sinPennationAngle, double cosPennationAngle, double DpennationAngle_DfiberLength) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_calc_DTendonLength_DfiberLength(swigCPtr, this, fiberLength, sinPennationAngle, cosPennationAngle, DpennationAngle_DfiberLength);
  }

  public double calcFiberLength(double muscleLength, double tendonLength) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_calcFiberLength(swigCPtr, this, muscleLength, tendonLength);
  }

  public double calcFiberVelocity(double cosPennationAngle, double muscleVelocity, double tendonVelocity) {
    return opensimModelJNI.MuscleFixedWidthPennationModel_calcFiberVelocity(swigCPtr, this, cosPennationAngle, muscleVelocity, tendonVelocity);
  }

  public void ensureModelUpToDate() {
    opensimModelJNI.MuscleFixedWidthPennationModel_ensureModelUpToDate(swigCPtr, this);
  }

}
