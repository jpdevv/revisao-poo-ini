package model.entities;

public class Discipline {
    private String name, teacher, workload, code;

    public Discipline(String name, String workload, String teacher, String code) {
        this.name = name;
        this.code = code;
        this.workload = workload;
        this.teacher = teacher;
    }

    public String getName(){
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getWorkload() {
        return workload;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
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
        return String.format("Código: %s\nDisciplina: %s\nCarga Horária: %s\nProfessor: %s\n", code, name, workload, teacher);
    }
}
