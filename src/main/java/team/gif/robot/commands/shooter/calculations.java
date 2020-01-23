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
        double yoffset = Robot.limelight.getYOffset();
        Globals.shooterSpeed = yoffset*Globals.m +Globals.k;
        SmartDashboard.putNumber("shooterspeed",Globals.shooterSpeed);
    }
    @Override
    public void execute(){


    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
