package model.entities;

import java.util.Random;

public class Discipline {
    private String name, teacher;
    private int code, workload;

    public Discipline(String name, int workload, String teacher) {
        this.name = name;
        this.code = new Random().nextInt(999);
        this.workload = workload;
        this.teacher = teacher;
    }

    public String getName(){
        return name;
    }

    public int getCode() {
        return code;
    }

    public int getWorkload() {
        return workload;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String toString() {
        return String.format("Código: %d\nDisciplina: %s\nCarga Horária: %d\nProfessor: %s\n", code, name, workload, teacher);
    }
}
