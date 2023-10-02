package com.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.entity.MyBooksList;

@Repository
public interface MyBooksRepository extends JpaRepository<MyBooksList, Integer>{

}
