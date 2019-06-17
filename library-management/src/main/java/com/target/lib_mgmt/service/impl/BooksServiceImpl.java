package com.target.lib_mgmt.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.lib_mgmt.dao.BooksDao;
import com.target.lib_mgmt.model.BooksEntity;
import com.target.lib_mgmt.service.BooksService;

@Service
@Transactional
public class BooksServiceImpl implements BooksService{

	private BooksDao booksDao;
	 
    @Autowired
    public BooksServiceImpl(BooksDao booksDao) {
        this.booksDao = booksDao;
    }
	public String addbooks(BooksEntity booksEntity) {
		// TODO Auto-generated method stub
		return this.booksDao.addbooks(booksEntity);
	}

	public BooksEntity search(String bookname) {
		// TODO Auto-generated method stub
		return this.booksDao.search(bookname);
	}

	public List<BooksEntity> viewbooks() {
		// TODO Auto-generated method stub
		return this.booksDao.viewbooks();
	}

}
