package model.entities;

public class Student {
    private String name, registration, address, email;

    public Student(String name, String registration, String address, String email){
        this.name = name;
        this.registration = registration;
        this.address = address;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    public String getRegistration(){
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return String.format("Nome: %s\nMatrícula: %s\nEmail: %s\nEndereço: %s\n", getName(), getRegistration(), getEmail(), getAddress());
    }
}