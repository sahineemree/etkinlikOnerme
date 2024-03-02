import java.util.Scanner;
public class etkinikOnerme {
    public static void main(String[] args) {

        int heat ;
        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz : ");
        heat = input.nextInt();

        if (heat <= 5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }
        else if ((5 <= heat) && (heat <= 10)) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
  else if ((10<= heat) && (heat <= 15)) {
            System.out.println("Sinema veya pikniğe gidebilirsiniz.");
        }
 else if ((15 <= heat)&&(heat <= 25)){
            System.out.println("Pikniğe gidebilirsiniz.");
        }
 else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
// Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
// Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.