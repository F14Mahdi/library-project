package ir.maktabsharif.library.service;

import ir.maktabsharif.library.model.Book;

import java.util.List;

public interface BookService extends BaseService<Book,Long>{

    List<Book> titleFilter(String name);
    List<Book> authorFilter(Long authorId);
    List<Book> stockFilter(Integer integer);
}
