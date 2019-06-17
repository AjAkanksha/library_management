package com.target.lib_mgmt.model;

import java.util.List;

import lombok.Data;

@Data
public class ViewBooksResponse {

	List<BooksEntity> booksList;
}
