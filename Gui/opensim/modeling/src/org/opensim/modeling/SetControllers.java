/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetControllers extends OpenSimObject {
  private long swigCPtr;

  public SetControllers(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.SetControllers_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetControllers obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_SetControllers(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetControllers safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.SetControllers_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetControllers(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.SetControllers_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.SetControllers_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.SetControllers_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetControllers(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.SetControllers_getConcreteClassName(swigCPtr, this);
  }

  public SetControllers() {
    this(opensimModelJNI.new_SetControllers__SWIG_0(), true);
  }

  public SetControllers(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_SetControllers__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetControllers(String aFileName) {
    this(opensimModelJNI.new_SetControllers__SWIG_2(aFileName), true);
  }

  public SetControllers(SetControllers aSet) {
    this(opensimModelJNI.new_SetControllers__SWIG_3(SetControllers.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimModelJNI.SetControllers_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimModelJNI.SetControllers_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimModelJNI.SetControllers_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelJNI.SetControllers_getSize(swigCPtr, this);
  }

  public int getIndex(Controller aObject, int aStartIndex) {
    return opensimModelJNI.SetControllers_getIndex__SWIG_0(swigCPtr, this, Controller.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Controller aObject) {
    return opensimModelJNI.SetControllers_getIndex__SWIG_1(swigCPtr, this, Controller.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimModelJNI.SetControllers_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimModelJNI.SetControllers_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimModelJNI.SetControllers_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(Controller aObject) {
    return opensimModelJNI.SetControllers_adoptAndAppend(swigCPtr, this, Controller.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(Controller aObject) {
    return opensimModelJNI.SetControllers_cloneAndAppend(swigCPtr, this, Controller.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Controller aObject) {
    return opensimModelJNI.SetControllers_insert(swigCPtr, this, aIndex, Controller.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimModelJNI.SetControllers_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Controller aObject) {
    return opensimModelJNI.SetControllers_remove__SWIG_1(swigCPtr, this, Controller.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimModelJNI.SetControllers_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Controller aObject, boolean preserveGroups) {
    return opensimModelJNI.SetControllers_set__SWIG_0(swigCPtr, this, aIndex, Controller.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Controller aObject) {
    return opensimModelJNI.SetControllers_set__SWIG_1(swigCPtr, this, aIndex, Controller.getCPtr(aObject), aObject);
  }

  public Controller get(int aIndex) {
    return new Controller(opensimModelJNI.SetControllers_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Controller get(String aName) {
    return new Controller(opensimModelJNI.SetControllers_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimModelJNI.SetControllers_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimModelJNI.SetControllers_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimModelJNI.SetControllers_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimModelJNI.SetControllers_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimModelJNI.SetControllers_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimModelJNI.SetControllers_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimModelJNI.SetControllers_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimModelJNI.SetControllers_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimModelJNI.SetControllers_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimModelJNI.SetControllers_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
