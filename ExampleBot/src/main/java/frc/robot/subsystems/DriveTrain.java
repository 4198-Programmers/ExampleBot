package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.RobotDriveBase.MotorType;
import frc.robot.Constants;

public class DriveTrain {
    

    private CANSparkMax frontLeftMotor = new CANSparkMax(Constants.Motor.frontLeftMotor, MotorType.kBrushless);
    private CANSparkMax frontRightMotor = new CANSparkMax(Constants.Motor.frontLeftMotor, MotorType.kBrushless);
    private CANSparkMax backLeftMotor = new CANSparkMax(Constants.Motor.frontLeftMotor, MotorType.kBrushless);
    private CANSparkMax bakcRightMotor = new CANSparkMax(Constants.Motor.frontLeftMotor, MotorType.kBrushless);


}
