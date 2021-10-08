package HalukHocaGithub._17_Abstract.DataBaseOrnek;

public class samsungDatabase extends abstractDatabase {


    @Override
    void get() {
        System.out.println("Samsung çalışan bilgisi elde etme...");
    }

    @Override
    void update() {
        System.out.println("Samsung çalışan bilgisi güncelleme...");
    }
}
