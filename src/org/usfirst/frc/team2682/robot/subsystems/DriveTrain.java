package org.usfirst.frc.team2682.robot.subsystems;

import org.usfirst.frc.team2682.robot.Robot;
import org.usfirst.frc.team2682.robot.RobotMap;
//import org.usfirst.frc.team2682.robot.commands.DriveTrainMove;
import org.usfirst.frc.team2682.robot.commands.DriveTrainMoveBackAndForth;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	//Talon leftDriveMotor = new Talon(RobotMap.leftDriveMotors);
	//Spark rightDriveMotor = new Spark(RobotMap.rightDriveMotor);
	RobotDrive robotDrive = new RobotDrive(RobotMap.leftDriveMotors, RobotMap.rightDriveMotor);
   
    public void initDefaultCommand() {
    	
       setDefaultCommand(new DriveTrainMoveBackAndForth());
       
    }
   public void drive(double moveValue, double rotateValue)
    {
    	robotDrive.arcadeDrive(moveValue * -1, rotateValue * -1);
    //	robotDrive.arcadeDrive(moveValue, rotateValue);
    	
    }
    public void stop() 
    {
      	Robot.driveSubsystem.stop();
    }

}

