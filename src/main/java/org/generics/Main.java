package org.generics;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        ElectricBike<Integer> electricBike = new ElectricBike<>();
        electricBike.setBikeEngine(5);
        System.out.println(electricBike.getBikeEngine());

        ElectricBike<String> electricBike1 = new ElectricBike<>();
        electricBike1.setBikeModel("Tesla");
        System.out.println(electricBike1.getBikeModel());




        List<Integer> ran = new ArrayList<>();
        ran.add(4);
        ran.add(5);

        List<String> ran1 = new ArrayList<>();
        ran1.add("Electric Vehicle");

        getTheList(ran);
        getTheList(ran1);

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> filteredList = myList.stream().filter(s -> s.startsWith("b"))
                .collect(Collectors.toList());
        System.out.println(filteredList);

        myList.stream().map(String::toUpperCase).forEach(System.out::println);






    }

    public static void getTheList(List<?> ranList) {

        System.out.println("The list " + ranList);
    }

}