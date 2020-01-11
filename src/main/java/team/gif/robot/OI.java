package team.gif.robot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import team.gif.robot.commands.*;
import team.gif.robot.commands.collector.IntakeGroup;

public class OI {
    public static XboxController controller = new XboxController(0);
    JoystickButton leftjoystick; //TODO Zane a joystick isn't a button!
    JoystickButton a = new JoystickButton(controller, 1);
    JoystickButton b = new JoystickButton(controller, 2);
    JoystickButton x = new JoystickButton(controller, 3);
    JoystickButton y = new JoystickButton(controller, 4);
    JoystickButton RB = new JoystickButton(controller, 5);
    public OI(){

        //a.whileHeld(new CollectorBottom());
        a.whenPressed(new IntakeGroup());
        //b.whileHeld(new CollectorMiddle());
        x.whileHeld(new CollectorTop());
        y.whenPressed(new Stop());
        RB.whileHeld(new Flywheel());
    }




}
