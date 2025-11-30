package ir.maktabsharif.library.mapper;

import ir.maktabsharif.library.dto.AuthorDto;
import ir.maktabsharif.library.model.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper {

    public Author toEntity(AuthorDto dto){
        Author author = Author.builder().
                name(dto.name()).
                biography(dto.biography())
        .build();
        return author;
    }

    public AuthorDto toDto(Author author){
        AuthorDto dto = new AuthorDto(author.getName(),author.getBiography());
        return dto;
    }

    public void toEntity() {
    }

    public void toDto() {
    }
}
