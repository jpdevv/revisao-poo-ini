package model.entities;

public class Student {
    private String registration, email, name, address;

    public Student(String registration, String name, String email, String address){
        this.registration = registration;
        this.name = name;
        this.email = email;
        this.address = address;
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