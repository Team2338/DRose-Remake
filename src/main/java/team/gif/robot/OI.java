package team.gif.robot;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import team.gif.robot.commands.*;
import team.gif.robot.commands.collector.IntakeGroup;
import team.gif.robot.commands.drivetrain.Pivot;
import team.gif.robot.commands.shooter.LimelightShooterGroup;
import team.gif.robot.commands.shooter.ShooterGroup;
import java.lang.Object;


public class OI {
    public static XboxController controller = new XboxController(0);
    JoystickButton leftjoystick; //TODO Zane a joystick isn't a button!
    JoystickButton a = new JoystickButton(controller, 1);
    JoystickButton b = new JoystickButton(controller, 2);
    JoystickButton x = new JoystickButton(controller, 3);
    JoystickButton y = new JoystickButton(controller, 4);
    JoystickButton LB = new JoystickButton(controller, 5);
    JoystickButton RB = new JoystickButton(controller, 6);
    JoystickButton LT = new JoystickButton(controller, 7);
    JoystickButton menu = new JoystickButton(controller, 8);
    public OI(){
            // a.whileHeld(new CollectorBottom());
            // b.whileHeld(new CollectorMiddle());
            // x.whileHeld(new CollectorTop());

            y.whenPressed(new Stop().withTimeout(20));//thats nyoo
            LB.whenPressed(new Flywheel());
            LB.whenReleased(new Stop());

            x.whenPressed(new IntakeGroup());
            x.whenReleased(new Stop());
            a.whenPressed(new ShooterGroup());
            a.whenReleased(new Stop());
            RB.whenPressed(new Pivot());
            RB.whenReleased(new Stop());


            menu.whenPressed(new LimelightShooterGroup());


    }
    public void setRumble(boolean rumble) {
        controller.setRumble(GenericHID.RumbleType.kLeftRumble, rumble ? 1.0 : 0.0);
        controller.setRumble(GenericHID.RumbleType.kRightRumble, rumble ? 1.0 : 0.0);
    }

}