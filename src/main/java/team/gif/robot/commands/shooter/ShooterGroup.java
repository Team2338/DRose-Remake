package team.gif.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import team.gif.robot.commands.collector.CollectorStageThree;
import team.gif.robot.commands.collector.CollectorStageTwo;

public class ShooterGroup extends SequentialCommandGroup {
    double time = 2;

    public ShooterGroup() {
        addCommands(
                new RevFlywheel().withTimeout(time),
                new ShootTrigger()
        );
    }
}
