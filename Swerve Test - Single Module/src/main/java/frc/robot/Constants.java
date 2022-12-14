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

    //Max radians/sec that the bot will rotate at
    public static final double MAX_ANGULAR_SPEED = 4;

    //
    public final class MMConstants{
        public static final int PRIMARY_PID_LOOP_IDX = 0;
        public static final int TIMEOUT_MS = 30;
    }

    public final class ModuleConstants {
        public static final int DRIVE_GEARING = 7; 
        public static final double WHEEL_DIA = 4; //in inches
        public static final double TURN_GEARING = 54;
        public static final double MAX_SPEED = 3; 

        public static final int ENCODER_RESET_ITERATIONS = 500;
        // only reference the absolute encoder under 1 deg/sec
        public static final double ENCODER_RESET_MAX_ANGULAR_VELOCITY = Math.PI / 180; 

        //module offsets for the zero position for each wheel, in this order
        //Front Left - Front Right - Back Left - Back Right
        public static final double MODULE1_OFFSET = 0;
        public static final double MODULE2_OFFSET = 0;
        public static final double MODULE3_OFFSET = 0;
        public static final double MODULE4_OFFSET = 0;



    }

    public static final double FALCON_UNITS_PER_REV = 2048;

}
