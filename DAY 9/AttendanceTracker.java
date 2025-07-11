/*Develop an attendance tracking system for employees, where each employee's name and the number of weekoffs in a given month are recorded. Use the Insertion Sort algorithm to sort the employees based on the number of weekoffs in descending order, highlighting the employee with the most and least weekoffs.
 */
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
