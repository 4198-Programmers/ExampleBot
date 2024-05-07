package frc.robot.subsystems;

import java.io.ObjectInputFilter.Status;

import com.ctre.phoenix6.StatusSignal;
import com.ctre.phoenix6.configs.CANcoderConfiguration;
import com.ctre.phoenix6.hardware.CANcoder;
import com.ctre.phoenix6.signals.AbsoluteSensorRangeValue;
import com.ctre.phoenix6.signals.SensorDirectionValue;
import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class SwerveModule {

    private static CANSparkMax driveMotor;
    private static RelativeEncoder driveEncoder;
    private static int driveMotorID;
    private static CANSparkMax steeringMotor;
    private static int steeringMotorID;
    private static double angleEncoderOffsest;
    private static CANcoder steeringAbsoluteEncoder;
    private static int steeringEncoderID;

    public SwerveModule(String frontLeftDriveId, String frontLeftSteeringMotorId, String frontLeftSteeringEncoderId,
            String frontLeftEncoderOffset) {
        //TODO Auto-generated constructor stub
    }

    public void SwerveModule(int driveMotorID, int steeringMotorID, int steeringEcnoderID, double angleEncoderOffsest) {
        //Swerve Drive 
        driveMotor = new CANSparkMax(driveMotorID, MotorType.kBrushless);
        driveEncoder = driveMotor.getEncoder();

        //Swerve Angle
        steeringMotor = new CANSparkMax(steeringMotorID, MotorType.kBrushless);     
        CANcoder steeringAbsoluteEncoder = new CANcoder(steeringEncoderID);
        CANcoderConfiguration configuration = new CANcoderConfiguration();

        //Configuration
        configuration.MagnetSensor.MagnetOffset = angleEncoderOffsest;
        configuration.MagnetSensor.AbsoluteSensorRange = AbsoluteSensorRangeValue.Signed_PlusMinusHalf;
        configuration.MagnetSensor.SensorDirection = SensorDirectionValue.CounterClockwise_Positive;

        //Apply Configs
        steeringAbsoluteEncoder.getConfigurator().apply(configuration);

        //Restore Motor Defaults
        driveMotor.restoreFactoryDefaults();
        steeringMotor.restoreFactoryDefaults();
        
    }

    public double getAbsolutePosition() {
        double currentPosition = steeringAbsoluteEncoder.getAbsolutePosition().getValueAsDouble();
        return currentPosition;
    }

    
    
}
