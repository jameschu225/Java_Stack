package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(int ID, String role) {
    	this.employeeID = ID;
    	this.role = role;
    	this.securityIncidents = new ArrayList<String>();
    }
    // TO DO: Implement HIPAACompliantUser!
    @Override
    public boolean assignPin(int pin) {
    	// TODO Auto-generated method stub
        String stringPin = Integer.toString(pin);

		if (stringPin.length() >= 6) {
			super.setPin(pin);
			return true;
		}
		return false;
    }
    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	// TODO Auto-generated method stub
		if (employeeID.intValue() == confirmedAuthID.intValue()) {
			return true;
		}
		this.authIncident();
		return false;
    }
    // TO DO: Implement HIPAACompliantAdmin!
    @Override
    public ArrayList<String> reportSecurityIncidents() {
    	// TODO Auto-generated method stub
    	
    	return securityIncidents;
    }
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.employeeID, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.employeeID, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters
}
