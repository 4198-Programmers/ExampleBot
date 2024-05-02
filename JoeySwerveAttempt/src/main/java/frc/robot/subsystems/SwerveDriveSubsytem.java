package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SwerveDriveSubsytem extends SubsystemBase {

    //Swerve Drive Motors
    private static CANSparkMax frontLeftDriveMotor = new CANSparkMax(Constants.FRONT_LEFT_DRIVE_MOTOR, MotorType.kBrushless);
    private static CANSparkMax frontRightDriveMotor = new CANSparkMax(Constants.FRONT_RIGHT_DRIVE_MOTOR, MotorType.kBrushless);
    private static CANSparkMax backLeftDriveMotor = new CANSparkMax(Constants.BACK_LEFT_DRIVE_MOTOR, MotorType.kBrushless);
    private static CANSparkMax backRightDriveMotor = new CANSparkMax(Constants.BACK_RIGHT_DRIVE_MOTOR, MotorType.kBrushless);

    //Swerve Steering Motors
    private static CANSparkMax frontLeftSteeringMotor = new CANSparkMax(Constants.FRONT_LEFT_STEERING_MOTOR, MotorType.kBrushless);
    private static CANSparkMax frontRightSteerngMotor = new CANSparkMax(Constants.FRONT_RIGHT_STEERING_MOTOR, MotorType.kBrushless);
    private static CANSparkMax backLeftSteeringMotor = new CANSparkMax(Constants.BACK_LEFT_STEERING_MOTOR, MotorType.kBrushless);
    private static CANSparkMax backRightSteeringMotor = new CANSparkMax(Constants.BACK_RIGHT_STEERING_MOTOR, MotorType.kBrushless);

    //Swerve Drive Relative Encoders
    private static RelativeEncoder frontLeftDriveEncoder = frontLeftDriveMotor.getEncoder();
    private static RelativeEncoder frontRightDriveEncoder = frontRightDriveMotor.getEncoder();
    private static RelativeEncoder backLeftDriveEncoder = backLeftDriveMotor.getEncoder();
    private static RelativeEncoder backRightDriveEncoder = backRightDriveMotor.getEncoder();
    
    //Swerve Steering Absoulute Encoders

    
}
