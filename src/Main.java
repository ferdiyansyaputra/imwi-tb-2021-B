import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parkir parkir = new Parkir();
        String pilihan, pilihLahan;
        boolean isActive = true;
        do {
            Scanner input = new Scanner(System.in);
            parkir.showMenu();
            pilihan = input.nextLine();

            if (pilihan.equals("F")){
                parkir.informasiLahan();
            }else{
                do {
                System.out.println("Tekan tombol : ");
                parkir.showMenuLahan();
                pilihLahan = input.nextLine();


                    switch (pilihLahan){
                        case "A":
                            parkir.parkirMotor();
                            break;
                        case "B":
                            parkir.parkirMobil();
                            break;
                        case "C":
                            parkir.parkirTruck();
                            break;
                        default:
                            System.out.println("Tidak dapat dimengerti semoga harimu suram");
                            break;
                    }
                }while (!pilihLahan.equals("A") && !pilihLahan.equals("B") && pilihLahan.equals("C") );
            }
        }while (isActive == true);
    }
}
