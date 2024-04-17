public class Main {
    public class Worker {
            public String name;
            public int socialSecurityNumber;
            public float wage;
            public int workingHours;

            public void displayInfo() {
                System.out.println("Name:" + name);
                System.out.println("Social security number" + socialSecurityNumber);

            }
            void displaySalary(){
                System.out.println("Salary:" +wage*workingHours);
            }
            public static void main(String[] args) {

                Worker worker = new Worker();
                worker.name="Ebrar";
                worker.socialSecurityNumber=2110206026;
                worker.wage=1000;
                worker.workingHours=30;
                worker.displayInfo();
                worker.displaySalary();
            }
        }

    }