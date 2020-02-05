package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Robot;
import team.gif.robot.subsystems.Collector;

public class VibeRate extends CommandBase {
    public VibeRate() {
        addRequirements(Collector.getInstance());
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        Robot.oi.setRumble(true);
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
