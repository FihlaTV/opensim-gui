/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MetaDataLengthZero extends OpenSimException {
  private transient long swigCPtr;

  public MetaDataLengthZero(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.MetaDataLengthZero_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MetaDataLengthZero obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_MetaDataLengthZero(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MetaDataLengthZero(String file, long line, String func, String msg) {
    this(opensimCommonJNI.new_MetaDataLengthZero(file, line, func, msg), true);
  }

}
