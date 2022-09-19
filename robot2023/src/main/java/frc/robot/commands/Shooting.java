// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Canon;
import frc.robot.subsystems.Loader;
import edu.wpi.first.wpilibj.Timer;
public class Shooting extends CommandBase {
  
  private final Canon canon;
  private final Loader loader;
  private Timer time;
  public Shooting(Canon canon, Loader loader) {
    this.loader = loader;
    this.canon = canon;
    addRequirements(canon, loader);

  }
@Override
  public void initialize() {
    time.start();
  }

  
  @Override
  public void execute() {

    canon.setMotors(0.9);
    if(time.get() >= 1)
       {
         loader.setLoader(0.2);
       }
  }

  
  @Override
  public void end(boolean interrupted) {
    time.stop();
    time.reset();
    loader.setLoader(0);
    canon.setMotors(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}