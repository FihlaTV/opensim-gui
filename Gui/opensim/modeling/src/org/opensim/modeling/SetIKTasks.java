/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetIKTasks extends OpenSimObject {
  private long swigCPtr;

  public SetIKTasks(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.SetIKTasks_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetIKTasks obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_SetIKTasks(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetIKTasks safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.SetIKTasks_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetIKTasks(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.SetIKTasks_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.SetIKTasks_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.SetIKTasks_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetIKTasks(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.SetIKTasks_getConcreteClassName(swigCPtr, this);
  }

  public SetIKTasks() {
    this(opensimModelJNI.new_SetIKTasks__SWIG_0(), true);
  }

  public SetIKTasks(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_SetIKTasks__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetIKTasks(String aFileName) {
    this(opensimModelJNI.new_SetIKTasks__SWIG_2(aFileName), true);
  }

  public SetIKTasks(SetIKTasks aSet) {
    this(opensimModelJNI.new_SetIKTasks__SWIG_3(SetIKTasks.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimModelJNI.SetIKTasks_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimModelJNI.SetIKTasks_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimModelJNI.SetIKTasks_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelJNI.SetIKTasks_getSize(swigCPtr, this);
  }

  public int getIndex(IKTask aObject, int aStartIndex) {
    return opensimModelJNI.SetIKTasks_getIndex__SWIG_0(swigCPtr, this, IKTask.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(IKTask aObject) {
    return opensimModelJNI.SetIKTasks_getIndex__SWIG_1(swigCPtr, this, IKTask.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimModelJNI.SetIKTasks_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimModelJNI.SetIKTasks_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimModelJNI.SetIKTasks_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(IKTask aObject) {
    return opensimModelJNI.SetIKTasks_adoptAndAppend(swigCPtr, this, IKTask.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(IKTask aObject) {
    return opensimModelJNI.SetIKTasks_cloneAndAppend(swigCPtr, this, IKTask.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, IKTask aObject) {
    return opensimModelJNI.SetIKTasks_insert(swigCPtr, this, aIndex, IKTask.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimModelJNI.SetIKTasks_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(IKTask aObject) {
    return opensimModelJNI.SetIKTasks_remove__SWIG_1(swigCPtr, this, IKTask.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimModelJNI.SetIKTasks_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, IKTask aObject, boolean preserveGroups) {
    return opensimModelJNI.SetIKTasks_set__SWIG_0(swigCPtr, this, aIndex, IKTask.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, IKTask aObject) {
    return opensimModelJNI.SetIKTasks_set__SWIG_1(swigCPtr, this, aIndex, IKTask.getCPtr(aObject), aObject);
  }

  public IKTask get(int aIndex) {
    return new IKTask(opensimModelJNI.SetIKTasks_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public IKTask get(String aName) {
    return new IKTask(opensimModelJNI.SetIKTasks_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimModelJNI.SetIKTasks_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimModelJNI.SetIKTasks_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimModelJNI.SetIKTasks_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimModelJNI.SetIKTasks_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimModelJNI.SetIKTasks_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimModelJNI.SetIKTasks_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimModelJNI.SetIKTasks_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimModelJNI.SetIKTasks_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimModelJNI.SetIKTasks_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimModelJNI.SetIKTasks_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
