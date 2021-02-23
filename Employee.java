
package senario1;

public class Employee {
         
    int employeeid;
    int working_hour;
    String shift;
    //constractor
    Employee(int e,int w,String s){
      employeeid=e;
      working_hour=w;
      shift=s;
    }
    void check_document_status(Document dc){
        if(dc.status == "Good"){
            System.out.println("We can deal");
        if(dc.status == "Done"){
           System.out.println("Proceed"); 
        }
    }
    
    
}
}

