/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class opensimModel implements opensimModelConstants {
  public static void setOpenSimVersion(String value) {
    opensimModelJNI.OpenSimVersion_set(value);
  }

  public static String getOpenSimVersion() {
    return opensimModelJNI.OpenSimVersion_get();
  }

  public static String GetVersionAndDate() {
    return opensimModelJNI.GetVersionAndDate();
  }

  public static String GetVersion() {
    return opensimModelJNI.GetVersion();
  }

  public static String GetOSInfoVerbose() {
    return opensimModelJNI.GetOSInfoVerbose();
  }

  public static String GetOSInfo() {
    return opensimModelJNI.GetOSInfo();
  }

  public static String GetCompilerVersion() {
    return opensimModelJNI.GetCompilerVersion();
  }

  public static int getArray_CAPMIN() {
    return opensimModelJNI.Array_CAPMIN_get();
  }

  public static String getObjectDEFAULT_NAME() {
    return opensimModelJNI.ObjectDEFAULT_NAME_get();
  }

  public static int getStorage_DEFAULT_CAPACITY() {
    return opensimModelJNI.Storage_DEFAULT_CAPACITY_get();
  }

  public static int getIO_STRLEN() {
    return opensimModelJNI.IO_STRLEN_get();
  }

  public static int getPointKinematicsNAME_LENGTH() {
    return opensimModelJNI.PointKinematicsNAME_LENGTH_get();
  }

  public static int getPointKinematicsBUFFER_LENGTH() {
    return opensimModelJNI.PointKinematicsBUFFER_LENGTH_get();
  }

  public static void setMapCxxExceptionsToJava(boolean value) {
    opensimModelJNI.mapCxxExceptionsToJava_set(value);
  }

  public static boolean getMapCxxExceptionsToJava() {
    return opensimModelJNI.mapCxxExceptionsToJava_get();
  }

}
