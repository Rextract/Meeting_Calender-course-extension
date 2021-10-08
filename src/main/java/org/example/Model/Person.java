package org.example.Model;

import java.util.Objects;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser userCredentials;



    public Person(int id, String firstName, String lastName,
                  String email, AppUser userCredentials) {
        this.id = id;
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setUserCredentials(userCredentials);


    }

    public Person() {

    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null)
            throw new RuntimeException("Firstname is null or empty");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null)
            throw new RuntimeException("Lastname is null or empty");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null && email.isEmpty())
            throw new RuntimeException("Email is invalid");
        this.email = email;
    }

    public AppUser getUserCredentials(AppUser appUser) {
        return appUser;
    }

    public void setUserCredentials(AppUser userCredentials) {
        if (userCredentials == null && userCredentials.toString().isEmpty())
            throw new RuntimeException("UserCredentials is null");
        this.userCredentials = userCredentials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id
                && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName)
                && Objects.equals(email, person.email)
                && Objects.equals(userCredentials, person.userCredentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, userCredentials);
    }

    @Override
    public String toString() {
        return "Person{" +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", userCredentials=" + userCredentials +
                '}';
    }

}