package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.Subsystem;
import team.gif.robot.RobotMap;

public class drivetrain implements Subsystem {


    // PWM pulse width modulator
    PWMSparkMax rightfrontneo = new PWMSparkMax(RobotMap.rightfrontneo);
    PWMSparkMax rightbackneo = new PWMSparkMax(RobotMap.rightbackneo);
    PWMSparkMax leftfrontneo = new PWMSparkMax(RobotMap.leftfrontneo);
    PWMSparkMax leftbackneo = new PWMSparkMax(RobotMap.leftbackneo);

    public drivetrain(){




    }

    public void setspeed(double leftspeed, double rightspeed){

            //run by percent default always for PWM
            //limits set by library
            leftbackneo.set(leftspeed);
            leftfrontneo.set(leftspeed);
            rightfrontneo.set(rightspeed);
            rightbackneo.set(rightspeed);

    }



}
