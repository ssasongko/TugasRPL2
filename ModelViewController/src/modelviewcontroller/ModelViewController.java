package modelviewcontroller;

public class ModelViewController {

    public static void main(String[] args) {
        // TODO code application logic here
        Student model = retrieveStudentFromDatabase();
        
        StudentView view = new StudentView();
        
        StudentController controller = new StudentController(model, view);
        
        controller.updateView();
       
        controller.setStudentName("Suyatna");
        controller.updateView();
    }
    
    private static Student retrieveStudentFromDatabase(){
        return new Student("1","Daniyal");
    }
}
