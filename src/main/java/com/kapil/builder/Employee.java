package com.kapil.builder;

public class Employee {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String phoneNumber;

    private Employee(Builder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;;
        this.address = builder.address;;
        this.phoneNumber = builder.phoneNumber;
    }


    public static class Builder{
        private final String id;
        private final String firstName;
        private final String lastName;
        private String address;
        private String phoneNumber;


        public Builder(String id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
