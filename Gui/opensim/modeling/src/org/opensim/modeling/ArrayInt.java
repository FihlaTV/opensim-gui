/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayInt {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ArrayInt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayInt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ArrayInt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArrayInt(int aDefaultValue, int aSize, int aCapacity) {
    this(opensimModelJNI.new_ArrayInt__SWIG_0(aDefaultValue, aSize, aCapacity), true);
  }

  public ArrayInt(int aDefaultValue, int aSize) {
    this(opensimModelJNI.new_ArrayInt__SWIG_1(aDefaultValue, aSize), true);
  }

  public ArrayInt(int aDefaultValue) {
    this(opensimModelJNI.new_ArrayInt__SWIG_2(aDefaultValue), true);
  }

  public ArrayInt() {
    this(opensimModelJNI.new_ArrayInt__SWIG_3(), true);
  }

  public ArrayInt(ArrayInt aArray) {
    this(opensimModelJNI.new_ArrayInt__SWIG_4(ArrayInt.getCPtr(aArray), aArray), true);
  }

  public boolean arrayEquals(ArrayInt aArray) {
    return opensimModelJNI.ArrayInt_arrayEquals(swigCPtr, this, ArrayInt.getCPtr(aArray), aArray);
  }

  public void trim() {
    opensimModelJNI.ArrayInt_trim(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimModelJNI.ArrayInt_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelJNI.ArrayInt_getSize(swigCPtr, this);
  }

  public int size() {
    return opensimModelJNI.ArrayInt_size(swigCPtr, this);
  }

  public int append(int aValue) {
    return opensimModelJNI.ArrayInt_append__SWIG_0(swigCPtr, this, aValue);
  }

  public int append(ArrayInt aArray) {
    return opensimModelJNI.ArrayInt_append__SWIG_1(swigCPtr, this, ArrayInt.getCPtr(aArray), aArray);
  }

  public int insert(int aIndex, int aValue) {
    return opensimModelJNI.ArrayInt_insert(swigCPtr, this, aIndex, aValue);
  }

  public int remove(int aIndex) {
    return opensimModelJNI.ArrayInt_remove(swigCPtr, this, aIndex);
  }

  public void set(int aIndex, int aValue) {
    opensimModelJNI.ArrayInt_set(swigCPtr, this, aIndex, aValue);
  }

  public int get(int aIndex) {
    return opensimModelJNI.ArrayInt_get(swigCPtr, this, aIndex);
  }

  public int getitem(int index) {
    return opensimModelJNI.ArrayInt_getitem(swigCPtr, this, index);
  }

  public void setitem(int index, int val) {
    opensimModelJNI.ArrayInt_setitem(swigCPtr, this, index, val);
  }

  public int getLast() {
    return opensimModelJNI.ArrayInt_getLast(swigCPtr, this);
  }

  public int findIndex(int aValue) {
    return opensimModelJNI.ArrayInt_findIndex(swigCPtr, this, aValue);
  }

  public int rfindIndex(int aValue) {
    return opensimModelJNI.ArrayInt_rfindIndex(swigCPtr, this, aValue);
  }

  public int searchBinary(int aValue, boolean aFindFirst, int aLo, int aHi) {
    return opensimModelJNI.ArrayInt_searchBinary__SWIG_0(swigCPtr, this, aValue, aFindFirst, aLo, aHi);
  }

  public int searchBinary(int aValue, boolean aFindFirst, int aLo) {
    return opensimModelJNI.ArrayInt_searchBinary__SWIG_1(swigCPtr, this, aValue, aFindFirst, aLo);
  }

  public int searchBinary(int aValue, boolean aFindFirst) {
    return opensimModelJNI.ArrayInt_searchBinary__SWIG_2(swigCPtr, this, aValue, aFindFirst);
  }

  public int searchBinary(int aValue) {
    return opensimModelJNI.ArrayInt_searchBinary__SWIG_3(swigCPtr, this, aValue);
  }

}
