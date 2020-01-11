package team.gif.robot.commands.collector;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class IntakeGroup extends SequentialCommandGroup {
    public IntakeGroup() {
        addCommands(
                new CollectorStageOne(),
                new CollectorStageTwo(),
                new CollectorStageThree()
        );
    }
}
