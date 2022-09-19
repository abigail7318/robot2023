// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intaker;

public class intaking extends CommandBase {
 
  private final Intaker intaker;

  public intaking(Intaker intaker) {

    this.intaker = intaker;
    addRequirements(intaker);

  }

  
  @Override
  public void initialize() {}

  
  @Override
  public void execute() {

    intaker.setIntaker(-0.65);

  }

  
  @Override
  public void end(boolean interrupted) {}

  
  @Override
  public boolean isFinished() {
    return false;
  }
}
