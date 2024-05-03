package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.MotorTestSubsystem;

public class MotorTestCommand extends Command {
    
    private MotorTestSubsystem motorTestSubsystem;

    public MotorTestCommand(MotorTestSubsystem motorTestSubsystem) {
        this.motorTestSubsystem = motorTestSubsystem;
        addRequirements(motorTestSubsystem);
    }

    @Override
    public void execute() {
        // Limit switch returns true if not pressed down
        // Runs motor when switch isn't pressed down, stops when it is
        if (motorTestSubsystem.limitStatus()) {
            motorTestSubsystem.runTestMotor();
        } else {
            motorTestSubsystem.stopMotor();
        }
    }

}
