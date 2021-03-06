// Generated with RobotBuilder version 0.0.1

package org.usfirst.frc694.DESdroid.subsystems;

import org.usfirst.frc694.DESdroid.RobotMap;
import org.usfirst.frc694.DESdroid.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Grabber extends Subsystem {
    // The following variables are automatically assigned by
    // robotbuilder and will be updated the next time you export to
    // Java from robot builder. Do not put any code or make any change
    // in the following block or it will be lost on an update. To
    // prevent this subsystem from being automatically updated, delete
    // the following line.
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DigitalInput limitSwitch = RobotMap.GRABBER_LIMIT_SWITCH;
    Victor lowerRoller = RobotMap.GRABBER_LOWERROLLER;
    Victor upperRoller = RobotMap.GRABBER_UPPERROLLER;

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
        setDefaultCommand(new GrabberStop());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void in() {
        upperRoller.set(-1);
        lowerRoller.set(1);
    }

    public void out() {
        upperRoller.set(1);
        lowerRoller.set(-1);
    }

    public void rotateUp() {
        upperRoller.set(-1);
        lowerRoller.set(-1);
    }

    public void rotateDown() {
        upperRoller.set(1);
        lowerRoller.set(1);
    }

    public void stop() {
        upperRoller.set(0);
        lowerRoller.set(0);
    }
}

