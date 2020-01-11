package team.gif.robot.commands.collector;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.subsystems.Collector;

public class CollectorStageTwo extends CommandBase {
    public CollectorStageTwo() {
        addRequirements(Collector.getInstance());
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        Collector.getInstance().setSpeedBot(0.5);
        Collector.getInstance().setSpeedMid(0.5);
    }

    @Override
    public void end(boolean interrupted) {
        Collector.getInstance().setSpeedBot(0);
        Collector.getInstance().setSpeedMid(0);
    }

    @Override
    public boolean isFinished() {
        return Collector.getInstance().getMidSensor();
    }
}
