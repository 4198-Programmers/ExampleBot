package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.RobotDriveBase.MotorType;
import frc.robot.Constants;

public class DriveTrain {
/*The first portion of any code is used to define items 
 * a CANSparkMax is a type of motor 
 * 
 */


    //telling the code what it can use, Motor Id
    // the "new" in the statment creates a new item or thing for the bot
    private CANSparkMax frontLeftMotor = new CANSparkMax(Constants.Motor.frontLeftMotor, MotorType.kBrushless);
    private CANSparkMax frontRightMotor = new CANSparkMax(Constants.Motor.frontLeftMotor, MotorType.kBrushless);
    private CANSparkMax backLeftMotor = new CANSparkMax(Constants.Motor.frontLeftMotor, MotorType.kBrushless);
    private CANSparkMax bakcRightMotor = new CANSparkMax(Constants.Motor.frontLeftMotor, MotorType.kBrushless);

    //tells the bot 
    private RelativeEncoder frontLeftEncoder = frontLeftMotor.getEncoder();
    private RelativeEncoder frontRightEncoder = frontRightMotor.getEncoder();
    private RelativeEncoder backLeftEncoder = backLeftMotor.getEncoder();
    private RelativeEncoder backRightEncoder = backRightMotor.getEncoder();

    private MotorControllerGroup left = new MotorControllerGroup(frontLeftMotor, backLeftMotor);
    private MotorControllerGroup right = new MotorControllerGroup(frontRightMotor, backRightMotor);
  
    private DifferentialDrive driveTrain = new DifferentialDrive(left, right); 




}

