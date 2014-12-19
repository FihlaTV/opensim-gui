/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DecorativeMeshFile extends DecorativeGeometry {
  private long swigCPtr;

  public DecorativeMeshFile(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.DecorativeMeshFile_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(DecorativeMeshFile obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_DecorativeMeshFile(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DecorativeMeshFile(String meshFileName) {
    this(opensimModelJNI.new_DecorativeMeshFile(meshFileName), true);
  }

  public String getMeshFile() {
    return opensimModelJNI.DecorativeMeshFile_getMeshFile(swigCPtr, this);
  }

  public DecorativeMeshFile setBodyId(int b) {
    return new DecorativeMeshFile(opensimModelJNI.DecorativeMeshFile_setBodyId(swigCPtr, this, b), false);
  }

  public DecorativeMeshFile setIndexOnBody(int x) {
    return new DecorativeMeshFile(opensimModelJNI.DecorativeMeshFile_setIndexOnBody(swigCPtr, this, x), false);
  }

  public DecorativeMeshFile setUserRef(SWIGTYPE_p_void p) {
    return new DecorativeMeshFile(opensimModelJNI.DecorativeMeshFile_setUserRef(swigCPtr, this, SWIGTYPE_p_void.getCPtr(p)), false);
  }

  public DecorativeMeshFile setTransform(Transform X_BD) {
    return new DecorativeMeshFile(opensimModelJNI.DecorativeMeshFile_setTransform(swigCPtr, this, Transform.getCPtr(X_BD), X_BD), false);
  }

  public DecorativeMeshFile setResolution(double r) {
    return new DecorativeMeshFile(opensimModelJNI.DecorativeMeshFile_setResolution(swigCPtr, this, r), false);
  }

  public DecorativeMeshFile setScaleFactors(Vec3 s) {
    return new DecorativeMeshFile(opensimModelJNI.DecorativeMeshFile_setScaleFactors(swigCPtr, this, Vec3.getCPtr(s), s), false);
  }

  public DecorativeMeshFile setColor(Vec3 rgb) {
    return new DecorativeMeshFile(opensimModelJNI.DecorativeMeshFile_setColor(swigCPtr, this, Vec3.getCPtr(rgb), rgb), false);
  }

  public DecorativeMeshFile setOpacity(double o) {
    return new DecorativeMeshFile(opensimModelJNI.DecorativeMeshFile_setOpacity(swigCPtr, this, o), false);
  }

  public DecorativeMeshFile setLineThickness(double t) {
    return new DecorativeMeshFile(opensimModelJNI.DecorativeMeshFile_setLineThickness(swigCPtr, this, t), false);
  }

  public DecorativeMeshFile setRepresentation(DecorativeGeometry.Representation r) {
    return new DecorativeMeshFile(opensimModelJNI.DecorativeMeshFile_setRepresentation(swigCPtr, this, r.swigValue()), false);
  }

}
