// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
 
  

 private WPI_VictorSPX right1 = new WPI_VictorSPX(01);
 private WPI_VictorSPX right2 = new WPI_VictorSPX(02);
 private WPI_VictorSPX left1 = new WPI_VictorSPX(03);
 private  WPI_VictorSPX left2 = new WPI_VictorSPX(04);

  public DriveTrain() {}


  public void setMotors(double left, double right) {
    right1.set(right);
    right2.set(right);
    left1.set(left);
    left2.set(left);

}
 


  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
