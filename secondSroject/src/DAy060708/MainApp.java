package DAy060708;

public class MainApp {
    public static void main(String[] args) {
  int x=-5;
  //Logic operators
          // short cut && and ||


          // ve so and
        boolean b1=false&false; //falsa
        boolean b2=false&true;
        boolean b3=true&false;
        boolean b4=true&true;    /// true
//
          //veya or
        boolean b5=false|false; //falsa
        boolean b6=false|true;
        boolean b7=true|false;
        boolean b8=true|true;/// true

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        // degili  ! negation

          boolean b9=!(false|true);
          boolean b10=!(true&false);
          System.out.println(b9);
          System.out.println(b10);
         //

        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);






    }
}
