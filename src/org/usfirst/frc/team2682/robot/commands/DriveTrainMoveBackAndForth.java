package org.usfirst.frc.team2682.robot.commands;

import org.usfirst.frc.team2682.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTrainMoveBackAndForth extends Command {

	double moveValue;
    public DriveTrainMoveBackAndForth() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveSubsystem);
        this.moveValue = 1.0;
    }
    public DriveTrainMoveBackAndForth(double moveValue) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveSubsystem);
        this.moveValue = moveValue;
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveSubsystem.drive(moveValue, 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveSubsystem.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
