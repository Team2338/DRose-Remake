package team.gif.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import team.gif.robot.OI;

import java.lang.module.ModuleDescriptor;

public class drive extends CommandBase {
    public drive(Subsystem s){

        addRequirements(s);


    }


    @Override
    public void initialize() {

    }

    @Override
    public void execute() {

    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
