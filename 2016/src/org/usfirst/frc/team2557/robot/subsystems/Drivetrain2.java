package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain2 extends Subsystem {
    private double xValue;
    private double yValue;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void gyroReverseDirection(){
    	xValue = -Robot.oi.joystick1.getX();
    	yValue = -Robot.oi.joystick1.getY();
    	if(RobotMap.gyro.getAngle() > 180){
    		RobotMap.robotDrive.arcadeDrive(xValue, yValue);
    	}
    	else{
    		RobotMap.robotDrive.arcadeDrive(Robot.oi.joystick1);
    	}
    }
    public void driveGyro(){
    	if(RobotMap.gyro.getAngle() < 180){
    		RobotMap.robotDrive.arcadeDrive(Robot.oi.joystick1.getRawAxis(1),Robot.oi.joystick1.getRawAxis(0));
    	} else if(RobotMap.gyro.getAngle() >= 180) {
    		RobotMap.robotDrive.arcadeDrive(-Robot.oi.joystick1.getRawAxis(1), Robot.oi.joystick1.getRawAxis(0));
    	}
    }
}

