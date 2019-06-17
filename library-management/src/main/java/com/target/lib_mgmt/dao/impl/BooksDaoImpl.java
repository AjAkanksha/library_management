package com.target.lib_mgmt.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.target.lib_mgmt.dao.BooksDao;
import com.target.lib_mgmt.model.BooksEntity;

@Repository
@Transactional
public class BooksDaoImpl implements BooksDao{

	private SessionFactory sessionFactory;

	@Autowired
	public BooksDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public String addbooks(BooksEntity booksEntity) {
		Session session = this.sessionFactory.getCurrentSession();
		return (String) session.save(booksEntity);
	}

	@Override
	public BooksEntity search(String bookname) {
		Session session = this.sessionFactory.getCurrentSession();

		Query query1 = session.createQuery("from BooksEntity b where b.bookname= :bookname");
		query1.setParameter("bookname", bookname);
		
		BooksEntity bookentity=(BooksEntity) query1.list().get(0);
				
		return bookentity;
	}

	@Override
	public List<BooksEntity> viewbooks() {
		Session session = this.sessionFactory.getCurrentSession();

		Query query1 = session.createQuery("from BooksEntity");
		
		List<BooksEntity> bookslist=(List<BooksEntity>) query1.list();
				
		return bookslist;
	}

}
