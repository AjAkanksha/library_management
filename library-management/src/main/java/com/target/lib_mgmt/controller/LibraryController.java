package com.target.lib_mgmt.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.target.lib_mgmt.model.BooksEntity;
import com.target.lib_mgmt.model.ViewBooksResponse;
import com.target.lib_mgmt.service.BooksService;


/**
 * @author 
 *
 */
@CrossOrigin(origins = "*", allowedHeaders = "*") 
@RestController
public class LibraryController {
	
	@Autowired
	private BooksService booksService;

	public static final Logger logger = LoggerFactory.getLogger(LibraryController.class);

	@RequestMapping(value = "/addbook", method = RequestMethod.POST)
    public String add(@RequestBody BooksEntity booksEntity) throws Exception {
        return booksService.addbooks(booksEntity);
    }

    @RequestMapping(value = "/searchbook/{bookname}", method = RequestMethod.GET)
    public BooksEntity searchByBookName(@PathVariable("bookname") String bookname) throws Exception {
        return booksService.search(bookname);
    }
    
    @RequestMapping(value = "/viewBooks", method = RequestMethod.GET)
    public ViewBooksResponse view() throws Exception {
    	ViewBooksResponse response= new ViewBooksResponse();
    	List<BooksEntity> booksList=booksService.viewbooks();
    	response.setBooksList(booksList);
    	return response;
    }
}
