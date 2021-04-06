package com.adrianlearning.com.adrianlearning.Functional;

import java.util.*;
import java.util.stream.Collectors;

public class PlayingWithStreams {
    public static void main(String[] args) {
        //problemOne();
        /**
         * 1. You are going to have a list of numbers from 0 to 20
         * 2. Filter those that are mutiple of 2
         * 3. Filter those that are mutiple of 3
         * 4. The result elements calculate the cube x*x*x
         * 5. Retrieve the max result
         */
        List<Integer> Numbers = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        Comparator<Integer> comparator = (c1, c2) -> c1.compareTo(c2);

        Integer result = Numbers.stream()
                .filter(x -> x % 2 == 0)
                .filter(x -> x % 3 == 0)
                .map(x -> x * x * x)
                .max(comparator).get();
        System.out.println(result);


    }
    private static void problemOne() {
    /*
    You are to create a program that deals with students grades.
    1. Create a class Student, that has the next atributes, id, name and List<grades>
    2. Create an instance of the student
    3. Create function that say if the previous created student has at least one grade greater than 70 (0 - 100)
     */
//        playing_with_optionals();
//        finalOperation();
//        playing_with_optionals();
//        aookying_peek();
        Student student = new Student(5, "Adrian", Arrays.asList(50, 15, 25, 95, 60));
        Student student2 = new Student(5, "Daniel", Arrays.asList(10, 15, 100, 5, 60));
        Student student3 = new Student(5, "Felipe", Arrays.asList(50, 15, 26, 12, 9));
        Student student4 = new Student(5, "Camila", Arrays.asList(50, 15, 25, 10, 60));
        //AtLeastOneGradeGreaterThan70(student);
        List<Student> ListOfStudents = Arrays.asList(student, student2, student3, student4);
        ListOfStudents.stream()
                .filter(x -> AtLeastOneGradeGreaterThan70(x))
                .forEach(x -> System.out.println(x));
    }

    private static boolean AtLeastOneGradeGreaterThan70(Student student){
        List<Integer> grades = student.getGrades();
        boolean result = grades.stream()
                .anyMatch(x -> x >= 70);
        return result;
    }


    private static void finalOperation() {
        Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);
        List<Integer> listOne = Arrays.asList(1,2,3,4,5,5,5,5,5,5,5);
        List<Integer> listTwo = Arrays.asList(5,6,7,8);
        List<Integer> listThree = Arrays.asList(10,11,12);
        List<List<Integer>> allNumbers = Arrays.asList(listOne, listTwo, listThree);
        Set<Integer> result = allNumbers.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(
                result
        );
    }

    private static void playing_with_optionals() {
        Optional<Integer> anyNumber = Optional.empty();
        anyNumber.ifPresent(x -> System.out.println(x.toString()));
        if (anyNumber.isPresent()) {

        }
    }


    private static void aookying_peek() {
       List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,13,12,14,15);
       numbers.stream()
                .filter(x -> x % 2 == 0)
                .peek(x -> System.out.println(x))
                .map(x -> x * x)
                .filter(x -> x > 50)
                .peek(x -> System.out.println(x));
    }
}

class Student{
    private int Id;
    private String Name;
    private List<Integer> grades = new ArrayList();

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public Student(int id, String name, List<Integer> grades) {
        Id = id;
        Name = name;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", grades=" + grades +
                '}';
    }
}