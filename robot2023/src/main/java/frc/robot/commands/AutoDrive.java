// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class AutoDrive extends CommandBase {

  private final DriveTrain driveTrain;
  
  public AutoDrive(DriveTrain driveTrain ) {
    this.driveTrain = driveTrain;
    addRequirements(driveTrain);
  }

  
  @Override
  public void initialize() {}


  @Override
  public void execute() {

    driveTrain.setMotors(-0.2,0.2);

  }

  
  public void end(boolean interrupted) {
    
    driveTrain.setMotors(0,0);

  }

 
  @Override
  public boolean isFinished() {
    return false;
  }
}
