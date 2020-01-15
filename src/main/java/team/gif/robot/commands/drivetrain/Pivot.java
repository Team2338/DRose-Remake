package team.gif.robot.commands.drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Robot;
import team.gif.robot.subsystems.drivetrain;

public class Pivot extends CommandBase {
    public Pivot(double margin, double kP) {
        addRequirements(drivetrain.getInstance());
        this.kP = kP;
        this.margin = margin;
    }

    public static double margin;
    public static double kP;

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {

        if(Robot.limelight.getXOffset()>margin ||Robot.limelight.getXOffset()<margin) {
            drivetrain.getInstance().setspeed(kP*Robot.limelight.getXOffset(),-1*kP*Robot.limelight.getXOffset());
        }else{
            end(true);

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