package team.gif.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.subsystems.Shooter;

public class Flywheel extends CommandBase {

    public Flywheel() {
        addRequirements(Shooter.getInstance());
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {

        Shooter.getInstance().setSpeedFlywheel(0.4);

    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
