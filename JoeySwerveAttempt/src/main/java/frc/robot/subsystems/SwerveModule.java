package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class SwerveModule {

    private static CANSparkMax driveMotor;
    private static RelativeEncoder driveEncoder;
    private static int driveMotorID;
    private static CANSparkMax steeringMotor;
    private static int steeringMotorID;


    public void SwerveModule(CANSparkMax driveMotor, int driveMotorID, RelativeEncoder driveEncoder, CANSparkMax steeringMotor, int steeringMotorID) {
        //Swerve Drive 
        driveMotor = new CANSparkMax(driveMotorID, MotorType.kBrushless);
        driveEncoder = driveMotor.getEncoder();

        //Swerve Steering 
        steeringMotor = new CANSparkMax(steeringMotorID, MotorType.kBrushless);
        

    }
    
}
