/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetFunctions extends OpenSimObject {
  private long swigCPtr;

  public SetFunctions(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.SetFunctions_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetFunctions obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_SetFunctions(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetFunctions safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.SetFunctions_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetFunctions(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.SetFunctions_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.SetFunctions_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.SetFunctions_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetFunctions(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.SetFunctions_getConcreteClassName(swigCPtr, this);
  }

  public SetFunctions() {
    this(opensimModelJNI.new_SetFunctions__SWIG_0(), true);
  }

  public SetFunctions(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_SetFunctions__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetFunctions(String aFileName) {
    this(opensimModelJNI.new_SetFunctions__SWIG_2(aFileName), true);
  }

  public SetFunctions(SetFunctions aSet) {
    this(opensimModelJNI.new_SetFunctions__SWIG_3(SetFunctions.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimModelJNI.SetFunctions_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimModelJNI.SetFunctions_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimModelJNI.SetFunctions_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelJNI.SetFunctions_getSize(swigCPtr, this);
  }

  public int getIndex(Function aObject, int aStartIndex) {
    return opensimModelJNI.SetFunctions_getIndex__SWIG_0(swigCPtr, this, Function.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Function aObject) {
    return opensimModelJNI.SetFunctions_getIndex__SWIG_1(swigCPtr, this, Function.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimModelJNI.SetFunctions_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimModelJNI.SetFunctions_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimModelJNI.SetFunctions_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(Function aObject) {
    return opensimModelJNI.SetFunctions_adoptAndAppend(swigCPtr, this, Function.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(Function aObject) {
    return opensimModelJNI.SetFunctions_cloneAndAppend(swigCPtr, this, Function.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Function aObject) {
    return opensimModelJNI.SetFunctions_insert(swigCPtr, this, aIndex, Function.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimModelJNI.SetFunctions_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Function aObject) {
    return opensimModelJNI.SetFunctions_remove__SWIG_1(swigCPtr, this, Function.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimModelJNI.SetFunctions_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Function aObject, boolean preserveGroups) {
    return opensimModelJNI.SetFunctions_set__SWIG_0(swigCPtr, this, aIndex, Function.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Function aObject) {
    return opensimModelJNI.SetFunctions_set__SWIG_1(swigCPtr, this, aIndex, Function.getCPtr(aObject), aObject);
  }

  public Function get(int aIndex) {
    return new Function(opensimModelJNI.SetFunctions_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Function get(String aName) {
    return new Function(opensimModelJNI.SetFunctions_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimModelJNI.SetFunctions_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimModelJNI.SetFunctions_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimModelJNI.SetFunctions_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimModelJNI.SetFunctions_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimModelJNI.SetFunctions_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimModelJNI.SetFunctions_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimModelJNI.SetFunctions_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimModelJNI.SetFunctions_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimModelJNI.SetFunctions_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimModelJNI.SetFunctions_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
