package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.subsystems.Collector;

public class CollectorMiddle extends CommandBase {

    public CollectorMiddle() {
        addRequirements(Collector.getInstance());
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        Collector.getInstance().setSpeedMid(0.5);
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
