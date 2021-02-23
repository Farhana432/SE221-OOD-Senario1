
package senario1;


public class Admin {
    
   void check_working_hour(Employee e){
        if(e.working_hour > 8){
            System.out.println("new work assignment");
        }
            else{
            System.out.println("do previous work");        
                    } 
   }
}
