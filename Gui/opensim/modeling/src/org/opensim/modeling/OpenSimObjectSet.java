/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class OpenSimObjectSet extends OpenSimObject {
  private transient long swigCPtr;

  public OpenSimObjectSet(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.OpenSimObjectSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(OpenSimObjectSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_OpenSimObjectSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static OpenSimObjectSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.OpenSimObjectSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new OpenSimObjectSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.OpenSimObjectSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.OpenSimObjectSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.OpenSimObjectSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObjectSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.OpenSimObjectSet_getConcreteClassName(swigCPtr, this);
  }

  public OpenSimObjectSet() {
    this(opensimCommonJNI.new_OpenSimObjectSet__SWIG_0(), true);
  }

  public OpenSimObjectSet(String aFileName, boolean aUpdateFromXMLNode) throws java.io.IOException {
    this(opensimCommonJNI.new_OpenSimObjectSet__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public OpenSimObjectSet(String aFileName) throws java.io.IOException {
    this(opensimCommonJNI.new_OpenSimObjectSet__SWIG_2(aFileName), true);
  }

  public OpenSimObjectSet(OpenSimObjectSet aSet) {
    this(opensimCommonJNI.new_OpenSimObjectSet__SWIG_3(OpenSimObjectSet.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimCommonJNI.OpenSimObjectSet_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimCommonJNI.OpenSimObjectSet_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimCommonJNI.OpenSimObjectSet_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimCommonJNI.OpenSimObjectSet_getSize(swigCPtr, this);
  }

  public int getIndex(OpenSimObject aObject, int aStartIndex) {
    return opensimCommonJNI.OpenSimObjectSet_getIndex__SWIG_0(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(OpenSimObject aObject) {
    return opensimCommonJNI.OpenSimObjectSet_getIndex__SWIG_1(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimCommonJNI.OpenSimObjectSet_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimCommonJNI.OpenSimObjectSet_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimCommonJNI.OpenSimObjectSet_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(OpenSimObject aObject) {
    return opensimCommonJNI.OpenSimObjectSet_adoptAndAppend(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(OpenSimObject aObject) {
    return opensimCommonJNI.OpenSimObjectSet_cloneAndAppend(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, OpenSimObject aObject) {
    return opensimCommonJNI.OpenSimObjectSet_insert(swigCPtr, this, aIndex, OpenSimObject.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimCommonJNI.OpenSimObjectSet_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(OpenSimObject aObject) {
    return opensimCommonJNI.OpenSimObjectSet_remove__SWIG_1(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimCommonJNI.OpenSimObjectSet_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, OpenSimObject aObject, boolean preserveGroups) {
    return opensimCommonJNI.OpenSimObjectSet_set__SWIG_0(swigCPtr, this, aIndex, OpenSimObject.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, OpenSimObject aObject) {
    return opensimCommonJNI.OpenSimObjectSet_set__SWIG_1(swigCPtr, this, aIndex, OpenSimObject.getCPtr(aObject), aObject);
  }

  public OpenSimObject get(int aIndex) {
    return new OpenSimObject(opensimCommonJNI.OpenSimObjectSet_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public OpenSimObject get(String aName) {
    return new OpenSimObject(opensimCommonJNI.OpenSimObjectSet_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimCommonJNI.OpenSimObjectSet_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimCommonJNI.OpenSimObjectSet_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimCommonJNI.OpenSimObjectSet_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimCommonJNI.OpenSimObjectSet_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimCommonJNI.OpenSimObjectSet_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimCommonJNI.OpenSimObjectSet_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimCommonJNI.OpenSimObjectSet_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimCommonJNI.OpenSimObjectSet_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimCommonJNI.OpenSimObjectSet_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimCommonJNI.OpenSimObjectSet_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
