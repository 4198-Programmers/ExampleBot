package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MotorTestSubsystem extends SubsystemBase {

    private CANSparkMax testMotor = new CANSparkMax(Constants.TEST_MOTOR_ID, MotorType.kBrushless);
    DigitalInput limitSwitch = new DigitalInput(Constants.LIMIT_SWITCH_ID);

    public void runTestMotor() {
        testMotor.set(1);
    }

    public void stopMotor() {
        testMotor.stopMotor();
    }

    public boolean limitStatus() {
        return limitSwitch.get();
    }

}
