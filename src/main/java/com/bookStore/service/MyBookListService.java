package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.MyBooksList;
import com.bookStore.repository.MyBooksRepository;

@Service
public class MyBookListService {

	@Autowired
	private MyBooksRepository mybook;
	
	public void saveMyBooks(MyBooksList book) {
		mybook.save(book);
	}
	
	public List<MyBooksList> getAllMyBooks(){
		return mybook.findAll();
	}
	
	public void deleteById(int id) {
		mybook.deleteById(id);
	}
}
