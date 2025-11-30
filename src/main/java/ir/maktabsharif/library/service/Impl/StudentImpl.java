package ir.maktabsharif.library.service.Impl;

import ir.maktabsharif.library.model.Student;
import ir.maktabsharif.library.repository.StudentRepository;
import ir.maktabsharif.library.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student entity) {
       return studentRepository.save(entity);
    }

    @Override
    public Optional<Student> findById(Long aLong) {
        return studentRepository.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public Student update(Student entity, Long aLong) {
        return null;
    }
}
