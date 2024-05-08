package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrain;

public class DriveCommandXbox extends Command {
    XboxController controller;
    private DriveTrain drive;

    public DriveCommandXbox(XboxController straight, DriveTrain drive)
    {
        this.controller = straight;
        this.drive = drive;
    }

    @Override
    public void execute() {
        drive.drive(controller.getLeftY(), controller.getRightX());
    }
}   
