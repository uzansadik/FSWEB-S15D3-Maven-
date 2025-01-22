package org.example.entity;

import java.util.Objects;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Employee(int id, String firstName, String lastName) {
        setId(id);
        setFirstname(firstName);
        setLastname(lastName);

    }

    @Override
    public String toString() {
        return  "Employee [id=" + id + ", firstname=" + firstname + ", lastname=";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && Objects.equals(firstname, employee.firstname) && Objects.equals(lastname, employee.lastname);
    }
}
