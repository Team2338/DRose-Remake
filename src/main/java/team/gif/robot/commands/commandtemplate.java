package team.gif.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.OI;
import team.gif.robot.subsystems.subsystemtemplate;

public class commandtemplate extends CommandBase {

    public commandtemplate(subsystemtemplate[] s) {


        for(int c = 0;s.length<c;c++){
            addRequirements(s[c]);
        }


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
