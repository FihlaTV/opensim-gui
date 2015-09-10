/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class InverseKinematicsSolver extends AssemblySolver {
  private long swigCPtr;

  public InverseKinematicsSolver(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.InverseKinematicsSolver_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(InverseKinematicsSolver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_InverseKinematicsSolver(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public InverseKinematicsSolver(Model model, MarkersReference markersReference, ArrayCoordinateReference coordinateReferences, double constraintWeight) {
    this(opensimModelJNI.new_InverseKinematicsSolver__SWIG_0(Model.getCPtr(model), model, MarkersReference.getCPtr(markersReference), markersReference, ArrayCoordinateReference.getCPtr(coordinateReferences), coordinateReferences, constraintWeight), true);
  }

  public InverseKinematicsSolver(Model model, MarkersReference markersReference, ArrayCoordinateReference coordinateReferences) {
    this(opensimModelJNI.new_InverseKinematicsSolver__SWIG_1(Model.getCPtr(model), model, MarkersReference.getCPtr(markersReference), markersReference, ArrayCoordinateReference.getCPtr(coordinateReferences), coordinateReferences), true);
  }

  public void updateMarkerWeight(String markerName, double value) {
    opensimModelJNI.InverseKinematicsSolver_updateMarkerWeight__SWIG_0(swigCPtr, this, markerName, value);
  }

  public void updateMarkerWeight(int markerIndex, double value) {
    opensimModelJNI.InverseKinematicsSolver_updateMarkerWeight__SWIG_1(swigCPtr, this, markerIndex, value);
  }

  public void updateMarkerWeights(SimTKArrayDouble weights) {
    opensimModelJNI.InverseKinematicsSolver_updateMarkerWeights(swigCPtr, this, SimTKArrayDouble.getCPtr(weights), weights);
  }

  public Vec3 computeCurrentMarkerLocation(String markerName) {
    return new Vec3(opensimModelJNI.InverseKinematicsSolver_computeCurrentMarkerLocation__SWIG_0(swigCPtr, this, markerName), true);
  }

  public Vec3 computeCurrentMarkerLocation(int markerIndex) {
    return new Vec3(opensimModelJNI.InverseKinematicsSolver_computeCurrentMarkerLocation__SWIG_1(swigCPtr, this, markerIndex), true);
  }

  public void computeCurrentMarkerLocations(SimTKArrayVec3 markerLocations) {
    opensimModelJNI.InverseKinematicsSolver_computeCurrentMarkerLocations(swigCPtr, this, SimTKArrayVec3.getCPtr(markerLocations), markerLocations);
  }

  public double computeCurrentMarkerError(String markerName) {
    return opensimModelJNI.InverseKinematicsSolver_computeCurrentMarkerError__SWIG_0(swigCPtr, this, markerName);
  }

  public double computeCurrentMarkerError(int markerIndex) {
    return opensimModelJNI.InverseKinematicsSolver_computeCurrentMarkerError__SWIG_1(swigCPtr, this, markerIndex);
  }

  public void computeCurrentMarkerErrors(SimTKArrayDouble markerErrors) {
    opensimModelJNI.InverseKinematicsSolver_computeCurrentMarkerErrors(swigCPtr, this, SimTKArrayDouble.getCPtr(markerErrors), markerErrors);
  }

  public double computeCurrentSquaredMarkerError(String markerName) {
    return opensimModelJNI.InverseKinematicsSolver_computeCurrentSquaredMarkerError__SWIG_0(swigCPtr, this, markerName);
  }

  public double computeCurrentSquaredMarkerError(int markerIndex) {
    return opensimModelJNI.InverseKinematicsSolver_computeCurrentSquaredMarkerError__SWIG_1(swigCPtr, this, markerIndex);
  }

  public void computeCurrentSquaredMarkerErrors(SimTKArrayDouble markerErrors) {
    opensimModelJNI.InverseKinematicsSolver_computeCurrentSquaredMarkerErrors(swigCPtr, this, SimTKArrayDouble.getCPtr(markerErrors), markerErrors);
  }

  public String getMarkerNameForIndex(int markerIndex) {
    return opensimModelJNI.InverseKinematicsSolver_getMarkerNameForIndex(swigCPtr, this, markerIndex);
  }

}
