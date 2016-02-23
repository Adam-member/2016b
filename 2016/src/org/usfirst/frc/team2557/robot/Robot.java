
package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
//import org.usfirst.frc.team2557.robot.subsystems.RFArray;
import org.usfirst.frc.team2557.sensors.LidarRangeFinder;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import java.io.IOException;

import org.usfirst.frc.team2557.robot.commands.ExampleCommand;
import org.usfirst.frc.team2557.robot.commands.LaserTrackingCommand;
import org.usfirst.frc.team2557.robot.subsystems.Drivetrain2;
import org.usfirst.frc.team2557.robot.subsystems.ExampleSubsystem;
import org.usfirst.frc.team2557.robot.subsystems.LaserTracking;
//import org.usfirst.frc.team2557.robot.commands.RFArrayCommand;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
	public static OI oi;
	//public static RFArray RFArray = new RFArray();
	public static LaserTracking laserTracking = new LaserTracking();
	public static LidarRangeFinder lidarRangeFinder = new LidarRangeFinder();
	public static Drivetrain2 drivetrain2 = new Drivetrain2();

    Command autonomousCommand;
    //Command RFArrayCommand;
    Command LaserTrackingCommand;
    Command DriveGyroCommand;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	RobotMap.init();
    	
    /*	try {
    		new ProcessBuilder("/home/lvuser/start_grip").start();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}*/
		oi = new OI();
        // instantiate the command used for the autonomous period
        autonomousCommand = new ExampleCommand();
        //RFArrayCommand = new RFArrayCommand();
        LaserTrackingCommand = new LaserTrackingCommand();
        //DriveGyroCommand = new DriveGyroCommand();
        
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        LaserTrackingCommand.start();
        //RFArrayCommand.start();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
