package com.target.lib_mgmt.service;

import java.util.List;

import com.target.lib_mgmt.model.BooksEntity;


public interface BooksService {

    public String addbooks(BooksEntity booksEntity);
	
	public BooksEntity search(String bookname);
	
	public List<BooksEntity> viewbooks();
}
