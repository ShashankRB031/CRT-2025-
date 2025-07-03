public class SwitchCase {
    public static void main(String[] args) {
        int check = 2;

        switch (check) {
            case 1:
                System.out.println("Stayne");
                break;
            case 2:
                System.out.println("Morgan");
                break;
            default:
                System.out.println("Good");
        }
    }
}

/* default can be placed anywhere, You can place it earlier only if you have a specific logic requirement,
 but you must use break to avoid fall-through.*/


