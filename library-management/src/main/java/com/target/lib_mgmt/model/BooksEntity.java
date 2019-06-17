 package com.target.lib_mgmt.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class BooksEntity {

	   @Id
	   @Column(name = "bookid")
		private String bookid;

		@Column(name = "bookname")
		private String bookname;

		@Column(name = "authorname")
		private String authorname;

		@Column(name = "edition")
		private String edition;

		@Column(name = "price")
		private String price; 
		
		@Column(name = "issued")
		private String issued; 
		
		@Column(name = "issuedTo")
		private String issuedTo; 
		
		@Column(name = "issueddate")
		private String issueddate; 
		
		@Column(name = "returndate")
		private String returndate; 

}
