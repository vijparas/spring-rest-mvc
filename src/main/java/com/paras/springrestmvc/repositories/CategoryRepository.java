package com.paras.springrestmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paras.springrestmvc.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
