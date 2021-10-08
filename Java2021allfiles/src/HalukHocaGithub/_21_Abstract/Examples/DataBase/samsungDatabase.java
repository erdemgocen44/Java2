package _21_Abstract.Examples.DataBase;

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
