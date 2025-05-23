package business.services;

import model.entities.Discipline;
import model.repositories.DisciplineRepository;

public class DisciplineService {
    private static DisciplineRepository disciplineRepository = new DisciplineRepository();

    public void registerDiscipline(Discipline discipline) {
        disciplineRepository.save(discipline);
    }

    public String showAll() {
        return disciplineRepository.showAll();
    }

    public void deleteDiscipline(String code) {
        disciplineRepository.delete(code);
    }
}
