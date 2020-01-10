package team.gif.robot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import team.gif.robot.commands.*;

public class OI {
    public static XboxController controller = new XboxController(8);
    JoystickButton leftjoystick; //TODO Zane a joystick isn't a button!
    JoystickButton a = new JoystickButton(controller, 1);
    JoystickButton b = new JoystickButton(controller, 2);
    JoystickButton x = new JoystickButton(controller, 3);
    JoystickButton y = new JoystickButton(controller, 4);
    JoystickButton RB = new JoystickButton(controller, 5);
    public OI(){

        a.whileHeld(new CollectorBottom());
        b.whileHeld(new CollectorMiddle());
        x.whileHeld(new CollectorTop());
        y.whenPressed(new Stop());
        RB.whileHeld(new Flywheel());
    }




}
