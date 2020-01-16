package team.gif.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class Shooter extends SubsystemBase {

    private static Shooter instance = null;
    public static PWMSparkMax flywheelMotor = new PWMSparkMax(RobotMap.flywheelMotor);

    public static Shooter getInstance() {

        if (instance == null) {
            instance = new Shooter();
        }
        return instance;

    }


    //Victor flywheelMotor = new Victor(RobotMap.flywheelMotor);


    public void setSpeedFlywheel(double speedFlywheel) {
        flywheelMotor.set(speedFlywheel);
    }
}
