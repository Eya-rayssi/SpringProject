package com.springbook.Bookspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbook.Bookspring.model.Book;
@Repository
public interface BookRepository extends JpaRepository <Book , Long >{
	
}