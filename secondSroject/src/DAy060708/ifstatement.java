package DAy060708;

public class ifstatement {
    public static void main(String[] args) {
        int yas=45;

        ////yetislikn olup olmadiginin tespiti
        if (yas>=18) {
            System.out.println("kisi yetiskindir");
        } else {
            System.out.println("kisi yetiskin degildir");
        }

        //yasi 70 den buyuk 18 den kucuk olma durumu

        if (yas<18|yas>70){
            System.out.println("sosyal yardim alabilir");
        }else {
            System.out.println("Sosyal yardim alamaz");
        }
     ///// time-memory complexitz

        int x=65;
        int y=0b01000001; //01000001
        int z=0x41;

        System.out.println(x);

        System.out.println(y);

        System.out.println(z);

    }
}
