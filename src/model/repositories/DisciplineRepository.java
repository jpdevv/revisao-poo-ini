package model.repositories;

import java.util.ArrayList;
import java.util.List;

import model.entities.Discipline;

public class DisciplineRepository {
    List<Discipline> disciplines;

    public DisciplineRepository() {
        this.disciplines = new ArrayList<>();
    }

    public void save(Discipline discipline) {
        disciplines.add(discipline);
    }

    public String showAll() {
        if(disciplines.isEmpty()) {
            return "Nenhuma disciplina cadastrada.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("--------------- DISCIPLINAS ---------------\n");
        for (Discipline discipline : disciplines) {
            sb.append(discipline.toString()).append("\n");
        }
        return sb.toString();
    }
}
