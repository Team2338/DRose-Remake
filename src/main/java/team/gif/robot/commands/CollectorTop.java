package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.subsystems.Collector;

public class CollectorTop extends CommandBase {

    public CollectorTop() {
        addRequirements(Collector.getInstance());
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        Collector.getInstance().setSpeedTop(0.2);
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
