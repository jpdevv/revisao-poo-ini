package model.repositories;

import java.util.ArrayList;
import java.util.List;

import model.entities.Discipline;

public class DisciplineRepository {
    private List<Discipline> disciplines = new ArrayList<>();

    public void registerDiscipline(Discipline discipline) {
        disciplines.add(discipline);
    }

    public String listDisciplines() {
        if (disciplines.isEmpty()) {
            return null;
        }
        
        StringBuilder result = new StringBuilder();
        for (Discipline discipline : disciplines) {
            result.append(discipline.toString()).append("\n");
        }
        return result.toString();
    }
}
