public class CountdownTimer {
    public static void main(String[] args) {
        int countdownTime = 5; 

        System.out.println("Timer started...");

       
        for (int i = countdownTime; i > 0; i--) {
            System.out.println("Time left: " + i + " seconds");

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted!");
            }
        }
        System.out.println(" Time's up! now!");
    }
}
