/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Stage {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Stage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Stage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Stage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Stage() {
    this(opensimModelJNI.new_Stage__SWIG_0(), true);
  }

  public Stage(int l) {
    this(opensimModelJNI.new_Stage__SWIG_1(l), true);
  }

  public Stage next() {
    return new Stage(opensimModelJNI.Stage_next(swigCPtr, this), true);
  }

  public Stage prev() {
    return new Stage(opensimModelJNI.Stage_prev(swigCPtr, this), true);
  }

  public SWIGTYPE_p_String getName() {
    return new SWIGTYPE_p_String(opensimModelJNI.Stage_getName(swigCPtr, this), true);
  }

  public void invalidate(Stage tooHigh) {
    opensimModelJNI.Stage_invalidate(swigCPtr, this, Stage.getCPtr(tooHigh), tooHigh);
  }

  public boolean isInRuntimeRange() {
    return opensimModelJNI.Stage_isInRuntimeRange(swigCPtr, this);
  }

  public final static class Level {
    public final static Stage.Level Empty = new Stage.Level("Empty", opensimModelJNI.Stage_Empty_get());
    public final static Stage.Level Topology = new Stage.Level("Topology", opensimModelJNI.Stage_Topology_get());
    public final static Stage.Level Model = new Stage.Level("Model", opensimModelJNI.Stage_Model_get());
    public final static Stage.Level Instance = new Stage.Level("Instance", opensimModelJNI.Stage_Instance_get());
    public final static Stage.Level Time = new Stage.Level("Time", opensimModelJNI.Stage_Time_get());
    public final static Stage.Level Position = new Stage.Level("Position", opensimModelJNI.Stage_Position_get());
    public final static Stage.Level Velocity = new Stage.Level("Velocity", opensimModelJNI.Stage_Velocity_get());
    public final static Stage.Level Dynamics = new Stage.Level("Dynamics", opensimModelJNI.Stage_Dynamics_get());
    public final static Stage.Level Acceleration = new Stage.Level("Acceleration", opensimModelJNI.Stage_Acceleration_get());
    public final static Stage.Level Report = new Stage.Level("Report", opensimModelJNI.Stage_Report_get());
    public final static Stage.Level Infinity = new Stage.Level("Infinity", opensimModelJNI.Stage_Infinity_get());
    public final static Stage.Level LowestValid = new Stage.Level("LowestValid", opensimModelJNI.Stage_LowestValid_get());
    public final static Stage.Level HighestValid = new Stage.Level("HighestValid", opensimModelJNI.Stage_HighestValid_get());
    public final static Stage.Level LowestRuntime = new Stage.Level("LowestRuntime", opensimModelJNI.Stage_LowestRuntime_get());
    public final static Stage.Level HighestRuntime = new Stage.Level("HighestRuntime", opensimModelJNI.Stage_HighestRuntime_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Level swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Level.class + " with value " + swigValue);
    }

    private Level(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Level(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Level(String swigName, Level swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Level[] swigValues = { Empty, Topology, Model, Instance, Time, Position, Velocity, Dynamics, Acceleration, Report, Infinity, LowestValid, HighestValid, LowestRuntime, HighestRuntime };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static int NValid = opensimModelJNI.Stage_NValid_get();
  public final static int NRuntime = opensimModelJNI.Stage_NRuntime_get();

}
