package com.learning.spring.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer
{
    /**
     * Hibernate validator annotations with custom message
     */
    @NotNull
    @Size(min = 1, message = "First name is required")
    private String firstName;

    @Size(min = 1, message = "Last name is required")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
