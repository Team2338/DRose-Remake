package team.gif.robot.commands.drivetrain;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Globals;
import team.gif.robot.Robot;
import team.gif.robot.subsystems.drivetrain;

public class Pivot extends CommandBase {
    public Pivot() {
        addRequirements(drivetrain.getInstance());
        this.marginx  = Globals.marginx;
        this.marginy  = Globals.marginy;
        this.kPx  = Globals.kPx;
        this.kPy  = Globals.kPy;
        this.kFx = Globals.kFx;
        this.kFy = Globals.kFy;
    }

    public static double marginx ;
    public static double marginy;
    public static double kPx ;
    public static double kPy;
    public static double kFx;
    public static double kFy;
    public static boolean endthing = false;

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        double xoffset = Robot.limelight.getXOffset();
        //double yoffset = Robot.limelight.getYOffset();
        double powerL;
        double powerR;
        SmartDashboard.putBoolean("see target",Robot.limelight.hasTarget());
        if((xoffset>marginx ||xoffset<-marginx) ) {//aligning to x offset
            //SmartDashboard.putBoolean("see target1",Robot.limelight.hasTarget());
            powerL =-1*kPx*xoffset +kFx;
            powerR = 1*kPx*xoffset+kFx;
            drivetrain.getInstance().setspeed(powerL ,powerR);
            SmartDashboard.putBoolean("are we there yet x" , false);
            SmartDashboard.putNumber("PowerL",powerL);
            SmartDashboard.putNumber("PowerR",powerR);
        }else{
            endthing = true;
            drivetrain.getInstance().setspeed(0,0);
            SmartDashboard.putBoolean("are we there yet x", true);
        }
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("end");

            drivetrain.getInstance().setspeed(0, 0);



    }

    @Override
    public boolean isFinished() {
        return endthing;
    }
}