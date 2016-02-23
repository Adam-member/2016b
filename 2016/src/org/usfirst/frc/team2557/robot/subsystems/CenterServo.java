package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CenterServo extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void getAngle(){
    	RobotMap.servoCenterAngle = RobotMap.servoCenter.getAngle();
    }
    public void setAngle(){
    	RobotMap.servoCenter.setAngle(RobotMap.servoCenterAngle);
    }
    public void sweepAngle(){
    	RobotMap.servoCenter.setAngle(RobotMap.servoCenterAngle + 2);
    }
}

