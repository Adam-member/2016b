package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.OI;
import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

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
    		RobotMap.leftMotor.set(-1);
    	}
    }
    public void setting2(){
    	while(RobotMap.gyro.getAngle() > 7){
    		RobotMap.leftMotor.set(-1);
    	}
    	while(RobotMap.gyro.getAngle() <= 7){
    		RobotMap.leftMotor.set(1);
    	}
    	if(RobotMap.gyro.getAngle() < 8 && RobotMap.gyro.getAngle() >= 3 && OI.joystick1.getRawButton(1)){
    		inZone = true;
    	}
    	if(inZone == true){
    		RobotMap.leftMotor.set(Robot.oi.joystick1.getY());
    		}
    	inZone = false;
    	}
    	public void setting3(){
    		while(RobotMap.gyro.getAngle() < 15){
    			RobotMap.leftMotor.set(1);
    		}
    		while(RobotMap.gyro.getAngle() >= 15){
    			RobotMap.leftMotor.set(-1);
    		}
    	}
    	public void setting4(){
    		while(RobotMap.gyro.getAngle() < 45){
    			RobotMap.leftMotor.set(1);
    		}
    		while(RobotMap.gyro.getAngle() >= 45){
    			RobotMap.leftMotor.set(-1);
    		}
    	}
    	public void setting5(){
    		while(RobotMap.gyro.getAngle() < 65){
    			RobotMap.leftMotor.set(1);
    		}
    		while(RobotMap.gyro.getAngle() >= 65){
    			RobotMap.leftMotor.set(-1);
    		}
    		if(RobotMap.gyro.getAngle() < 68 && RobotMap.gyro.getAngle() >= 63 && OI.joystick1.getRawButton(1)){
    			inZone = true;
    		}
    		if(inZone == true){
    			RobotMap.leftMotor.set(Robot.oi.joystick1.getY());
    		}
    		inZone = false;
    	}
    	public void setting6(){
    		while(RobotMap.gyro.getAngle() < 80){
    			RobotMap.leftMotor.set(1);
    		}
    		while(RobotMap.gyro.getAngle() >= 80){
    			RobotMap.leftMotor.set(-1);
    		}
    		if(RobotMap.gyro.getAngle() > 77 && RobotMap.gyro.getAngle() < 83 && OI.joystick1.getRawButton(1)){
    			inZone = true;
    		}
    		if(inZone == true){
    			RobotMap.leftMotor.set(Robot.oi.joystick1.getY());
    		}
    		inZone = false;
    		
    	}
    	public void setting7(){
    		while(RobotMap.gyro.getAngle() < 90){
    			RobotMap.leftMotor.set(1);
    		}
    		while(RobotMap.gyro.getAngle() >= 90){
    			RobotMap.leftMotor.set(-1);
    		}
    	}
    }
    


