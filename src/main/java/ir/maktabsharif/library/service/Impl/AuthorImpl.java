package ir.maktabsharif.library.service.Impl;

import ir.maktabsharif.library.exception.LibraryException;
import ir.maktabsharif.library.model.Author;
import ir.maktabsharif.library.repository.AuthorRepository;
import ir.maktabsharif.library.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class  AuthorImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public Author save(Author entity) {
        return authorRepository.save(entity);

    }

    @Override
    public Optional<Author> findById(Long aLong) {
        return authorRepository.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
        Optional<Author> foundedAuthor = findById(aLong);
        if (foundedAuthor.isPresent()){
            authorRepository.deleteById(aLong);
        }else {
            throw new LibraryException("Author not found");
        }

    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author update(Author entity,Long id) {
        Optional<Author> foundedAuthor = findById(id);
        if (foundedAuthor.isPresent()){
            foundedAuthor.get().setName(entity.getName());

            return authorRepository.save(foundedAuthor.get());

        }else {
            throw new LibraryException("Author not found");
        }


    }
}
