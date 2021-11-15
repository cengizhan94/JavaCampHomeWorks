public class Main {

    public static void main(String[] args) {
        UserManager[] users = new UserManager[]{new InstructorManager(),new StudentManager()};
            for(UserManager  userManager: users  ){
               userManager.Add(new User());

            }
            Instructor instructor = new Instructor("12345678910","Engin","Demirog");
            instructor.getSalary();


            System.out.println("İnstructor Salary = "+instructor.getSalary()+" "+instructor.firstName+" "+instructor.lastName);

            Student student = new Student("Cengiz Han","Uyar","109876543210","393");
            System.out.println("Student SchoolNumber = "+student.firstName+" "+student.lastName+" "+student.getSchoolNumber());




    }
}
