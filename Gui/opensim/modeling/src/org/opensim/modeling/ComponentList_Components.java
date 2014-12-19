/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ComponentList_Components {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ComponentList_Components(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ComponentList_Components obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ComponentList_Components(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ComponentList_Components(Component root, ComponentFilter f) {
    this(opensimModelJNI.new_ComponentList_Components__SWIG_0(Component.getCPtr(root), root, ComponentFilter.getCPtr(f), f), true);
  }

  public ComponentList_Components(Component root) {
    this(opensimModelJNI.new_ComponentList_Components__SWIG_1(Component.getCPtr(root), root), true);
  }

  public ComponentIterator begin() {
    return new ComponentIterator(opensimModelJNI.ComponentList_Components_begin(swigCPtr, this), true);
  }

  public void setFilter(ComponentFilter filter) {
    opensimModelJNI.ComponentList_Components_setFilter(swigCPtr, this, ComponentFilter.getCPtr(filter), filter);
  }

  public ComponentIterator end() {
    return new ComponentIterator(opensimModelJNI.ComponentList_Components_end(swigCPtr, this), true);
  }

}
