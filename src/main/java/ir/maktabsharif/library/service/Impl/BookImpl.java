package ir.maktabsharif.library.service.Impl;

import ir.maktabsharif.library.model.Book;
import ir.maktabsharif.library.service.BookService;

import java.util.List;
import java.util.Optional;

public class BookImpl implements BookService {
    @Override
    public List<Book> titleFilter(String name) {
        return List.of();
    }

    @Override
    public List<Book> authorFilter(Long authorId) {
        return List.of();
    }

    @Override
    public List<Book> stockFilter(Integer integer) {
        return List.of();
    }

    @Override
    public Book save(Book entity) {
        return null;

    }

    @Override
    public Optional<Book> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<Book> findAll() {
        return List.of();
    }

    @Override
    public Book update(Book entity,Long id) {
        return null;

    }
}
