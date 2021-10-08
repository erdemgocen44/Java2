package HalukHocaGithub._18_Interface.Ex02;

public interface IElectric extends IVehicle {
    final static int batteryLife = 100;

    String changeBattery();

    /* soyut yani {} kısmı olmayan yani gövdesi olmayan
     sadece adı ve  parametretreleri olan
      metodlara ABSTRACT metod denir.
      interface lerde sadece aşağıdaki 2 şekilde gövdeli metod kullanılabilir.
      DEFAULT belirteciyle metod  İMPLEMENTE zorunlu değil.
    */
    default void print() {
        System.out.println("default tipi metod yazılabilir...");
    }

    static void autoPilot() {
        System.out.println("otonom sürüş modu...");
    }
}
