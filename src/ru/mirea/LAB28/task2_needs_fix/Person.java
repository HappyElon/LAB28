package ru.mirea.LAB28.task2_needs_fix;

class Person {
    String lastName;
    String firstName;

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public int hashCode() {
        return lastName.hashCode() + firstName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return lastName.equals(person.lastName) && firstName.equals(person.firstName);
    }
}
