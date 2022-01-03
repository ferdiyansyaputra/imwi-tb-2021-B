public class Parkir {
    int lahanMotor = 10, lahanMobil = 5, lahanTruck = 2;

    public Parkir(){
        System.out.println("Selamat datang di aplikasi parkir Ferdiyan Syaputra");
    }
    public void showMenu(){
            System.out.println("");
            System.out.println("Silahkan inputkan nomor kendaraan ");
            System.out.println("atau tekan tombol F untuk informasi kendaraan di lahan parkir");
    }
    public void informasiLahan(){
        System.out.println("Lahan parkir yang tersedia " + lahanMotor);
        System.out.println("Lahan parkir yang tersedia " + lahanMobil);
        System.out.println("Lahan parkir yang tersedia " + lahanTruck);
    }
    public int parkirMotor(){
        if (lahanMotor > 0){
            lahanMotor--;
            messageSuccess();
        }else{
            messageFull();
        }
        return lahanMotor;
    }
    public int parkirMobil(){
        if (lahanMobil > 0){
            lahanMobil--;
            messageSuccess();
        }else{
            messageFull();
        }
        return lahanMobil;
    }
    public int parkirTruck(){
        if (lahanTruck > 0){
            lahanTruck--;
            messageSuccess();
        }else{
            messageFull();
        }
        return lahanTruck;
    }
    public void showMenuLahan(){
        System.out.println("A. Motor");
        System.out.println("B. Mobil");
        System.out.println("C. Truk");
    }
    public void messageSuccess(){
        System.out.println("Kendaraan berhasil diinput ");
    }
    public void messageFull(){
        System.out.println("Parkir penuh, tidak bisa menampung kendaraan tersebut");
    }

}
