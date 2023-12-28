import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar Programına Hoşgeldiniz...");
        String islemler = "İşlemler...\n" + "1.Yazılımcı işlemleri\n" +
                "2.Yönetici işlemleri\n" + "Çıkış için q'ya basınız.";
        System.out.println("*************************************");
        System.out.println(islemler);
        System.out.println("*************************************");
        while (true){
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan Çıkış Yapılıyor...");
                break;
            }
            else if (islem.equals("1")){
                Programmer programmer = new Programmer("Cafer","Köşker",567,"Python,Java,C,HTML,CSS");
                String programmer_islem = "Programmer İşlemleri\n" + "1.Format at\n" + "2.Bilgileri Göster\n" + "Çıkış için q'ya basınız.";
                System.out.println(programmer_islem);
                while (true){
                    System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")){
                        System.out.println("Yazılımcı İşlemlerinden çıkılıyor...");
                        break;
                    }
                    else if (y_islem.equals("1")) {
                        System.out.println("İşletim Sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        programmer.FormatAt(isletim_sistemi);
                    }
                    else if (y_islem.equals("2")) {
                        programmer.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz Yazılımcı İşlemi...");
                    }
                }
            } else if (islem.equals("2")) {
                Manager manager = new Manager("Serhat","Say",2324,10);
                String manager_islem = "Manager işlemleri\n" + "1.Zam yap\n" + "2.Bilgileri Göster\n" + "Çıkış için q'ya basınız.";
                System.out.println(manager_islem);
                while (true){
                    System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
                    String m_islem = scanner.nextLine();
                    if (m_islem.equals("q")){
                        System.out.println("Manager işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if (m_islem.equals("1")) {
                        System.out.println("Yapmak istediğiniz zam miktarı : ");
                        int zam_miktarı = scanner.nextInt();
                        scanner.nextLine();
                        manager.zamYap(zam_miktarı);
                    }
                    else if (m_islem.equals("2")) {
                        manager.bilgileriGoster();
                    }
                    else{
                        System.out.println("Geçersiz Manager işlemi...");
                    }
                }
            }
            else {
                System.out.println("Geçersiz İşlem...");
            }

        }

    }
}