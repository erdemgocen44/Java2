package HalukHocaGithub._17_Abstract.DataBaseOrnek;

public class huaweiDatabase extends abstractDatabase {

    @Override
    void get() {
        System.out.println("Huawei çalışanı bilgisi elde etme...");
    }

    @Override
    void update() {
        System.out.println("Huawei çalışanı bilgisi güncelleme...");
    }
}
