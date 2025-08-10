package com.kapil.builder;

public record EmployeeRecord(String id, String firstName, String lastName, String address, String phoneNumber) {

    private EmployeeRecord(Builder builder){
        this(builder.id, builder.firstName, builder.lastName, builder.address, builder.phoneNumber);
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

        private Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public EmployeeRecord build(){
            return new EmployeeRecord(this);
        }
    }
}
