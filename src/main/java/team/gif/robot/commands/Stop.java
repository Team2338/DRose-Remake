package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.subsystems.Collector;
import team.gif.robot.subsystems.Shooter;

public class Stop extends CommandBase {

    public Stop() {
        addRequirements(Shooter.getInstance());
        addRequirements(Collector.getInstance());
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        Shooter.getInstance().setSpeedFlywheel(0.0);
        Collector.getInstance().setSpeedBot(0.0);
        Collector.getInstance().setSpeedMid(0.0);
        Collector.getInstance().setSpeedTop(0.0);
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
