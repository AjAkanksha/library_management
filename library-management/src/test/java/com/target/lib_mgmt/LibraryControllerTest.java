package com.target.lib_mgmt;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.easymock.classextension.EasyMock;
import org.junit.Before;
import org.junit.Test;

import com.target.lib_mgmt.controller.LibraryController;
import com.target.lib_mgmt.model.BooksEntity;
import com.target.lib_mgmt.service.BooksService;

public class LibraryControllerTest {

	LibraryController libraryController;
	BooksService bookService;
	BooksEntity bookEntity;

	@Before
	public final void setUp() {
		libraryController = new LibraryController();
		bookService = EasyMock.createMock(BooksService.class);
		libraryController.setBooksService(bookService);
	}

	@Test
	public final void searchByBookNameTest() throws Exception {
		bookEntity = new BooksEntity();
		bookEntity.setBookid("123");
		EasyMock.expect(bookService.search("TestBook")).andReturn(bookEntity);
		EasyMock.replay(bookService);	
		BooksEntity bkf = libraryController.searchByBookName("TestBook");
		EasyMock.verify(bookService);
		assertEquals(bookEntity.getBookid(), bkf.getBookid());
	}
}
