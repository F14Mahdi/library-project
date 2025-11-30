package ir.maktabsharif.library.mapper;

import ir.maktabsharif.library.dto.StudentDto;
import ir.maktabsharif.library.model.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public Student toEntity(StudentDto dto){
        Student student= Student.builder().
                name(dto.name()).
                age(dto.age()).
                localDate(dto.localDate())
                .build();

        return student;
    }

    public StudentDto toDto(Student student){
        StudentDto studentDto = new StudentDto(student.getName(),student.getAge(),student.getLocalDate());
        return studentDto;
    }

}
