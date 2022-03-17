/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.ClimbCommand;

public class Feeder extends Subsystem {
  private final int FEED_MOTOR_CAN_ID = 11;
  
  CANSparkMax feedMotor;
  DigitalInput feedTriggerSwitch;

  public Feeder() {
    feedMotor = new CANSparkMax(FEED_MOTOR_CAN_ID, MotorType.kBrushless);
    feedMotor.setSmartCurrentLimit(20);
    feedTriggerSwitch = new DigitalInput(0);
  }

  public void feed(double speed) {
    feedMotor.set(speed);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ClimbCommand());
  }
 
}
