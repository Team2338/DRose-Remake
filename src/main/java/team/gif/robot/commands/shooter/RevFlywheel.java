package team.gif.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Globals;
import team.gif.robot.subsystems.Shooter;

public class RevFlywheel extends CommandBase {
    public RevFlywheel() {
        addRequirements(Shooter.getInstance());
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        Shooter.getInstance().setSpeedFlywheel(Globals.shooterSpeed);
    }

    @Override
    public void end(boolean interrupted) {
        Shooter.getInstance().setSpeedFlywheel(0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
