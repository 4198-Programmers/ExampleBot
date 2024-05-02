package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class SwerveModule {

    private static CANSparkMax driveMotorName;
    private static RelativeEncoder driveEncoderName;
    private static int driveMotorID;


    public void SwerveModule(CANSparkMax driveMotorName, int driveMotorID, RelativeEncoder driveEncoderName, ) {
        //Swerve Drive 
        driveMotorName = new CANSparkMax(driveMotorID, MotorType.kBrushless);
        driveEncoderName = driveMotorName.getEncoder();

        //Swerve Angle
        

    }
    
}
