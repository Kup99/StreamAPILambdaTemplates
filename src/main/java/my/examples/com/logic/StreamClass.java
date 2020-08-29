package my.examples.com.logic;

import com.sun.xml.internal.ws.util.StringUtils;
import my.examples.com.model.User;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


//Остальное можно найти здесь:
//https://vertex-academy.com/tutorials/ru/java-8-uchebnik/
//https://metanit.com/java/tutorial/9.1.php


public class StreamClass {
    public static List<String> list = Arrays.asList("mr.White", "mr.Pink", "mr.Black");
    public static List<Integer> intlist = Arrays.asList(1, 5, 8, 9);


    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        StreamClass streamClass = new StreamClass();
        // streamClass.demonstrateStreamPossibles();
        //streamClass.forEachDemonstrate();
        // streamClass.objectToString();
        // streamClass.streamToOtherCollection();
        //lambda.lambdaDemonstrate();
        lambda.lambdaFuncIntDemonstrate();

    }

    public void getListUsingStream() {


    }

    public void demonstrateStreamPossibles() {
//найти любое значение
        Optional<String> optional = list.stream().findAny();
        System.out.println(optional);

//если лист начинается с mr.P вывести
        list.stream()
                .filter((s -> s.startsWith("mr.P"))).
                map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
//сделать первую букву заглавной
        list.stream().map(StringUtils::capitalize).forEach(System.out::println);


    }

    public void forEachDemonstrate() {

        //вывести все *2
        intlist.stream().map(s -> s * 2).forEach(System.out::println);

        //вывести все
        intlist.stream().forEach(System.out::println);

        //получить значения >=5 и не null
        intlist.stream().filter(s -> s >= 5).filter(s -> s != null).forEach(System.out::println);
    }


    public void objectToString() {

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Kup"));
        users.add(new User(2, "guk"));
        users.add(new User(3, "fas"));
        users.add(new User(4, "down"));


        //вывести getName у User
        users.stream().map(User::getName).forEach(System.out::println);


    }

    public void streamToOtherCollection() {

        //положить в лист
        List<String> newList = list.stream().filter(s -> s.startsWith("mr.W")).collect(Collectors.toList());
        System.out.println(newList);
        //Лист в Сет
        Set<String> newSet = list.stream().collect(Collectors.toSet());
        newSet.stream().forEach(System.out::println);

    }

    public void reduceExample() throws IOException {
        Parser parser = new Parser();
        System.out.println(parser.thingParse()
                .stream()
                .map(Thing::getValue)
                .reduce((x, y) -> String.valueOf((Integer.parseInt(x) + Integer.parseInt(y))))
                .get());


    }


}
