public class Classroom {
   public static void main(String[] args) {

       Wilder jC = new Wilder("Jean-Claude", true);
       Wilder henri = new Wilder("Henri", false);

       System.out.println(jC.whoAmI());
       System.out.println(henri.whoAmI());

    }
}
