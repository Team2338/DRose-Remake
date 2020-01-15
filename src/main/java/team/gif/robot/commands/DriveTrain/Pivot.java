package team.gif.robot.commands.DriveTrain;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.OI;
import team.gif.robot.subsystems.drivetrain;

public class Pivot extends CommandBase {
    public Pivot() {
        addRequirements(drivetrain.getInstance());
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        drivetrain.getInstance().setspeed(0, 0);
    }

    @Override
    public void end(boolean interrupted) {
        drivetrain.getInstance().setspeed(0, 0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
