package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;

import com.revrobotics.CANSparkLowLevel.MotorType;
import frc.robot.Constants;

public class DriveTrain {
    /*
     * The first portion of any code is used to define items
     * a CANSparkMax is a type of motor
     * 
     */

    // telling the code what it can use, Motor Id
    // the "new" in the statment creates a new item or thing for the bot
    private CANSparkMax frontLeftMotor = new CANSparkMax(Constants.FRONT_LEFT_MOTOR, MotorType.kBrushless);
    private CANSparkMax frontRightMotor = new CANSparkMax(Constants.FRONT_RIGHT_MOTOR, MotorType.kBrushless);
    private CANSparkMax backLeftMotor = new CANSparkMax(Constants.BACK_LEFT_MOTOR, MotorType.kBrushless);
    private CANSparkMax backRightMotor = new CANSparkMax(Constants.BACK_RIGHT_MOTOR, MotorType.kBrushless);

    // tells the bot how many time a motor has spun
    private RelativeEncoder frontLeftEncoder = frontLeftMotor.getEncoder();
    private RelativeEncoder frontRightEncoder = frontRightMotor.getEncoder();
    private RelativeEncoder backLeftEncoder = backLeftMotor.getEncoder();
    private RelativeEncoder backRightEncoder = backRightMotor.getEncoder();

    DifferentialDrive tankDrive = new DifferentialDrive (
        (double leftOutput) -> {
            frontLeftMotor.set(leftOutput);
            backLeftMotor.set(leftOutput);
        }, 
        (double rightOutput) -> {
            frontRightMotor.set(rightOutput);
            backRightMotor.set(rightOutput);
        }
    );
    
    public void drive(double zRotate, double xAxis){
        tankDrive.arcadeDrive(Constants.DRIVE_SPEED * zRotate, Constants.DRIVE_SPEED * xAxis);
    }

    // Simple function to get robot position in inches for a wheel with a diameter of 8 inches
    public double getRobotPosition() {
        double positionAverage = ((frontLeftEncoder.getPosition() + frontRightEncoder.getPosition() + backLeftEncoder.getPosition() + backRightEncoder.getPosition()) / (4*Constants.WHEEL_CIRCUMFERENCE));
        return positionAverage;
    }

    // Locks the two motor in place
    // private DifferentialDrive driveTrain = new DifferentialDrive(left,z right);

}
