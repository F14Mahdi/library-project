package ir.maktabsharif.library.controller;

import ir.maktabsharif.library.dto.StudentDto;
import ir.maktabsharif.library.mapper.StudentMapper;
import ir.maktabsharif.library.model.Student;
import ir.maktabsharif.library.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studens")
public class StudentController {

    private final StudentService studentService;
    private final StudentMapper studentMapper;
    public StudentController(StudentService studentService, StudentMapper studentMapper) {
        this.studentService = studentService;
        this.studentMapper = studentMapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student save(@RequestBody StudentDto dto){

        Student entity = studentMapper.toEntity(dto);
        return studentService.save(entity);
    }
}
