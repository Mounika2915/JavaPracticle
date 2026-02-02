package org.sample;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ServiceClass {
    public Map<String , Long> getCountOfMaleAndFemale(List<Employee> list){
        return list.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.counting()
                ));
    }

    public Set<String> getNamesOfAllDepartments(List<Employee> list){
        return list.stream()
                .map(Employee::getDepartment)
                .collect(Collectors.toSet());
    }

    public Map<String , Double> getAverageAgeOfMaleAndFemale(List<Employee> list){
        return list.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.averagingDouble(
                                Employee::getAge
                        )
                        )
                );
    }

    public Employee getHighestPaidEmployee(List<Employee> list){
        return list.stream()
                .max((a,b) -> Double.compare(a.getSalary(),b.getSalary()))
                .orElseThrow();
    }

    public List<String> getNamesWhoJoinedAfter2015(List<Employee> list){
        return list.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .toList();
    }

    public Map<String , Long> getCountTheEmployeesInEachDepartment(List<Employee> list){
        return list.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.counting()
                        )
                );
    }

    public Map<String , Double> getAverageSalaryInEachDepartment(List<Employee> list){
        return list.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(
                                        Employee::getSalary
                                )
                        )
                );
    }

    public Employee getDetailsOfYoungestMaleEmployee(List<Employee> list){
        return list.stream()
                .filter(e -> e.getGender().equals("Male"))
                .min((a,b) -> Integer.compare(a.getAge(),b.getAge()))
                .orElseThrow();
    }

    public String getMostExperiencedName(List<Employee> list){
        return list.stream()
                .min((a,b) -> Integer.compare(a.getYearOfJoining() , b.getYearOfJoining()))
                .orElseThrow()
                .getName();
    }

    public Map<String , Long> getCountOfMalesAndFemalesInSalesAndMarketing(List<Employee> list){
        return list.stream()
                .filter(e -> e.getDepartment().equals("Sales And Marketing"))
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.counting()
                ));
    }

    public Map<String , Double> getAverageSalaryOfMaleandFemale(List<Employee> list){
        return list.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.averagingDouble(
                                Employee::getSalary
                        )
                ));

    }

    public Map<String , List<Employee>> getNamesOfAllEmployeesInEachDepartment(List<Employee> list){
        return list.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment ,
                                Collectors.toList(
                                )
                        )
                );
    }

    public DoubleSummaryStatistics getAverageAndTotalSalary(List<Employee> list){
        return list.stream()
                .collect(Collectors.summarizingDouble(Employee :: getSalary));
    }

}
