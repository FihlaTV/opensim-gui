/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class JointsList {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public JointsList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(JointsList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_JointsList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public JointsList(Component root, ComponentFilter f) {
    this(opensimModelJNI.new_JointsList__SWIG_0(Component.getCPtr(root), root, ComponentFilter.getCPtr(f), f), true);
  }

  public JointsList(Component root) {
    this(opensimModelJNI.new_JointsList__SWIG_1(Component.getCPtr(root), root), true);
  }

  public JointIterator begin() {
    return new JointIterator(opensimModelJNI.JointsList_begin(swigCPtr, this), true);
  }

  public void setFilter(ComponentFilter filter) {
    opensimModelJNI.JointsList_setFilter(swigCPtr, this, ComponentFilter.getCPtr(filter), filter);
  }

  public JointIterator end() {
    return new JointIterator(opensimModelJNI.JointsList_end(swigCPtr, this), true);
  }

}
