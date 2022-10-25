package DAy060708;

public class switchCase {
    public static void main(String[] args) {
         ///Switch case
        int daynumber=3;
  /*      switch (daynumber){
            case 1:
                System.out.println("pazrtesi");break;
            case 2:
                System.out.println("salo");break;
            case 3:
                System.out.println("Carsamba");break;
            case 4:
                System.out.println("persembe");break;
            case 5:
                System.out.println("cuma");break;
            case 6:
                System.out.println("Cuartesi");break;
            case 7:
                System.out.println("Pazar");break;
            default:
                System.out.println("Yanlis girildi");break;*/

       /* switch (daynumber){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");break;
            case 6:
            case 7:
                System.out.println("weekend");break;
            default:
                System.out.println("Yanlis girildi");break;
        }
        */
        int k1=6;
        int k2=10;

        switch (k1+k2) {
            case 15:
                System.out.println("kargo icin ugundur");
                break;
            case 20:
                System.out.println("kargo icin uxgun degildir");
                break;
            default:
            System.out.println("Girilen verilerle hesap yapilamaz");


        }



    }
}
