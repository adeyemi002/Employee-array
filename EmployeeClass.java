class Employee {
    String name;
    String department;
    String religion;
    int nin;
    String course;
}

class EmployeeClass {
    public static void main(String[] args) {
        Employee N1 = new Employee();
        Employee N2 = new Employee();
        Employee N3 = new Employee();
        Employee N4 = new Employee();
        Employee N5 = new Employee();

        N1.name = "Kosi";
        N1.department = "Marketing";
        N1.religion = "Islam";
        N1.nin = 32451678;
        N1.course = "Accounting";

        N2.name = "Lanre";
        N2.department = "Engineering";
        N2.religion = "Hindu";
        N2.nin = 32475878;
        N2.course = "Architecture";

        N3.name = "Seyi";
        N3.department = "Lab Scientist";
        N3.religion = "Traditionalist";
        N3.nin = 324383978;
        N3.course = "Biochemistry";

        N4.name = "Simisola";
        N4.department = "Law";
        N4.religion = "Traditionalist";
        N4.nin = 32414278;
        N4.course = "Law";

        N5.name = "Ade";
        N5.department = "Human Resources";
        N5.religion = "Traditionalist";
        N5.nin = 32063678;
        N5.course = "History";

      

        Employee t[] = new Employee[5];
        t[0] = N1;
        t[1] = N2;
        t[2] = N3;
        t[3] = N4;
        t[4] = N5;


        // Display the employee details
        for (Employee employee : t) {
            System.out.println("Name: " + employee.name);
            System.out.println("Department: " + employee.department);
            System.out.println("Religion: " + employee.religion);
            System.out.println("NIN: " + employee.nin);
            System.out.println("Course: " + employee.course);
            System.out.println();
        }

        // for (Employee )
    }
}
