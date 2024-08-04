package com.example.java2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Java2024Application {

	public static void main(String[] args) {
        List<Integer> exempleValue = Arrays.asList(4,10,3,15,2);
		List<Integer> exempleDoubleValue = Arrays.asList(2,4,3,10,3,15,2,7);
		SpringApplication.run(Java2024Application.class, args);
		System.out.println("hello application ");
		List<Integer> res1 = FeatureFunctions.subListMax(exempleValue);
		List<Integer> res2 = FeatureFunctions.subListMax(exempleDoubleValue);
		List<String> newList = Arrays.asList("aze","Please","locate","where","up","y", "locate" ,"occurs");
		System.out.println("good checking: "+FeatureFunctions.checkListContainsStringOrCharValues(newList,"please"));
		System.out.println("false checking: "+FeatureFunctions.checkListContainsStringOrCharValues(newList,"ZZy"));
		System.out.println("check grouping by: "+FeatureFunctions.getStringsWithLength(newList));
		System.out.println("retrieve max after grouping by: "+FeatureFunctions.getStringByMaxLength(newList));
	/*	System.out.println("with distinct values: "+ res1);
		System.out.println("without distinct values: "+ res2);
		System.out.println("flatmapping process: "+ FeatureFunctions.getUniqueTab());
		int[][] multiDInt = {{1,3},{9,0,5},{15,2,7}};
		int[] ints2 = multiDInt[2];
		System.out.println("first tab: "+ Arrays.toString(FeatureFunctions.getFitstTab()));*/
		for (int[] stri: FeatureFunctions.buildMatrice()){
			System.out.print("row: ");
			for (int i: stri){
				System.out.print(i);
			}
		}

	}

}
