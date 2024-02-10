package com.book.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.store.entity.MyBookList;

public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {

}
