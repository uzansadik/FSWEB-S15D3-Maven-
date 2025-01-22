package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Dogancan", "Kinik"));
        employees.add(new Employee(1, "Dogancan", "Kinik"));
        employees.add(new Employee(2, "Seyyit Battal", "Arvas"));
        employees.add(new Employee(2, "Seyyit Battal", "Arvas"));
        employees.add(new Employee(3, "Anil", "Ensari"));
        employees.add(new Employee(3, "Anil", "Ensari"));
        employees.add(new Employee(4, "Burak", "Cevizli"));

      List<Employee> duplicates = findDuplicates(employees);
        System.out.println("Tekrar eden çalışanlar: " + duplicates);

    }

    public static List<Employee> findDuplicates(List<Employee> employees) {
        Set<Employee> duplicates = new LinkedHashSet<>();
        Set<Employee> uniques = new LinkedHashSet<>();
        for (Employee employee : employees) {
            if (!uniques.add(employee)) {
                duplicates.add(employee);
            }
            uniques.add(employee);
        }
        return new LinkedList<>(duplicates);
    }


    public static Map<Integer, Employee> findUniques(List<Employee> employees) {
        Map<Integer, Employee> uniques = new LinkedHashMap<>();
        for (Employee employee : employees) {
            if(employee != null) {
                uniques.put(employee.getId(), employee);
            }
        }
        return uniques;
    }

    public static List<Employee> removeDuplicates(List<Employee> employees) {
        Set<Employee> duplicates = new LinkedHashSet<>();
        Set<Employee> uniques = new LinkedHashSet<>();
        for (Employee employee : employees) {
            if (!uniques.add(employee)) {
                duplicates.add(employee);
            }
        }

        List<Employee> newEmployees = new LinkedList<>();
        for (Employee employee : employees) {
            if(!duplicates.contains(employee) && employee != null) {
                newEmployees.add(employee);
            }
        }
        return newEmployees;
    }
}