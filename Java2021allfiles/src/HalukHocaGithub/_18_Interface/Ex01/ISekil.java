package HalukHocaGithub._18_Interface.Ex01;

public interface ISekil {
    // int ... kullanıldığında gelen bütün sayılar
    // dizinin bir elemanı gibi işlem görür ve dizi değişkenine
    // atanır
    final double PI = 3.14;

    int cevresi(int... dizi);

    int alani(int... dizi);
}
