package team.gif.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import team.gif.robot.commands.collector.CollectorStageThree;
import team.gif.robot.commands.collector.CollectorStageTwo;
import team.gif.robot.commands.collector.IntakeGroup;

public class LimelightShooterGroup extends SequentialCommandGroup {

    public LimelightShooterGroup() {
        addCommands(
                /*
                 * SCHEDULE:
                 * 1. Limelight
                 * 2. Pivot
                 * 3. Shoot (done)
                 */
                new RevFlywheel().withTimeout(2),
                new ShootTrigger().withTimeout(1),
                new CollectorStageThree(),
                new CollectorStageTwo()
        );
    }
}
