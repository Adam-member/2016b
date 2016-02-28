package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Arm extends Subsystem {
    private boolean inZone;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void armTest1(){
    	SmartDashboard.putNumber("Gyro Angle", RobotMap.gyro.getAngle());
    	if(RobotMap.gyro.getAngle() > 65){
    		inZone = true;
    		SmartDashboard.putBoolean("inZone", inZone);
    	}
    }
    public void armTest2(){
    	while(RobotMap.gyro.getAngle() > 45){
    		RobotMap.leftMotor.set(.5);
    	}
    }
}

