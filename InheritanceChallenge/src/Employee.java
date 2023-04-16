public class Employee extends Worker {
    private long employeeID;
    private String hireDate;

    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {    // two fields are declare by woker class and next two fields
                                                                                            // are declare by the employee class.
        super(name, birthDate);
        this.employeeID = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
