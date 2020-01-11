package team.gif.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import team.gif.robot.commands.CollectorBottom;
import team.gif.robot.commands.CollectorMiddle;
import team.gif.robot.commands.CollectorTop;

public class OI {
    public static XboxController controller = new XboxController(8);
    Joystick leftjoystick; //TODO Zane a joystick isn't a button!
    JoystickButton a = new JoystickButton(controller, 1);
    JoystickButton b = new JoystickButton(controller, 2);
    JoystickButton x = new JoystickButton(controller, 3);
    JoystickButton RB = new JoystickButton(controller, 5);
    public OI(){

        a.whileHeld(new CollectorBottom());
        b.whileHeld(new CollectorMiddle());
        x.whileHeld(new CollectorTop());
    }
}
