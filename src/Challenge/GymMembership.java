package Challenge;
//30. Write a Java program to create a class called "GymMembership" with attributes
//for member name, membership type, and duration. Create a subclass "PremiumMembership"
//that adds attributes for personal trainer availability and spa access.
//Implement methods to calculate membership fees and check for special offers
//based on membership type.
public class GymMembership {
    String memberName, membershipType, duration;

    class PremiumMembership {
        boolean personalTrainerAvailability;
        String spaAccess;
    }

    public void calculateMembershipFees() {}

    public void checkSpecialOffers() {}
}
