package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class Limelight extends SubsystemBase {

    private static Limelight instance = null;

    public static Limelight getInstance() {
        if (instance == null) {
            instance = new Limelight();
        }
        return instance;
    }

    PWMSparkMax rightfrontneo = new PWMSparkMax(RobotMap.rightfrontneo);
    PWMSparkMax rightbackneo = new PWMSparkMax(RobotMap.rightbackneo);
    PWMSparkMax leftfrontneo = new PWMSparkMax(RobotMap.leftfrontneo);
    PWMSparkMax leftbackneo = new PWMSparkMax(RobotMap.leftbackneo);

    right
}
