package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.DriveTrain;

public class DriveCommandXbox extends Command {
    CommandXboxController controller;
    private DriveTrain drive;

    public DriveCommandXbox(CommandXboxController straight, DriveTrain drive)
    {
        this.controller = straight;
        this.drive = drive;
        addRequirements(drive);
    }

    @Override
    public void execute() {
        drive.drive(controller.getLeftY(), controller.getRightX());
    }
}   
