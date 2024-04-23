package ch.fhnw.webec.booklist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// done Add an annotation to make this a Controller component
@Controller
public class AboutController {
    // done Add a RequestMapping for GET requests to /about
    @RequestMapping("/about")
    // done Add the ResponseBody annotation to be able to return the HTML response directly as a String
    @ResponseBody
    public String about() {
        // language=HTML
        return """
            <!-- TODO Write your HTML here, tell the user that this site is still under construction -->
        """;
    }
}
