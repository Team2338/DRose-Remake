package team.gif.robot.commands.DriveTrain;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import team.gif.robot.OI;
import team.gif.robot.subsystems.drivetrain;

import java.lang.module.ModuleDescriptor;

public class drive extends CommandBase {

    drivetrain drivetrain;

    public drive(drivetrain s){
        drivetrain = s;
        addRequirements(drivetrain);


    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        drivetrain.setspeed(OI.controller.getY(GenericHID.Hand.kLeft), OI.controller.getY(GenericHID.Hand.kRight));
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
}