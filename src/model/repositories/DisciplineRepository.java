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
            return "[Erro] - Nenhuma disciplina cadastrada.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("--------------- DISCIPLINAS ---------------\n");
        for (Discipline discipline : disciplines) {
            sb.append(discipline.toString()).append("\n");
        }
        return sb.toString();
    }

    public void delete(String code) {
        for (int i = 0; i < disciplines.size(); i++) {
            if (disciplines.get(i).getCode().equals(code)) {
                disciplines.remove(i);
                return;
            }
        }
    }
}
