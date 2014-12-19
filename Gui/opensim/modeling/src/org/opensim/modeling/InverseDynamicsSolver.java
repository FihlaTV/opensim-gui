/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class InverseDynamicsSolver extends Solver {
  private long swigCPtr;

  public InverseDynamicsSolver(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.InverseDynamicsSolver_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(InverseDynamicsSolver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_InverseDynamicsSolver(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static InverseDynamicsSolver safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.InverseDynamicsSolver_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new InverseDynamicsSolver(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.InverseDynamicsSolver_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.InverseDynamicsSolver_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.InverseDynamicsSolver_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new InverseDynamicsSolver(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.InverseDynamicsSolver_getConcreteClassName(swigCPtr, this);
  }

  public InverseDynamicsSolver(Model model) {
    this(opensimModelJNI.new_InverseDynamicsSolver(Model.getCPtr(model), model), true);
  }

  public Vector solve(State s, Vector udot) {
    return new Vector(opensimModelJNI.InverseDynamicsSolver_solve__SWIG_0(swigCPtr, this, State.getCPtr(s), s, Vector.getCPtr(udot), udot), true);
  }

  public Vector solve(State s) {
    return new Vector(opensimModelJNI.InverseDynamicsSolver_solve__SWIG_1(swigCPtr, this, State.getCPtr(s), s), true);
  }

  public Vector solve(State s, Vector udot, Vector appliedMobilityForces, VectorOfSpatialVec appliedBodyForces) {
    return new Vector(opensimModelJNI.InverseDynamicsSolver_solve__SWIG_2(swigCPtr, this, State.getCPtr(s), s, Vector.getCPtr(udot), udot, Vector.getCPtr(appliedMobilityForces), appliedMobilityForces, VectorOfSpatialVec.getCPtr(appliedBodyForces), appliedBodyForces), true);
  }

  public Vector solve(State s, FunctionSet Qs, double time) {
    return new Vector(opensimModelJNI.InverseDynamicsSolver_solve__SWIG_3(swigCPtr, this, State.getCPtr(s), s, FunctionSet.getCPtr(Qs), Qs, time), true);
  }

}
