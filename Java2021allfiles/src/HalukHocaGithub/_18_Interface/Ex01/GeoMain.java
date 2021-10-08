package HalukHocaGithub._18_Interface.Ex01;

public class GeoMain {
    public static void main(String[] args) {

        Dikdortgen dd = new Dikdortgen();
        System.out.println("dikdörtgen alanı = " + dd.alani(4, 5));
        System.out.println("dikdörtgen cevresi = " + dd.cevresi(4, 5));

        Cember cmbr = new Cember();
        System.out.println("cember alanı = " + cmbr.alani(4));
        System.out.println("cember cevresi = " + cmbr.cevresi(5));

        Kare kare = new Kare();
        System.out.println("karenin alanı = " + kare.alani(6, 6));
        System.out.println("karenin cevresi = " + kare.cevresi(6));
    }
}
