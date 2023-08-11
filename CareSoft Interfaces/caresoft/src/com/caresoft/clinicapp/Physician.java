package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	private int pin;
	
	// TO DO: Constructor that takes an IDcopy
	public Physician(int idCopy) {
		this.id = idCopy;
	}
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
	@Override
	public boolean assignPin(int pin) {
		String pinStr = Integer.toString(pin);
		if (pinStr.length() != 4) {
			return false;
		}
		this.pin = pin;
		return true;
	}
	
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		return this.getId().equals(confirmedAuthID);
	}
}
