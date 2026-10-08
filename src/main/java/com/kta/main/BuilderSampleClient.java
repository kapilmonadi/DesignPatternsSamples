package com.kta.main;

import com.kta.builder.Employee;
import com.kta.builder.EmployeeRecord;

public class BuilderSampleClient {
    public static void main(String[] args) {
        EmployeeRecord employeeRecord1 = new EmployeeRecord("A123", "Sam", "A", null, null);
        EmployeeRecord employeeRecord2 = new EmployeeRecord.Builder("A123", "Sam", "A").build();

        System.out.println(employeeRecord1);
        System.out.println(employeeRecord2);

        Employee.Builder employeeBuilder = new Employee.Builder("A123", "Sam", "A");
        Employee employee1 = employeeBuilder.address("India")
                                            .phoneNumber("12345")
                                            .build();

        System.out.println(employee1);
    }
}
