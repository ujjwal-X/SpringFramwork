package com.example.boot05restbook.service;

import com.example.boot05restbook.entity.Book;
import com.example.boot05restbook.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookService
{

    @Autowired
    BookRepo bookRepo;

//    private static List<Book> allBooks=new ArrayList<>();
//    static {
//        allBooks.add(new Book(1,"Spring","SpringFrameWork"));
//        allBooks.add(new Book(2,"SpringBoot","SpringBootFramework"));
//        allBooks.add(new Book(3,"Hibernate","Hibernatee"));
//    }

    public List<Book> getAllBooks(){
        List<Book> list= (List<Book>) this.bookRepo.findAll();
        return list;
    }

    public Optional<Book> getBookById(int id){
       Optional<Book> book = null;
        try{
//            book =allBooks.stream().filter(s->s.getId()==id).findFirst().get();
             book= Optional.ofNullable(this.bookRepo.findById(id));
             return book;
        }
        catch (Exception e){
            e.printStackTrace();
        }


        return book;
    }

    public List<Book> addBook(List<Book> b) {
        List<Book> result= (List<Book>) bookRepo.saveAll(b);
        return result;

    }

    public void deleteBook(int bid){
//        allBooks.removeIf(i->i.getId()==bid);
        bookRepo.deleteById(bid);
    }



    public void updatedList(Book b,int id){
//        Book update=allBooks.stream().filter(z-> z.getId()==id).findFirst().get();
//        update.setTitle(b.getTitle());
//        update.setAuthor(b.getAuthor());
        b.setId(id);
        bookRepo.save(b);

    }
}
