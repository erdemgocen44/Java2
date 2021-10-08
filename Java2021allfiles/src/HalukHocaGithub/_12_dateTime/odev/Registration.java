package _12_dateTime.odev;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Registration {
    List<User>users=new ArrayList<>();
    /*
     * TODO Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak
     * ekleyen ve sonrasında her dakikanın ilk 10 saniyesinde kaydolmuş olanları
     * şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.Bunun için;
     * 1- Bir
     * user class oluşturun fields: name , registerDate (LocalDateTime cinsinden)
     * 2-
     * Registration isminde bir class oluşturun ve register isminde bir metod
     * ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin ve bu list i
     * return edin. 3- Registration classı na aynı zamanda kendine verilen
     * ArrayListteki userlardan her dakikanın ilk 10 saniyesinde kaydolmuşları
     * yazdıran printHappyUsers isminde bir metod daha ekleyiniz. İpucu Çalışacak
     * main metodu aşağıdaki gibi olmalıdır. public static void main(String[] args)
     * { Registration userReg = new Registration(); ArrayList<User> register =
     * userReg.register(); userReg.printHappyUsers(register);
     *
     */
    public Registration() {
        // TODO Auto-generated constructor stub
    }

    public List<User> register(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz");
        String isim=scan.nextLine();
        User user=new User(isim, LocalDateTime.now());
        users.add(user);
        return users;
    }

    public void listele(List<User>users) {
        for (User each : users) {
            System.out.println("Adi: "+each.name+" kayit zamani "+each.registerDate);
        }
    }
    public void printHappyUsers(List<User> users) {
        for (User each : users) {
            if (each.registerDate.getSecond()<10) {
                System.out.println("Şanslı kişisiniz "+each.name+" 5 kilo bal kazandiniz");
            }
        }

    }

}
