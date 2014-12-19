/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetWrapObject extends OpenSimObject {
  private long swigCPtr;

  public SetWrapObject(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.SetWrapObject_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetWrapObject obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_SetWrapObject(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetWrapObject safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.SetWrapObject_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetWrapObject(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.SetWrapObject_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.SetWrapObject_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.SetWrapObject_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetWrapObject(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.SetWrapObject_getConcreteClassName(swigCPtr, this);
  }

  public SetWrapObject() {
    this(opensimModelJNI.new_SetWrapObject__SWIG_0(), true);
  }

  public SetWrapObject(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_SetWrapObject__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetWrapObject(String aFileName) {
    this(opensimModelJNI.new_SetWrapObject__SWIG_2(aFileName), true);
  }

  public SetWrapObject(SetWrapObject aSet) {
    this(opensimModelJNI.new_SetWrapObject__SWIG_3(SetWrapObject.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimModelJNI.SetWrapObject_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimModelJNI.SetWrapObject_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimModelJNI.SetWrapObject_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelJNI.SetWrapObject_getSize(swigCPtr, this);
  }

  public int getIndex(WrapObject aObject, int aStartIndex) {
    return opensimModelJNI.SetWrapObject_getIndex__SWIG_0(swigCPtr, this, WrapObject.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(WrapObject aObject) {
    return opensimModelJNI.SetWrapObject_getIndex__SWIG_1(swigCPtr, this, WrapObject.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimModelJNI.SetWrapObject_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimModelJNI.SetWrapObject_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimModelJNI.SetWrapObject_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(WrapObject aObject) {
    return opensimModelJNI.SetWrapObject_adoptAndAppend(swigCPtr, this, WrapObject.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(WrapObject aObject) {
    return opensimModelJNI.SetWrapObject_cloneAndAppend(swigCPtr, this, WrapObject.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, WrapObject aObject) {
    return opensimModelJNI.SetWrapObject_insert(swigCPtr, this, aIndex, WrapObject.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimModelJNI.SetWrapObject_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(WrapObject aObject) {
    return opensimModelJNI.SetWrapObject_remove__SWIG_1(swigCPtr, this, WrapObject.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimModelJNI.SetWrapObject_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, WrapObject aObject, boolean preserveGroups) {
    return opensimModelJNI.SetWrapObject_set__SWIG_0(swigCPtr, this, aIndex, WrapObject.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, WrapObject aObject) {
    return opensimModelJNI.SetWrapObject_set__SWIG_1(swigCPtr, this, aIndex, WrapObject.getCPtr(aObject), aObject);
  }

  public WrapObject get(int aIndex) {
    return new WrapObject(opensimModelJNI.SetWrapObject_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public WrapObject get(String aName) {
    return new WrapObject(opensimModelJNI.SetWrapObject_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimModelJNI.SetWrapObject_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimModelJNI.SetWrapObject_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimModelJNI.SetWrapObject_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimModelJNI.SetWrapObject_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimModelJNI.SetWrapObject_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimModelJNI.SetWrapObject_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimModelJNI.SetWrapObject_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimModelJNI.SetWrapObject_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimModelJNI.SetWrapObject_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimModelJNI.SetWrapObject_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
