package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.Subsystem;
import team.gif.robot.RobotMap;

public class drivetrain implements Subsystem {

    private static drivetrain instance = null;

    public static drivetrain getInstance() {
        if (instance == null) {
            instance = new drivetrain();
        }
        return instance;
    }

    // PWM pulse width modulator
    PWMSparkMax rightfrontneo = new PWMSparkMax(RobotMap.rightfrontneo);
    PWMSparkMax leftfrontneo = new PWMSparkMax(RobotMap.leftfrontneo);

    private drivetrain(){
        leftfrontneo.setInverted(true);


    }

    public void setspeed(double leftspeed, double rightspeed){
            //run by percent default always for PWM
            //limits set by library

            rightfrontneo.set(rightspeed);
            leftfrontneo.set(leftspeed);

    }

}
