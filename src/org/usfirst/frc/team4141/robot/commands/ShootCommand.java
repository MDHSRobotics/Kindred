package org.usfirst.frc.team4141.robot.commands;


import org.usfirst.frc.team4141.MDRobotBase.MDCommand;
import org.usfirst.frc.team4141.MDRobotBase.MDJoystick;
import org.usfirst.frc.team4141.MDRobotBase.MDRobotBase;
import org.usfirst.frc.team4141.MDRobotBase.MDSubsystem;
import org.usfirst.frc.team4141.robot.subsystems.MDDriveSubsystem;


public class ShootCommand extends MDCommand {
	
	public ShootCommand(MDRobotBase robot, String name) {
		
		private ShootSubsystem SS;
		
		public ShootCommand(MDRobotBase robot, String name) {
		
		super(robot, name);
		if(!getRobot().getSubsystems().containsKey("shootSubsystem")){
			log(Level.ERROR, "initialize()", "shoot subsystem not found");
			throw new IllegalArgumentException("Shoot Subsystem not found");
		}
		shootSubsystem = (ShootSubsystem)getRobot().getSubsystems().get("shootSubsystem"); 
		requires(shootSubsystem);
		
	}
protected void initialize() {
	

}
protected boolean infinished() {
	
	return false;

}
protected void execute() {
	
	if(shootSubsystem!=null)shootSubsystem.shoot();
	log(Level.DEBUG,"execute()","Shooting");
	
}
protected void end() {
	
	shootSubsystem.stop() {
	
}
}