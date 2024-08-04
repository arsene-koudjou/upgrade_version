package com.example.java2024;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class FeatureFunctions {

    public static List<Integer> subListMax(List<Integer> list){
        List<Integer> res = new ArrayList<>();
        List<Integer> handleList = new ArrayList<>(distinctValues(list));
        Collections.sort(handleList, Collections.reverseOrder());
        int splitSize = handleList.size()/2;
        for (int i = 0; i < splitSize; i++) {
           res.add(handleList.get(0));
           handleList.remove(handleList.get(0));
        }
        return res;
    }

    public static List<Integer> subListWithOutCondition(List<Integer> ints){
        Collections.sort(ints,Collections.reverseOrder());
        return ints.subList(0,ints.size()/2);
    }

    public static List<Integer> distinctValues(List<Integer> doubleValues){
        return doubleValues.stream().distinct().collect(Collectors.toList());
    }

    public static List<Integer> getUniqueTab(){

        int[][] multiInt = {{1,3},{9,0,5}};
         return Arrays.stream(multiInt).flatMapToInt(i-> Arrays.stream(i)).boxed().collect(Collectors.toList());
    }

    public static int[] getFitstTab(){
        int[][] multiDInt = {{1,3},{9,0,5},{15,2,7}};
        return Arrays.stream(multiDInt).flatMapToInt(s-> Arrays.stream(s)).toArray();
    }

    public static boolean checkListContainsStringOrCharValues(List<String> stringList,String chain){
        AtomicBoolean result = new AtomicBoolean(false);
         List<String> charsString = chain.chars().mapToObj(
                 m->String.valueOf(m)
         ).collect(Collectors.toList());
         if (!stringList.stream().anyMatch(s->s.equalsIgnoreCase(chain))){
             stringList.forEach(str ->{
                 charsString.forEach(ch -> {if(str.contains(ch)) {
                             result.set(true);
                         }
                         }
                 );
             });
         } else {
             result.set(true);
         }
        return result.get() ;
    }

    public boolean checkStringContainsChar(String variable,CharSequence cha){
        return variable.contains(cha);
    }

    public static Map<Integer, List<String>> getStringsWithLength(List<String> allStrings){
        Map<Integer, List<String>> mapResult = allStrings.stream().collect(groupingBy(String::length));
        return mapResult;
    }

    public static Map<Integer, List<String>> getStringByMaxLength(List<String> strs){
        return strs.stream().collect(groupingBy(String::length,
              ()-> new TreeMap<>(Comparator.reverseOrder()),
                Collectors.toList()
        ));
    }

    public static List<String> subListWithCondition(List<String> strings){
        Predicate<String> condition = s -> s.length()>6;
       Map<Boolean, List<String>> partitioned = strings.stream().collect(
                Collectors.partitioningBy(condition)
        );

        return partitioned.get(true);
    }





    public static int[][] buildMatrice(){
        int[][] newMatrice = new int[2][3];

        newMatrice = new int[][]{{2, 4, 6}, {5, 7, 9,22}};


        return newMatrice;
    }
}
