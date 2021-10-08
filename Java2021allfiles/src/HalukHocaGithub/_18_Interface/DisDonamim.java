package HalukHocaGithub._18_Interface;

public interface DisDonamim {
    public void ayna();

    public void kapi();

    public void kaporta();

    String RENK = "metalik";

    public default String sisLamp() {//bu method bildigin body'li concrete'dir
        return "sisli hava dikkat";

    }

    public static String boya() {//bu method bildigin body'li concrete'dir
        return "koyu renk boya gunes yanigi yapar";

    }
}
