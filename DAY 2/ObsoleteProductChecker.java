/*Mr. Ravi is a production executive who inspects certain products that are with defects with the related product ID such as 11, 22, 33, 44. The products obsolete and unfit to the use if it contains a minimum even value at the start and the end, write a program to help him to identify the obsolete product  */
public class ObsoleteProductChecker {

    public static boolean isObsolete(int productId) {
        String idStr = Integer.toString(productId);
        int firstDigit = Character.getNumericValue(idStr.charAt(0));
        int lastDigit = Character.getNumericValue(idStr.charAt(idStr.length() - 1));

        return firstDigit == 2 && lastDigit == 2;
    }

    public static void main(String[] args) {
        int[] productIds = {11, 22, 33, 44};

        System.out.println("Obsolete Product IDs:");
        for (int id : productIds) {
            if (isObsolete(id)) {
                System.out.println(id);
            }
        }
    }
}
