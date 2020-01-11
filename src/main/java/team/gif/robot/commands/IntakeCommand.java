package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.subsystems.Collector;

public class IntakeCommand extends CommandBase {
    public IntakeCommand() {
        addRequirements(Collector.getInstance());
    }
    int i = 0;

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        boolean sensor1 = Collector.getInstance().getBotSensor();
        boolean sensor2 = Collector.getInstance().getMidSensor();
        boolean sensor3 = Collector.getInstance().getTopSensor();

        //0
        if(i == 0 && Collector.getInstance().getBotSensor() == false) {
            Collector.getInstance().setSpeedBot(0.5);
        } else if (i == 0 && Collector.getInstance().getBotSensor() == true) {
            i++;
        }
        //1
        if(i == 1 && Collector.getInstance().getMidSensor() == false) {
            Collector.getInstance().setSpeedBot(0.5);
            Collector.getInstance().setSpeedMid(0.5);
        } else if (i == 1 && Collector.getInstance().getMidSensor() == true) {
            i++;
            Collector.getInstance().setSpeedBot(0.0);
        }
        //2
        if(i == 2 && Collector.getInstance().getTopSensor() == false) {
            Collector.getInstance().setSpeedMid(0.5);
            Collector.getInstance().setSpeedTop(0.5);
        } else if (i == 2 && Collector.getInstance().getTopSensor() == true) {
            i++;
            Collector.getInstance().setSpeedMid(0.0);
            Collector.getInstance().setSpeedTop(0.0);
        }
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        if(i == 3) {
            return true;
        } else {
            return  false;
        }
    }
}
