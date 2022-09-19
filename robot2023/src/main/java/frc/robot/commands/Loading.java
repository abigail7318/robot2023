// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Loader;

public class Loading extends CommandBase {

  private final Loader loader;

  public Loading(Loader loader) {
     
    this.loader = loader;
    addRequirements(loader);
     
  }

  
  @Override
  public void initialize() {}

  @Override
  public void execute() {

    loader.setLoader(0.2);

  }


  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
