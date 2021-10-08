package _21_Abstract.Examples.CarpmaIslemi;

public abstract class Urun {
    int carpma;

    public Urun(int carpma) {
        this.carpma = carpma;
    }

    public int carp(int deger) {
        return carpma * deger;
    }
}
