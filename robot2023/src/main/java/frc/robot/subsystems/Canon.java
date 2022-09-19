// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Canon extends SubsystemBase {
 
  private WPI_TalonSRX rightshooter = new WPI_TalonSRX(05);
  private WPI_TalonSRX leftshooter = new WPI_TalonSRX(8); 

  public Canon() {}

 
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


  public void setMotors(double motor)
  {
    rightshooter.set(motor);
    leftshooter.set(motor);
  }
}
