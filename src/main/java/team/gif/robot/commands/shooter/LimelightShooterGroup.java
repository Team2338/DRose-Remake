package team.gif.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import team.gif.robot.commands.drivetrain.Pivot;
import team.gif.robot.commands.collector.CollectorStageThree;
import team.gif.robot.commands.collector.CollectorStageTwo;

public class LimelightShooterGroup extends SequentialCommandGroup {

    public LimelightShooterGroup() {
        addCommands(
                new Pivot(10, 0.25),
                new RevFlywheel().withTimeout(2),
                new ShootTrigger().withTimeout(1),
                new CollectorStageThree(),
                new CollectorStageTwo()
        );
    }
}
