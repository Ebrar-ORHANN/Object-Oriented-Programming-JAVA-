public class Worker2 {
    public String name;
    public int socialSecurityNumber;
    public float wage;
    public int workingHours;


    public void displayInfo() {
        System.out.println("Name:" + name);
        System.out.println("Social security number" + socialSecurityNumber);

    }

    void displaySalary() {
        System.out.println("Salary:" + wage * workingHours);
    }
}