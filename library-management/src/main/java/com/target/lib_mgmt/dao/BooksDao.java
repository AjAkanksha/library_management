package com.target.lib_mgmt.dao;

import java.util.List;

import com.target.lib_mgmt.model.BooksEntity;

public interface BooksDao {

	public String addbooks(BooksEntity booksEntity);
	
	public BooksEntity search(String bookname);
	
	public List<BooksEntity> viewbooks();
}
