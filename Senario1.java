
package senario1;

public class Senario1 {

    public static void main(String[] args) {
        
        Employee Urmi = new Employee(123,9,"day");
        
        
        Admin MrAbdul = new Admin();
        
        Document dc1 = new Document("Good");
        Document dc2 = new Document("Done");
        //Urmi
        System.out.println("Employee id: " +Urmi.employeeid);
        System.out.println("Working hour: " +Urmi.working_hour);
        System.out.println("Shift: " +Urmi.shift);
        
        //Admin check employee's working hour
        System.out.print("Admin check employee working hour: ");
        MrAbdul.check_working_hour(Urmi);
        System.out.println();
        //Employee check document status
        System.out.print("Employee check document status: ");
        Urmi.check_document_status(dc1);
        
        System.exit(0);
        
    }
    
}
