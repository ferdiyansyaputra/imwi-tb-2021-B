import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parkir parkir = new Parkir();
        Scanner input = new Scanner(System.in);
        String pilihan ;
        boolean isActive = true;
        do {
            parkir.showMenu();
            pilihan = input.nextLine();

            if (pilihan.toUpperCase().equals("F")){
                parkir.informasiLahan();
            }else{
                do {
                System.out.println("Tekan tombol : ");
                parkir.showMenuLahan();
                pilihan = input.nextLine();

                    switch (pilihan.toUpperCase()){
                        case "A" -> parkir.parkirMotor();
                        case "B" -> parkir.parkirMobil();
                        case "C" -> parkir.parkirTruck();
                        default  -> System.out.println("Pilihan anda tidak sesuai, silahkan pilih lagi");
                    }
                    if (pilihan.toUpperCase().equals("A")){
                        break;
                    }else if (pilihan.toUpperCase().equals("B")){
                        break;
                    }else if (pilihan.toUpperCase().equals("C")){
                        break;
                    }

                }while(isActive == true);
            }
        }while (isActive == true);
    }
}
