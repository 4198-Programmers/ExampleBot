package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SwerveDriveSubsytem extends SubsystemBase {

    private static SwerveModule frontLeftModule;
    private static SwerveModule frontRightModule;
    private static SwerveModule backLeftModule;
    private static SwerveModule backRightModule;

    public SwerveDriveSubsytem() {
        frontLeftModule = new SwerveModule(
            Constants.FRONT_LEFT_DRIVE_ID, 
            Constants.FRONT_LEFT_STEERING_MOTOR_ID,
            Constants.FRONT_LEFT_STEERING_ENCODER_ID,
            Constants.FRONT_LEFT_ENCODER_OFFSET);
            
        frontRightModule = new SwerveModule(
                Constants.FRONT_RIGHT_DRIVE_ID,
                Constants.FRONT_RIGHT_STEERING_MOTOR_ID,
                Constants.FRONT_RIGHT_STEERING_ENCODER_ID,
                Constants.FRONT_RIGHT_ENCODER_OFFSET);

        backLeftModule = new SwerveModule(
            Constants.BACK_LEFT_DRIVE_ID, 
            Constants.BACK_LEFT_STEERING_MOTOR_ID,
            Constants.BACK_LEFT_STEERING_ENCODER_ID,
            Constants.BACK_LEFT_ENCODER_OFFSET);

        backRightModule = new SwerveModule(
            Constants.BACK_RIGHT_DRIVE_ID, 
            Constants.BACK_RIGHT_STEERING_MOTOR_ID,
            Constants.BACK_RIGHT_STEERING_ENCODER_ID,
            Constants.BACK_RIGHT_ENCODER_OFFSET
        ); 

    }

}
