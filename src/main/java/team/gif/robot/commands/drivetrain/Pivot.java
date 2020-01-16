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
        this.kF = Globals.kF;
    }

    public static double margin ;
    public static double kP ;
    public static double kF;
    public static boolean endthing = false;

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        double xoffset = Robot.limelight.getXOffset();
        while(xoffset>margin ||xoffset<-margin) {
            drivetrain.getInstance().setspeed(-1*kP*xoffset +kF ,1*kP*xoffset+kF);
            SmartDashboard.putBoolean("are we there yet" , false);
        }

        drivetrain.getInstance().setspeed(0,0);
        endthing = true;
        SmartDashboard.putBoolean("are we there yet x", true);

        SmartDashboard.putNumber("robot x offset Angle", xoffset);
        SmartDashboard.putNumber("margin", margin);
        SmartDashboard.putNumber("kP", kP);
        SmartDashboard.putNumber("kF", kF);

    }

    @Override
    public void end(boolean interrupted) {


            drivetrain.getInstance().setspeed(0, 0);



    }

    @Override
    public boolean isFinished() {
        return endthing;
    }
}