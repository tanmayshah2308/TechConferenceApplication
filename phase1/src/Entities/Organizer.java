package Entities;

import java.util.ArrayList;

public class Organizer extends Attendee{

    //list of all speakers created
    private ArrayList<String> speakersCreated;

    //list of all events created by this Organzier
    private ArrayList<String> eventsCreated;

    //contact list for organizer
    private ArrayList<String> contactList;

    public Organizer(String user_id, String name, String passwords) {
        super(user_id, name, passwords);
        this.speakersCreated = new ArrayList<>();
        this.eventsCreated = new ArrayList<>();
        this.contactList = new ArrayList<>();
    }

    //adds a speaker that this organizer created
    public void addSpeakerCreated(String user_id){
        this.speakersCreated.add(user_id);
    }

    //adds an event created by this organizer. (Only adds id of event)
    public void addEventCreated(String event_id){
        this.eventsCreated.add(event_id);
    }

    //deletes an event created by this organizer from the list eventsCreated.
    public boolean deleteEventCreated(String event_id){
        return this.eventsCreated.remove(event_id);
    }

    public void addContact(String id){
        this.contactList.add(id);
    }
}
