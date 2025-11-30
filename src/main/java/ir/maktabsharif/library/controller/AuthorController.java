package ir.maktabsharif.library.controller;

import ir.maktabsharif.library.dto.AuthorDto;
import ir.maktabsharif.library.mapper.AuthorMapper;
import ir.maktabsharif.library.model.Author;
import ir.maktabsharif.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    public final AuthorMapper authorMapper;
    private final AuthorService authorService;
    public AuthorController(AuthorService authorService, AuthorMapper authorMapper) {
        this.authorService = authorService;
        this.authorMapper = authorMapper;
    }

    @PostMapping
    public ResponseEntity<AuthorDto> create(@RequestBody AuthorDto dto){
        Author entity = authorMapper.toEntity(dto);
        Author savedEntity = authorService.save(entity);

        AuthorDto response = authorMapper.toDto(savedEntity);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    @PutMapping("/{id}")
    public ResponseEntity<AuthorDto> update(@PathVariable Long id,@RequestBody AuthorDto dto){
        Author entity = authorMapper.toEntity(dto);
        Author updatedEntity = authorService.update(entity, id);
        AuthorDto dto1 = authorMapper.toDto(updatedEntity);

        return ResponseEntity.status(HttpStatus.OK).body(dto1);
    }




}
