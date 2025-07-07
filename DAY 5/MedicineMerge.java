public class MedicineMerge {
    public static void main(String[] args) {
        double[] type1 = {0.23, 0.44, 0.74, 0.84, 0.37};
        double[] type2 = {4.67, 4.83, 3.14, 2.24, 5.31};

        // Ensure both arrays are of same length
        int n = type1.length;
        double[] type3 = new double[n];

        // Sum corresponding elements and display result
        System.out.println("Type 3 Medicine Array (Element-wise Sum):");
        for (int i = 0; i < n; i++) {
            type3[i] = type1[i] + type2[i];
            System.out.printf("%.2f  ", type3[i]);  // Print with 2 decimal places
        }
    }
}



