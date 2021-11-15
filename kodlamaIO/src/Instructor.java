public class Instructor extends User {
   private String Salary;
      public Instructor( String TCNo, String firstName, String lastName){
         this.TCNo = TCNo;
         this.firstName = firstName;
         this.lastName = lastName;

      }


   public String getSalary() {
      return Salary = "5000";

   }

   public void setSalary(String salary) {
      Salary = salary;
   }
}
