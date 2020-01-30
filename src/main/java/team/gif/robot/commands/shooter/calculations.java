package team.gif.robot.commands.shooter;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Globals;
import team.gif.robot.Robot;

public class calculations extends CommandBase {

    public calculations(){}

    @Override
    public void initialize() {
        System.out.println("calculations init");
        // calculating the speed of the flywheel

        //FOR down towards target

        double yoffset = Robot.limelight.getYOffset();
        if(yoffset>1.8){
            yoffset = yoffset*-1;
        }
        Globals.shooterSpeed = yoffset*Globals.m +Globals.k;
        SmartDashboard.putNumber("shooterspeed",Globals.shooterSpeed);
        System.out.println(Globals.shooterSpeed);
    }
    @Override
    public void execute(){

    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
