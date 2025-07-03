public class RailwayBookingUsingTernary {
    public static void main(String[] args) {
        int availableSeats = 0;

        String ticketStatus = (availableSeats > 0) ? "Confirmed" : "Waiting List";

        System.out.println("Ticket Status: " + ticketStatus);
    }
}
