// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6335;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController shooterShooterMotor;
    public static SpeedController driveTrainFrontLeft;
    public static SpeedController driveTrainBackLeft;
    public static SpeedController driveTrainFrontRight;
    public static SpeedController driveTrainBackRight;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        shooterShooterMotor = new Spark(0);
        LiveWindow.addActuator("Shooter", "ShooterMotor", (Spark) shooterShooterMotor);
        
        driveTrainFrontLeft = new Spark(1);
        LiveWindow.addActuator("DriveTrain", "FrontLeft", (Spark) driveTrainFrontLeft);
        
        driveTrainBackLeft = new Spark(2);
        LiveWindow.addActuator("DriveTrain", "BackLeft", (Spark) driveTrainBackLeft);
        
        driveTrainFrontRight = new Spark(3);
        LiveWindow.addActuator("DriveTrain", "FrontRight", (Spark) driveTrainFrontRight);
        
        driveTrainBackRight = new Spark(4);
        LiveWindow.addActuator("DriveTrain", "BackRight", (Spark) driveTrainBackRight);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
