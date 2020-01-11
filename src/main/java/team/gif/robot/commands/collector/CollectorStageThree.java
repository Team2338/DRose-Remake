package team.gif.robot.commands.collector;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.subsystems.Collector;

public class CollectorStageThree extends CommandBase {
    public CollectorStageThree() {
        addRequirements(Collector.getInstance());
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        Collector.getInstance().setSpeedMid(0.5);
        Collector.getInstance().setSpeedTop(0.5);
    }

    @Override
    public void end(boolean interrupted) {
        Collector.getInstance().setSpeedMid(0);
        Collector.getInstance().setSpeedTop(0);
    }

    @Override
    public boolean isFinished() {
        return Collector.getInstance().getTopSensor();
    }
}
