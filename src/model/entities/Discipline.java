package model.entities;

import java.util.Random;

public class Discipline {
    private String name, teacher, workload;
    private int code;

    public Discipline(String name, String workload, String teacher) {
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

    public String getWorkload() {
        return workload;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String toString() {
        return String.format("Código: %d\nDisciplina: %s\nCarga Horária: %s\nProfessor: %s\n", code, name, workload, teacher);
    }
}
