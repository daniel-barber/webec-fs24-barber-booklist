package ch.fhnw.webec.booklist.controller;

import ch.fhnw.webec.booklist.model.Book;
import ch.fhnw.webec.booklist.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// done Add an annotation to make this a Controller component
@Controller
public class BookController {
    // TODO Add an annotation to tell Spring that you want the value of this property to be injected
    @Autowired
    private BookService bookService;

    // done Add a RequestMapping for GET requests to /
    @RequestMapping("/")
    // done Add the ResponseBody annotation to be able to return the HTML response directly as a String
    @ResponseBody
    public String index() {
        // TODO Use this.bookService.findAll().get(0) to get the first book in the list
        Book firstBook = bookService.findAll().get(0);
        // language=HTML
        return String.format(
            """
                <h1>%s</h1>
                <p>%s</p>
                """,
            firstBook.getTitle(), // Pass book title
            firstBook.getDescription() // Pass book description
            // TODO Pass the book title (<h1>) and description (<p>) to the view and render them as HTML, see the Controller example in the slides
        );
    }
}
