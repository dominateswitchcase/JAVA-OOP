
class Employee {
    void start() {
        System.out.println("Employee asked for a raise");
    }
    void startWork() {
        System.out.println("Employee is now working....");
    }
    void endWork() {
        System.out.println("Employee is now clocking out.");
    }
}

class Manager extends Employee {
    @Override
    void startWork() {
        System.out.println("Manager is now working....");
    }
    
    @Override
    void endWork() {
        System.out.println("Manager is now clocking out.");
    }

    void mquest() {
        System.out.println("Do we have enough money for a raise?");
    }
    
}

class Developer extends Employee {
    void charge() {
        System.out.println("Developer says they're poor");
    }
    
    @Override
    void startWork() {
        System.out.println("Developer is now starting to work....");
    }

    @Override
    void endWork() {
        System.out.println("Developer is now clocking out.");
    }
    
 
}

public class CastingLabWork {
    public static void main(String[] args) {
        Employee emp = new Manager();
        emp.startWork();
        emp.endWork();
        
        if (emp instanceof Manager) {
            Manager m1 = (Manager) emp; // Valid downcast
            m1.mquest();  
        }

        Employee emp1 = new Employee();
       
        try {
            Manager m2 = (Manager) emp1; // Invalid cast
            m2.mquest();
        } catch (ClassCastException e) {
            System.out.println("Cannot cast an Employee to a Manager at runtime");
        }

        Employee emp3 = new Developer();
        emp3.startWork();

        if (emp3 instanceof Developer) {
            Developer dev = (Developer) emp3; 
            dev.charge();
        }
    }
}

