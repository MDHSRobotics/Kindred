package org.usfirst.frc.team4141.robot.subsystems;

import org.usfirst.frc.team4141.MDRobotBase.MDRobotBase;
import org.usfirst.frc.team4141.MDRobotBase.MDSubsystem;
import org.usfirst.frc.team4141.MDRobotBase.config.ConfigSetting;

import edu.wpi.first.wpilibj.SpeedController;

public class ShootSubsystem extends MDSubsystem {

private SpeedController SController1;

private double ShootS = 1;

public static String RMotr = "Motor";

public MDSubsystem configure() {
	super.configure();
	//setCore(true);
	
	if(getMotors() ==null
			|| !getMotors().containsKey(RMotr)) 
		
		throw new IllegalArgumentException("Invalid motor cofiguration for shoot system.");
	
		SController1 = (SpeedController) (getMotors().get(RMotr));
		
		return this;
}
}
		
		public ShootSubsystem(MDRobotBase robot, String name) {
			
			super(robot, name);
		}
		
		public void motorShoot() {
			
			SController1.set(1);
			}
		
		@Override 
		
		protected void setUp() {
			
			if(getConfigSettings().containsKey("ShootSpeed")) ShootS = getConfigSettings().get("ShootS").getDouble()
					
					@Override
					
					public void settingChangeListener(ConfigSetting changedSetting) {
				
				if(changedSetting.getName().equals("ShootSpeed")) ShootS = changedSetting.getDouble();
				
				@Override
				
				protected void intitDefaultCommand() {
				}
				}
					
		}
}
