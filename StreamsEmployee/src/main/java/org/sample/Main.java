package org.sample;

import java.util.*;

public class Main {
    static void main() {

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        ServiceClass sc = new ServiceClass();

        //1.How many Male and Female employees are there in the organization.
        Map<String , Long> countMaleAndFemale = sc.getCountOfMaleAndFemale(employeeList);
        System.out.println(countMaleAndFemale);

        //2.Print the name of all departments in the organization.
        Set<String> allDepartments = sc.getNamesOfAllDepartments(employeeList);
        System.out.println(allDepartments);

        //3.What is average age of Male and Female in the Organization.
        Map<String , Double> averageAgeOfMaleandFemale = sc.getAverageAgeOfMaleAndFemale(employeeList);
        System.out.println(averageAgeOfMaleandFemale);

        //4.Get the details of highest Paid Employee
        Employee highestEmployeeDetails = sc.getHighestPaidEmployee(employeeList);
        System.out.println(highestEmployeeDetails.toString());

        //5.Get the names of all Employees who joined after 2015.
        List<String> namesOfEmployeesWhoJoinedAfter2015 = sc.getNamesWhoJoinedAfter2015(employeeList);
        System.out.println(namesOfEmployeesWhoJoinedAfter2015);

        //6.Count the number of employees in each department.
        Map<String,Long> countTheNumberOfEmployeesInEachDepartment = sc.getCountTheEmployeesInEachDepartment(employeeList);
        System.out.println(countTheNumberOfEmployeesInEachDepartment) ;

        //7.What is the average salary of each department.
        Map<String,Double> averageSalaryInEachDepartment = sc.getAverageSalaryInEachDepartment(employeeList);
        System.out.println(averageSalaryInEachDepartment);

        //8.Get the details of youngest male employee in the product development department.
        Employee youngestMaleEmployee = sc.getDetailsOfYoungestMaleEmployee(employeeList);
        System.out.println(youngestMaleEmployee.toString());

        //9.who has most working experience in the organization
        String mostWorkingExperience = sc.getMostExperiencedName(employeeList);
        System.out.println(mostWorkingExperience);

        //10.How many males and females are working in sales and marketing department.
        Map<String,Long> countMaleAndFemalesWorkingInSalesAndDepartment = sc.getCountOfMalesAndFemalesInSalesAndMarketing(employeeList);
        System.out.println(countMaleAndFemalesWorkingInSalesAndDepartment);

        //11.What is the Average Salary of Male and Female.
        Map<String , Double> averageSalaryOfMaleAndFemale = sc.getAverageAgeOfMaleAndFemale(employeeList);
        System.out.println(averageSalaryOfMaleAndFemale);

        //12.List down the names of all employees in each department.
        Map<String , List<Employee>> namesOfAllEmployeesInEachDepartment = sc.getNamesOfAllEmployeesInEachDepartment(employeeList);
        for(String dep : namesOfAllEmployeesInEachDepartment.keySet()){
            System.out.println(dep + " " + (namesOfAllEmployeesInEachDepartment.get(dep)));
        }

        //13.what is the average salary and total salary of the organization.
        DoubleSummaryStatistics averageTotalSalary = sc.getAverageAndTotalSalary(employeeList);
        System.out.println("Average Salary : " +averageTotalSalary.getAverage());
        System.out.println("Total Salary : " +averageTotalSalary.getSum());
    }
}
