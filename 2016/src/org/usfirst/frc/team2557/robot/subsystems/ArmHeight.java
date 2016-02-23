package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmHeight extends Subsystem {
    private boolean inZone;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void setting1(){
    	while(RobotMap.gyro.getAngle() > 0){
    		RobotMap.motor.set(-1);
    	}
    }
    public void setting2(){
    	while(RobotMap.gyro.getAngle() > 7){
    		RobotMap.leftMotor.set(-1);
    	}
    	while(RobotMap.gyro.getAngle() <= 7){
    		RobotMap.leftMotor.set(1);
    	}
    	if(RobotMap.gyro.getAngle() < 7 && RobotMap.gyro.getAngle() >= 3 && leftButton == true){
    		inZone = true;
    	}
    	if(inZone == true){
    		RobotMap.leftMotor.set(Robot.oi.joystick1.getY());
    		}
    	}
    }
     


