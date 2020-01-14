package team.gif.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Globals;
import team.gif.robot.subsystems.Collector;
import team.gif.robot.subsystems.Shooter;

public class ShootTrigger extends CommandBase {
    public ShootTrigger() {
        addRequirements(Shooter.getInstance());
        addRequirements(Collector.getInstance());
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        Shooter.getInstance().setSpeedFlywheel(Globals.shooterSpeed);
        Collector.getInstance().setSpeedBot(0.5);
        Collector.getInstance().setSpeedMid(0.5);
        Collector.getInstance().setSpeedTop(0.5);
    }

    @Override
    public void end(boolean interrupted) {
        Shooter.getInstance().setSpeedFlywheel(0);
        Collector.getInstance().setSpeedBot(0);
        Collector.getInstance().setSpeedMid(0);
        Collector.getInstance().setSpeedTop(0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
