/*simple Java program that simulates an employee attendance tracking system, showing the number of weekoffs per employee in a particular month, and sorting the data using Insertion Sort based on weekoffs*/
public class AttendanceTracker {
    public static void main(String[] args) {
        // Each row: [employeeName, numberOfWeekoffs (as String)]
        String[][] employees = {
            {"Rukku", "4"},
            {"Devika", "6"},
            {"Shree", "2"},
            {"Manoj", "5"},
            {"Ayesha", "3"}
        };

        // Insertion Sort by number of weekoffs (descending)
        for (int i = 1; i < employees.length; i++) {
            String[] current = employees[i];
            int j = i - 1;

            while (j >= 0 && Integer.parseInt(employees[j][1]) < Integer.parseInt(current[1])) {
                employees[j + 1] = employees[j];
                j--;
            }
            employees[j + 1] = current;
        }

        // Output the sorted result
        System.out.println("📋 Employee Attendance (Sorted by Weekoffs - High to Low):");
        for (String[] emp : employees) {
            System.out.println(emp[0] + " - Weekoffs: " + emp[1]);
        }
    }
}
