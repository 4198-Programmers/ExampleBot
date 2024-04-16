package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import com.revrobotics.CANSparkLowLevel.MotorType;
import frc.robot.Constants;


public class DriveTrain {
/*The first portion of any code is used to define items 
 * a CANSparkMax is a type of motor 
 * 
 */


    private static final CANSparkMax backRightMotor = null;
    //telling the code what it can use, Motor Id
    // the "new" in the statment creates a new item or thing for the bot
    private CANSparkMax frontLeftMotor = new CANSparkMax(Constants.FRONT_LEFT_MOTOR, MotorType.kBrushless);
    private CANSparkMax frontRightMotor = new CANSparkMax(Constants.FRONT_RIGHT_MOTOR, MotorType.kBrushless);
    private CANSparkMax backLeftMotor = new CANSparkMax(Constants.BACK_LEFT_MOTOR, MotorType.kBrushless);
    private CANSparkMax bakcRightMotor = new CANSparkMax(Constants.BACK_RIGHT_MOTOR, MotorType.kBrushless);

    //tells the bot how many time a motor has spun
    private RelativeEncoder frontLeftEncoder = frontLeftMotor.getEncoder();
    private RelativeEncoder frontRightEncoder = frontRightMotor.getEncoder();
    private RelativeEncoder backLeftEncoder = backLeftMotor.getEncoder();
    private RelativeEncoder backRightEncoder = backRightMotor.getEncoder();

    private MotorControllerGroup left = new MotorControllerGroup(frontLeftMotor, backLeftMotor);
    private MotorControllerGroup right = new MotorControllerGroup(frontRightMotor, backRightMotor);
    
    
    //Locks the two motor in place
    private DifferentialDrive driveTrain = new DifferentialDrive(left, right); 
    




}

