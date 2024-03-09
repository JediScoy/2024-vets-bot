package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends TimedRobot{

private static final int leftfrontID = 2;
  private static final int leftbackID = 1;
  private static final int rightfrontID = 11;
  private static final int rightbackID = 12;
  private static final int feedID = 5;
  private static final int lauchTopID = 6;
  private static final int launchBottomID = 7;
  private static final int rotateLeftID = 8;
  private static final int rotateRightID = 9;

  //motor controlers
    //   private final WPI_VictorSPX m_leftfront = new CANSparkMax(leftfrontID);
    //   private final WPI_VictorSPX m_leftback = new CANSparkMax(leftbackID);
  // private final WPI_VictorSPX m_righfront = new CANSparkMax(rightfrontID);
//   private final WPI_VictorSPX m_rightback = new CANSparkMax(rightbackID);

/* 
private final CANSparkMax m_feed = new CANSparkMax(feedID);
  private final CANSparkMax m_launchTop = new CANSparkMax(lauchTopID);
  private final CANSparkMax m_launchBottom = new CANSparkMax(launchBottomID);
  private final CANSparkMax m_rotateLeft = new CANSparkMax(rotateLeftID);
  private final CANSparkMax m_rotateRight = new CANSparkMax(rotateRightID);

  private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_leftfront, m_rightfront);
  private final Joystick driver = new Joystick(0);
  private final XboxController operator = new XboxController(1);
    // The robot's subsystems and commands are defined here...

    private final WPI_VictorSPX m_leftfront = new WPI_VictorSPX(leftfrontID);  // adjust CAN IDs as needed
    private final WPI_VictorSPX m_leftback = new WPI_VictorSPX(leftbackID);  // adjust CAN IDs as needed
    private final WPI_VictorSPX m_righfront = new WPI_VictorSPX(rightfrontID);  // adjust CAN IDs as needed
    private final WPI_VictorSPX m_rightback = new WPI_VictorSPX(rightbackID);  // adjust CAN IDs as needed
    private final WPI_VictorSPX rightMotor = new WPI_VictorSPX(1);  // adjust CAN IDs as needed
*/
    private final DifferentialDrive drive = new DifferentialDrive(leftMotor, rightMotor);

    private final XboxController controller = new XboxController(0);  // adjust port as needed

    public Robot() {
        // Configure the button bindings
        configureButtonBindings();
    }

    private void configureButtonBindings() {
        // Drive with joystick
        drive.arcadeDrive(controller.getY(Hand.kLeft), controller.getX(Hand.kRight));
    }
}