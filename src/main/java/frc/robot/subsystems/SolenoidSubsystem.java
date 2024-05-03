package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;

public class SolenoidSubsystem extends SubsystemBase {

    private Solenoid solenoid = new Solenoid(0, PneumaticsModuleType.CTREPCM, 0);

    public void initialize() {
        solenoid.set(false);
    }

    public void ended() {
        solenoid.set(false);
    }

}
