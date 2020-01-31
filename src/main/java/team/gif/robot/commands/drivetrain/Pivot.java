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
        this.Iend = Globals.Iend;
        this.PivotI = Globals.pivotI;
    }

    public static double marginx ;
    public static double marginy;
    public static double kPx ;
    public static double kPy;
    public static double kFx;
    public static double kFy;
    public static boolean endthing = false;
    public static double PivotI;
    public int Iend = 0;
    public int Ilooped = 0;
    double IpowerL;
    double IpowerR;

    @Override
    public void initialize() {
        System.out.println("pivot");
        IpowerL = 0;
        IpowerR =0 ;
    }

    @Override
    public void execute() {

        double xoffset = Robot.limelight.getXOffset();
        double yoffset = Robot.limelight.getYOffset();
        IpowerL = IpowerL +PivotI*xoffset;
        IpowerR = IpowerR +PivotI*xoffset;
        double powerL;
        double powerR;
        int f = 1;
        SmartDashboard.putBoolean("see target",Robot.limelight.hasTarget());
        if(xoffset<0){
            f = -1;
        }
        powerL =-1*(kPx*xoffset + f*kFx + f*IpowerL);
        powerR = 1*(kPx*xoffset + f*kFx + f*IpowerR);
        if(powerL > 1){
            powerL = 1;
        }
        if(powerL < -1){
            powerL = -1;
        }
        if(powerR > 1){
            powerR = 1;
        }
        if(powerR < -1){
            powerR = -1;
        }

        if(xoffset>marginx ||xoffset<-marginx) {//aligning to x offset
            //SmartDashboard.putBoolean("see target1",Robot.limelight.hasTarget());

            drivetrain.getInstance().setspeed(powerL ,powerR);
            SmartDashboard.putBoolean("are we there yet x" , false);
            SmartDashboard.putNumber("PowerL",powerL);
            SmartDashboard.putNumber("PowerR",powerR);
        }else{
            Ilooped++;

            if(Ilooped>Iend){
                System.out.println("wegot there");
                SmartDashboard.putBoolean("are we there yet x", true);
                drivetrain.getInstance().setspeed(0,0);
                endthing = true;
            }

        }
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