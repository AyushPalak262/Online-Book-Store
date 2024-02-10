package com.book.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.store.entity.Book;

public interface BookRepository  extends JpaRepository<Book, Integer>{

}
