package com.example.codingevents.models;

import javax.validation.constraints.*;

public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;

    @Size(max = 500, message = "Description is too long.")
    private String description;

    @NotBlank
    @Email( message = "Invalid email. Try again.")
    private String contactEmail;

    @NotBlank( message = "Location cannot be left blank")
    private String location;

    @AssertTrue( message = "Registration must be required at this time")
    private boolean registrationRequired;

    @Positive( message = "Number of attendees must be one or more.")
    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    private int numberOfAttendees;

    private EventType type;


    public Event(String name, String description, String contactEmail, EventType type, String location, int numberOfAttendees, boolean registrationRequired) {
        this();
        this.type = type;
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.numberOfAttendees = getNumberOfAttendees();
        this.registrationRequired = registrationRequired;
    }

    public Event(){
        this.id = nextId;
        nextId++;
    };


    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRegistrationRequired() {
        return registrationRequired;
    }

    public void setRegistrationRequired(boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }

    @Override
    public String toString() {
        return name;
    }
}
