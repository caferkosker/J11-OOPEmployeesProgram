public class Programmer extends Employees {
    private String diller;
    public Programmer(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id);
        this.diller = diller ;
    }
    public void FormatAt (String isletim_sistemi){
        System.out.println(getAd() + "" + isletim_sistemi + "'ni yüklüyor...");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazılımcının bildiği diller : " + diller);
    }
}
