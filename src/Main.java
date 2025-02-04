import java.util.LinkedList;
import java.util.Queue;

/*
Burada alışveriş sepetinin ufak bir simülasyonunu yapmanız gerekmektedir.
 a) Item adında aşağıdaki özellikleri içeren bir class oluşturun.
 ● ürünadı
 ● tedarikçi adı
 ● satış fiyatı
 ● alış fiyatı
 b) constructor oluşturun.
 c) getter ve setterları oluşturun
 d) ürünün satış fiyatını %20 arttıran metodu yazınız.
 e) ürünün elde ettiği karı hesaplayan metodu yazınız
 */
public class Main {
    public static void main(String[] args) {
        /*
         a) 1 ile 100 arasındaki 3'e, 5'e ve her ikisine de bölünebilen sayıları yazdırın
         sorusunun cevabı:
         */

        // 1. Yöntem
        Queue<Integer> numbers35 = new LinkedList<>();
        Queue<Integer> numbers3 = new LinkedList<>();
        Queue<Integer> numbers5 = new LinkedList<>();

        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0){ //hem 3 e hem 5 e bölünenleri yzdırır
                numbers35.add(i);
            }if(i % 3 == 0 && i % 5 != 0){ //sadece 3 e bölünenleri yzdırır
                numbers3.add(i);
            }if(i % 5 == 0 && i % 3 != 0){ //sadece 5 e bölünenleri yzdırır
                numbers5.add(i);
            }
        }

        System.out.println("1 ile 100 arasıda;" +
                "\n  * 3'e bölünebilen sayılar: " + numbers3 +
                "\n  * 5'e bölünebilen sayılar: " + numbers5 +
                "\n  * hem 3, hem 5'e bölünebilen sayılar: " + numbers35);


        System.out.println("\n ikinci yöntemle yapılmış çözüm: \n\n");

        //2. Yöntem
        Queue<Integer> numbers = new LinkedList<>();

        //hem 3 hem 5 e bölünenleri yazdırır
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                numbers.add(i);
            }
        }
        System.out.println("3 ve 5'e bölünebilen sayılar: " + printNumbers(numbers) );

        //sadece 3 e bölünenleri yzdırır
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                numbers.add(i);
            }
        }
        System.out.println("3'e bölünebilen sayılar: " + printNumbers(numbers) );

        //sadece 5 e bölünenleri yzdırır
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                numbers.add(i);
            }
        }
        System.out.println("5'e bölünebilen sayılar: " + printNumbers(numbers) );
    }

    public static String printNumbers(Queue<Integer> numbers) {
        StringBuilder sb = new StringBuilder();
        while (!numbers.isEmpty()) {
            sb.append(numbers.poll() + ", ");
           }
        numbers.clear();
        return sb.toString();
    }
}