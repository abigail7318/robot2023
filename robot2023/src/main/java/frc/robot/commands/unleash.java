// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intaker;
import frc.robot.subsystems.Loader;
public class unleash extends CommandBase {
  
  private final Loader loader;
  private final Intaker intaker;
  public unleash(Loader loader, Intaker intaker) {
    this.loader = loader;
     this.intaker  = intaker;
     addRequirements(loader,intaker);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    loader.setLoader(-0.6);
    intaker.setIntaker(-0.6);
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    loader.setLoader(0);
    intaker.setIntaker(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}