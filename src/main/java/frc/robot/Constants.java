// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static class OperatorConstants {
        public static final int kDriverControllerPort = 0;
    }

    //Front Left Swerve Module
    public static final int FRONT_LEFT_DRIVE_ID = 0;
    public static final int FRONT_LEFT_STEERING_MOTOR_ID = 0;
    public static final int FRONT_LEFT_STEERING_ENCODER_ID = 0;
    public static final int FRONT_LEFT_ENCODER_OFFSET = 0;
  
    //Front Right Swerve Module
    public static final int FRONT_RIGHT_DRIVE_ID = 0;
    public static final int FRONT_RIGHT_STEERING_MOTOR_ID = 0;
    public static final int FRONT_RIGHT_STEERING_ENCODER_ID = 0;
    public static final int FRONT_RIGHT_ENCODER_OFFSET = 0;
  
    //Back Left Swerve Module
    public static final int BACK_LEFT_STEERING_MOTOR_ID = 0;
    public static final int BACK_LEFT_STEERING_ENCODER_ID = 0;
    public static final int BACK_LEFT_ENCODER_OFFSET = 0;
    public static final int BACK_LEFT_DRIVE_ID = 0;
  
    //Back Right Swerve Module
    public static final int BACK_RIGHT_DRIVE_ID = 0;
    public static final int BACK_RIGHT_STEERING_MOTOR_ID = 0;
    public static final int BACK_RIGHT_STEERING_ENCODER_ID = 0;
    public static final int BACK_RIGHT_ENCODER_OFFSET = 0;
}
