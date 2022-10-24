
package frc.robot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
// import frc.robot.commands.AutoDrive;
import frc.robot.commands.DriveTrainCommand;
import frc.robot.commands.intaking;
import frc.robot.commands.Loading;
import frc.robot.commands.Shooting;
import frc.robot.commands.unleash;
import frc.robot.subsystems.Canon;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Loader;
// import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Intaker;



public class RobotContainer {

  public Joystick joystick = new Joystick(0);
  public Joystick joystick2 = new Joystick(1);
  private static DriveTrain driveTrain = new DriveTrain();
  private static Loader loader = new Loader();
  private static Intaker intaker = new Intaker();
  private static Canon canon = new Canon();
  Networktables networkTable;
  Timer currentTime;
 
 

  public RobotContainer() {
    
    driveTrain.setDefaultCommand(
   new DriveTrainCommand(driveTrain, () -> -joystick.getRawAxis(1),() -> joystick.getRawAxis(0)
   )
  );
    configureButtonBindings();
  }

  
  private void configureButtonBindings() {

   new JoystickButton(joystick2, 3).whileActiveOnce(new intaking(intaker));

    new JoystickButton(joystick2, 4).whileActiveOnce(new Loading(loader));
    
    new JoystickButton(joystick2, 1).whileActiveOnce(new Shooting(canon, loader));
    
    new JoystickButton(joystick2, 6).whileActiveOnce(new unleash(loader,intaker));

    
  }


  // public Command getAutonomousCommand() {

  // return new AutoDrive(driveTrain);

  // }
}