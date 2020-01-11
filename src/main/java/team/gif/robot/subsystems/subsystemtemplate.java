package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.TalonSRX; //talon import
import com.ctre.phoenix.motorcontrol.can.VictorSPX; //victor import
import com.revrobotics.CANSparkMax;//CANSparkMax
public class subsystemtemplate extends SubsystemBase {
    /*
        PWMSparkMax
        PWMSparkMax rightfrontneo = new PWMSparkMax(RobotMap.rightfrontneo);
    */
    /*
        Victors
        Victor v = new Victor​(RobotMap.rightfrontneo);
    */
    /*
        Talons
        Talon talon = new Talon(RobotMap.talon);
    */
    /*
        Sparks
        CANSparkMax max= new CANSparkMax(RobotMap.max);
    */

    private static subsystemtemplate instance = null;

    public static subsystemtemplate getInstance() {
        if (instance == null) {
            instance = new subsystemtemplate();
        }
        return instance;
    }

}