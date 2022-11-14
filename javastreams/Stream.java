package javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<String> names = Arrays.asList("Reflection","Collection","Stream","Collection");

        // Intermediate Operation
        // map
        System.out.println(numbers.stream().map(x -> x*x).collect(Collectors.toList()));
        // filter
        System.out.println(names.stream().filter(s-> s.startsWith("C")).collect(Collectors.toSet()));
        System.out.println(names.parallelStream().filter(s-> !s.isBlank()).collect(Collectors.toList()));

        // sort
        System.out.println(names.stream().sorted().collect(Collectors.toList()));
        System.out.println(names.stream()
        .sorted((o1, o2)->
            o1.compareTo(o2))
        .collect(Collectors.toList()));
        

        // Terminary Operation
        // collect
        // forEach
        names.stream().forEach(x->System.out.println("for each " + x));

        System.out.println(numbers.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i));
    }
}
