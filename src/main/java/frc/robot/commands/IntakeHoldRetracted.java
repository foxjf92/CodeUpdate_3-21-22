/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;

public class IntakeHoldRetracted extends Command {
  
  private static final double SPEED = 0.1;

  /**
   * Creates a new Collect command.
   */
  
   public IntakeHoldRetracted() {
    // Use addRequirements() here to declare subsystem dependencies.
    requires(Robot.intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    Robot.intake.setExtenderCurrentLimit(5);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Robot.intake.retract(-SPEED);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void interrupted() {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
      return false;
  }
}
