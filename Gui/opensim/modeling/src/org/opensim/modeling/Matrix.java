/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Matrix extends MatrixBaseDouble {
  private long swigCPtr;

  public Matrix(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Matrix_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Matrix obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Matrix(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Matrix() {
    this(opensimModelJNI.new_Matrix__SWIG_0(), true);
  }

  public Matrix(Matrix src) {
    this(opensimModelJNI.new_Matrix__SWIG_1(Matrix.getCPtr(src), src), true);
  }

  public Matrix(int m, int n) {
    this(opensimModelJNI.new_Matrix__SWIG_2(m, n), true);
  }

  public Matrix(int m, int n, double initialValue) {
    this(opensimModelJNI.new_Matrix__SWIG_3(m, n, initialValue), true);
  }

  public String toString() {
    return opensimModelJNI.Matrix_toString(swigCPtr, this);
  }

  public double get(int i, int j) {
    return opensimModelJNI.Matrix_get(swigCPtr, this, i, j);
  }

  public void set(int i, int j, double value) {
    opensimModelJNI.Matrix_set(swigCPtr, this, i, j, value);
  }

}
