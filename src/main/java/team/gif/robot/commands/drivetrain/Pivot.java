package team.gif.robot.commands.drivetrain;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Globals;
import team.gif.robot.Robot;
import team.gif.robot.subsystems.drivetrain;

public class Pivot extends CommandBase {
    public Pivot() {
        addRequirements(drivetrain.getInstance());
        this.kP = Globals.kP;
        this.margin = Globals.margin;
    }

    public static double margin ;
    public static double kP ;

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        double xoffset = Robot.limelight.getXOffset();
        if(xoffset>-margin ||xoffset<margin) {
            drivetrain.getInstance().setspeed(kP*xoffset,-1*kP*xoffset);
            SmartDashboard.putBoolean("are we there yet" , false);
        }else{
            end(true);
            SmartDashboard.putBoolean("are we there yet", true);
        }
        SmartDashboard.putNumber("robot x offset Angle", xoffset);
        SmartDashboard.putNumber("margin", margin);
        SmartDashboard.putNumber("kP", kP);

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