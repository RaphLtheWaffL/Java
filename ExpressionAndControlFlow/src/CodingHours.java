public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int howManyHours = (int) 17*(7-2)*6;
        System.out.println(howManyHours);
        float precentageCodingHours = (howManyHours/((float) 17 * 52))*100;
        System.out.println(precentageCodingHours);
    }
}
