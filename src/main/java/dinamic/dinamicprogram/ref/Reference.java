package dinamic.dinamicprogram.ref;

import java.util.Arrays;
import java.util.concurrent.Flow;

public class Reference {

    public static void main(String[] args) {


        String x = "lol!!!";
        int z = 55;
        LazyMethod(() -> System.out.println(x) );

//        Flow.Publisher<T> print = Reference::print;
//        Runnable task1 = Reference::print;

//        task1.run();

        int[] c = new int[] {2,55,666,765};

        Arrays.stream(c)
                .map(w -> w * 10)
                .forEach(System.out::println);
        //        print(x);
//        print(z);


    }

    private static void LazyMethod(Runnable ppp) {
        System.out.println("Lazy www");
        ppp.run();
    }

    private static void print() {
        System.out.println("Super mem");
    }

    public static void print(Object o){
        System.out.println(o);
    }

}
