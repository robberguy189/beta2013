// Generated with RobotBuilder version 0.0.1

package org.usfirst.frc694.DESdroid.subsystems;

import org.usfirst.frc694.DESdroid.RobotMap;
import org.usfirst.frc694.DESdroid.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drivetrain extends Subsystem {
    // The following variables are automatically assigned by
    // robotbuilder and will be updated the next time you export to
    // Java from robot builder. Do not put any code or make any change
    // in the following block or it will be lost on an update. To
    // prevent this subsystem from being automatically updated, delete
    // the following line.
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    RobotDrive drivetrain = RobotMap.DRIVETRAIN_DRIVETRAIN;
    Victor rearRightMotor = RobotMap.DRIVETRAIN_REARRIGHTMOTOR;
    Victor frontRightMotor = RobotMap.DRIVETRAIN_FRONTRIGHTMOTOR;
    Victor rearLeftMotor = RobotMap.DRIVETRAIN_REARLEFTMOTOR;
    Victor frontLeftMotor = RobotMap.DRIVETRAIN_FRONTLEFTMOTOR;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // The following variables are automatically assigned by
        // robotbuilder and will be updated the next time you export to
        // Java from robot builder. Do not put any code or make any change
        // in the following block or it will be lost on an update. To
        // prevent this subsystem from being automatically updated, delete
        // the following line.
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new DrivetrainDrive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void mecanumDrive(double x, double y, double rotation) {
        drivetrain.mecanumDrive_Cartesian(x, y, rotation, 0);
    }
    
}

