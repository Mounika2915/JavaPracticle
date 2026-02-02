package org.sample;


import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<Integer> list = List.of(1, 2, 3, 4,4,4, 5, 6, 7, 8, 9);
        List<String> stringList = List.of("java", "are", "my", "programming", "language");

        //Write a program to find the sum of all elements in a list using Java Stream API
        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of a list : " + sum);

        //Given a list of integers, write a program to find and print the maximum element using Java Stream API
        int maxNumber = list.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();
        System.out.println("Maximum Number : " + maxNumber);

        //Write a program to filter out all the even numbers from a list using Java Stream API
        List<Integer> evenNumbers = list.stream()
                .filter((n -> n % 2 == 0))
                .toList();
        System.out.println("Even Numbers : " + evenNumbers);

        //Given a list of strings, write a program to count the number of strings containing a specific character ‘a’ using Java Stream API.
        Long countContainsA = stringList.stream()
                .filter(s -> s.contains("a"))
                .count();
        System.out.println("Count of strings contains A : " + countContainsA);

        //Write a program to convert a list of strings to uppercase using Java Stream API.
        List<String> convertUppercase = stringList.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("convert To UpperCase : " + convertUppercase);

        //write a program to calculate the average of all the numbers using Java Stream API.
        OptionalDouble avg = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("Avg of a list : " + (avg.isPresent()?avg.getAsDouble():"N/A"));

        // Write a program to sort a list of strings in alphabetical order using Java Stream API.
        List<String> sortingList = stringList.stream()
                .sorted()
                .toList();
        System.out.println("sorting the list : " + sortingList);

        //Given a list of strings, write a program to concatenate all the strings using Java Stream API.
        String str = stringList.stream()
                .collect(Collectors.joining(" "));
        System.out.println("List as a String : " + str);

        //Write a program to find the longest string in a list of strings using Java Stream API.
        String longestString = stringList.stream()
                .max((String s1 , String s2) -> Integer.compare(s1.length() , s2.length()))
                .orElseThrow();
        System.out.println("max length string : " + longestString);

        //Given a list of integers, write a program to find and print the second largest number using Java Stream API.
        Optional<Integer> secondLargest = list.stream()
                .sorted((a,b)-> Integer.compare(b,a))
                .skip( 1)
                .findFirst();
        System.out.println("SecondLargest : "  + secondLargest.orElse(0));

        //Write a program to remove all the duplicate elements from a list using Java Stream API.
        List<Integer> distinctElements = list.stream()
                .distinct()
                .toList();
        System.out.println("Distinct Elements : " + distinctElements);

        //Given a list of strings, write a program to find and print the shortest string using Java Stream API.
        String shortestString = stringList.stream()
                .min((a,b) -> Integer.compare(a.length() ,b.length()))
                .orElseThrow();
        System.out.println("Shortest String : " + shortestString);

        //Write a program to convert a list of integers to a list of their squares using Java Stream API.
        List<Integer> squareList = list.stream()
                .map(n -> n*n)
                .toList();
        System.out.println("square List :" + squareList);

        //Given a list of strings, write a program to find and print the strings starting with a specific prefix ‘a’ using Java Stream API.
        stringList.stream()
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);


        //Write a program to find the product of all elements in a list of integers using Java Stream API.
        Integer product = list.stream().reduce(1 , (val1,val2)->val1*val2);
        System.out.println("Product of list : "+product);

        // Given a list of integers, write a program to find and print the prime numbers using Java Stream API.
        List<Integer> primeNumbersList = list.stream()
                .filter(Main :: isPrime)
                .toList();
        System.out.println("primeNumbers : " + primeNumbersList);

        //Write a program to check if a list of strings contains a specific string using Java Stream API.
        String target = "java" ;
        boolean isPresent = stringList.stream()
                .anyMatch(s -> s.equals(target));
        System.out.println("String present  : "+ isPresent);

        //Given a list of strings, write a program to find and print the strings with length greater than a specified value 5 using Java Stream API.
        int minLength = 5 ;
        List<String> stringsGreaterThanSpecifiedLength = stringList.stream()
                .filter(s -> s.length() > minLength)
                .toList();
        System.out.println("Strings greater than specified length : " + stringsGreaterThanSpecifiedLength);
    }
    private static boolean isPrime(int n){
        boolean isFlag = true ;
        for(int i = 2 ; i <= Math.sqrt(n) ;i++){
            if(n % i == 0){
                isFlag = false ;
            }
        }
        return isFlag ;
    }
}
