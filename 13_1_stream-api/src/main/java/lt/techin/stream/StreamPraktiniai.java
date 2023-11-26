package lt.techin.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamPraktiniai {

    public static List<Integer> returnSquareRoot(List<Integer> numbers) {

        return numbers.stream().map(n -> (int) Math.sqrt(n)).collect(Collectors.toList());
    }

    public static List<Integer> getAgeFromUsers(List<User> users) {

        return users.stream().map(u -> u.getAge()).collect(Collectors.toList());
    }

    public static List<Integer> getDistinctAges(List<User> users) {

        return users.stream().map(u -> u.getAge()).distinct().collect(Collectors.toList());
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {

        return users.stream().limit(limit).collect(Collectors.toList());
    }

    public static Integer countUsersOlderThen25(List<User> users) {

        return (int) users.stream().filter(u -> u.getAge() > 25).count();
    }

    public static List<String> mapToUpperCase(List<String> strings) {

        return strings.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> integers) {

        return integers.stream().reduce(0, (sum, i) -> sum + i);
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {

        return integers.stream().skip(toSkip).collect(Collectors.toList());
    }

    public static List<String> getFirstNames(List<String> names) {

        List<String> firstNames = names
                .stream()
                .map(name -> name.split(" ")[0])
                .toList();

        return firstNames;
    }

    public static List<String> getDistinctLetters(List<String> names) {

        List<String> separateDistinctLetters = names
                .stream()
                .map(name -> name.split(""))
                .flatMap(arr -> Arrays.stream(arr))
                .distinct()
                .toList();

        return separateDistinctLetters;
    }


    public static String separateNamesByComma(List<User> users) {

        return users.stream().map(User::getName).collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {

        return users.stream().mapToDouble(User::getAge).average().orElse(0);
    }

    public static Integer getMaxAge(List<User> users) {

        return users.stream().mapToInt(User::getAge).max().orElse(0);
    }

    public static Integer getMinAge(List<User> users) {

        return users.stream().mapToInt(User::getAge).min().orElse(0);
    }

    public static boolean anyMatch(List<User> users, int age) {

        boolean anyMach = users
                .stream()
                .anyMatch(user -> user.getAge() == age);

        return anyMach;
    }

    public static boolean noneMatch(List<User> users, int age) {

        boolean noneMatch = users
                .stream()
                .noneMatch(user -> user.getAge() == age);

        return noneMatch;
    }

    public static Optional<User> findAny(List<User> users, String name) {

        Optional<User> optionalUser = users
                .stream()
                .filter(user -> user.getName().equals(name))
                .findAny();

        return optionalUser;
    }

    public static List<User> sortByAge(List<User> users) {

        List<User> sortedList = users
                .stream()
                .sorted(Comparator.comparing(user -> user.getAge()))
                .toList();

        return sortedList;
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {

        Stream<Integer> boxedIntegers = stream
                .boxed();

        return boxedIntegers;
    }

    public static List<Integer> generateFirst10PrimeNumbers() {

        List<Integer> firstTenPrimeNumbers = Stream
                .iterate(2, n -> n + 1)
                .filter(n -> isPrime(n))
                .limit(10)
                .collect(Collectors.toList());

//        List<Integer> firstTenPrimeNumbers = IntStream
//                .range(2, 100)
//                .filter(n -> isPrime(n))
//                .limit(10)
//                .boxed()
//                .toList();

        return firstTenPrimeNumbers;
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {

        List<Integer> tenRandomNumbers = new Random()
                .ints(10, 1, 100)
                .boxed()
                .collect(Collectors.toList());

//        List<Integer> tenRandomNumbers = Stream
//                .generate(() -> new Random().nextInt())
//                .limit(10)
//                .collect(Collectors.toList());

        return tenRandomNumbers;
    }

    public static User findOldest(List<User> users) {

        return users.stream().max(Comparator.comparingInt(User::getAge)).get();
    }

    public static int sumAge(List<User> users) {

        return users.stream().mapToInt(User::getAge).sum();
    }

    //Pvz.:
    //Java 8 Streams API: Grouping and Partitioning a Stream
    //https://www.javacodegeeks.com/2015/11/java-8-streams-api-grouping-partitioning-stream.html

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {

        Map<Boolean, List<User>> groupByGender = users.stream()
                .collect(groupingBy(user -> user.isMale()));

        return groupByGender;
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {

        Map<Integer, List<User>> groupByAge = users.stream()
                .collect(groupingBy(user -> user.getAge()));

        return groupByAge;
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {

        Map<Boolean, Map<Integer, List<User>>> groupByAge = users.stream()
                .collect(groupingBy(user -> user.isMale(),
                        groupingBy(user -> user.getAge())));

        return groupByAge;
    }

    public static Map<Boolean, Long> countGender(List<User> users) {

        Map<Boolean, Long> countGender = users.stream()
                .collect(groupingBy(user -> user.isMale(), counting()));

        return countGender;
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {

        IntSummaryStatistics statistics = users.stream()
                .collect(Collectors.summarizingInt(user -> user.getAge()));

        return statistics;
    }
}
