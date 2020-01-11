package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class Collector extends SubsystemBase {

    private static Collector instance = null;

    public static Collector getInstance() {
        if (instance == null) {
            instance = new Collector();
        }
        return instance;
    }

    Victor collectMotorBot = new Victor(RobotMap.collectorMotorBot);
    Victor collectMotorMid = new Victor(RobotMap.collectorMotorMid);
    Victor collectMotorTop = new Victor(RobotMap.collectorMotorTop);

    DigitalInput botSensor = new DigitalInput(RobotMap.lightOne);
    DigitalInput midSensor = new DigitalInput(RobotMap.lightTwo);
    DigitalInput topSensor = new DigitalInput(RobotMap.lightThree);

    private Collector() {
        super();
        collectMotorTop.setInverted(true);
    }

    public void setSpeedBot(double speedBot) {
        collectMotorBot.set(speedBot);
    }

    public void setSpeedMid(double speedMid) {
        collectMotorMid.set(speedMid);
    }

    public void setSpeedTop(double speedTop) {
        collectMotorTop.set(speedTop);
    }

    public boolean getBotSensor() {
        return botSensor.get();
    }

    public boolean getMidSensor() {
        return midSensor.get();
    }

    public boolean getTopSensor() {
        return topSensor.get();
    }
}
