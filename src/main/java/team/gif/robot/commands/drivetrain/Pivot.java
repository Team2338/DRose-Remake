package team.gif.robot.commands.drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Robot;
import team.gif.robot.subsystems.drivetrain;

public class Pivot extends CommandBase {
    public Pivot(double margin) {
        addRequirements(drivetrain.getInstance());
    }

    public static double margin;
    public static double speedconst;
    @Override
    public void initialize() {

    }

    @Override
    public void execute() {

        while(Robot.limelight.getXOffset()>margin ||Robot.limelight.getXOffset()<margin) {
            drivetrain.getInstance().setspeed(speedconst*Robot.limelight.getXOffset(),-1*speedconst*Robot.limelight.getXOffset());
        }

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