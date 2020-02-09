package team.gif.robot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import team.gif.robot.commands.drivetrain.drive;
import team.gif.robot.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */

public class Robot extends TimedRobot {
//  private static final String kDefaultAuto = "Default";
//  private static final String kCustomAuto = "My Auto";
//  private String m_autoSelected;
//  private final SendableChooser<String> m_chooser = new SendableChooser<>();
//

  //public drivetrain drive;

  public drivetrain driver;

  public static Limelight limelight;
  private OI oi;

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
//    m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
//    m_chooser.addOption("My Auto", kCustomAuto);
//    SmartDashboard.putData("Auto choices", m_chooser);

//    drivetrain = new drivetrain();


    oi = new OI();
    driver = drivetrain.getInstance();
    SmartDashboard.putNumber("Shooter Speed", Globals.shooterSpeed);
    SmartDashboard.putNumber("marginx", Globals.marginx);
    SmartDashboard.putNumber("kPx", Globals.kPx);

    //SmartDashboard.putNumber("margin", Globals.margin);
    //SmartDashboard.putNumber("kP", Globals.kP);

    limelight = new Limelight();
  }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {

    SmartDashboard.putNumber("target y",Robot.limelight.getYOffset());
    SmartDashboard.putNumber("target x",Robot.limelight.getXOffset());



    //System.out.println(Robot.limelight.getCamTran());
    //System.out.println("target y "+Robot.limelight.getYOffset());
    //SmartDashboard.putNumber("target x",Robot.limelight.getXOffset());
    SmartDashboard.putBoolean("see target",Robot.limelight.hasTarget());
    CommandScheduler.getInstance().run();
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString line to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional comparisons to
   * the switch structure below with additional strings. If using the
   * SendableChooser make sure to add them to the chooser code above as well.
   */
  @Override
  public void autonomousInit() {
//    m_autoSelected = m_chooser.getSelected();
//     m_autoSelected = SmartDashboard.getString("Auto Selector", kDefaultAuto);
//    System.out.println("Auto selected: " + m_autoSelected);
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
//    switch (m_autoSelected) {
//      case kCustomAuto:
//         Put custom auto code here
//        break;
//      case kDefaultAuto:
//      default:
//         Put default auto code here
//        break;
//    }
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {

  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {

  }

  @Override
  public void teleopInit() {
    SmartDashboard.putBoolean("see target",Robot.limelight.hasTarget());

    System.out.println("teleop init");

    drive d = new drive(driver);
    CommandScheduler.getInstance().schedule(d);

    //System.out.println("teleop init");
    //drive = new drivetrain();



    Globals.shooterSpeed = SmartDashboard.getNumber("Shooter Speed", Globals.shooterSpeed);
    //Globals.margin = SmartDashboard.getNumber("margin", Globals.margin);
    //Globals.kP = SmartDashboard.getNumber("kP", Globals.kP);
    //I was here lol

  }
}