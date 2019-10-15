package my.examples.com.logic;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 813632 on 04.10.2019.
 */
public class Lambda {


    public void lambdaDemonstrate() {


        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 100);
        numbers.put(2, 200);
        numbers.put(3, 300);
        //вывести всю мапу
        numbers.forEach((k, v) -> System.out.println(k + " " + v));

        //Вывести всю коллекцию List
        StreamClass.intlist.forEach(s -> System.out.println(s));

        //Вывести все значения >2 из коллекции List
        StreamClass.intlist.forEach(s -> {
            if (s > 2) {
                System.out.println(s);
            }
        });

    }

    public void lambdaFuncIntDemonstrate(){
//демонстрация функционального интерфейса
        LambdaFuncInt lambdaFuncInt;
//        lambdaFuncInt=(x,y)-> x+y;
//        System.out.println(lambdaFuncInt.calculate(10,20));
        System.out.println(lambdaFuncInt=()-> 10-5);



    }


}
