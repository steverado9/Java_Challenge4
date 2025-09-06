package Challenge;
//26. Write a Java program to create a class called "Event" with attributes for
//event name, date, and location. Create subclasses "Seminar" and "MusicalPerformance"
//that add specific attributes like number of speakers for seminars and performer list
//for concerts. Implement methods to display event details and check for
//conflicts in the event schedule.
public class Event {
    String name, date, location;

    class Seminar {
        int numberOfSpeakers;
    }

    class MusicalPerformance {
        String performerList;
    }

    public void displayEventDetails() {}

    public void conflictsInEventSchedule() {}

}
