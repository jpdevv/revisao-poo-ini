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
        for(Discipline discipline : disciplines) {
            return discipline.toString();
        }
        return null;
    }
}
