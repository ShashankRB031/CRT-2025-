/*4] Mr.Kashyap is working as software enggineer finalising sprints(short meetings) 
for banking project, the patchup work of the software has a timing deadline 
of 5 second s an allaram is setup using a counter to display 
the reverse counting of the timer generate a code to help Mr.Kashyap */


public class CountdownTimer {
    public static void main(String[] args) {
        int countdownTime = 5; 

        System.out.println("Timer started...");

       
        for (int i = countdownTime; i > 0; i--) {
            System.out.println("Time left: " + i + " seconds");

            try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted!");
            }
        }
        System.out.println(" Time's up! now!");
    }
}
