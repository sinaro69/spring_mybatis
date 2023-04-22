package com.istad.sb4mybatis.service;

import com.istad.sb4mybatis.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategoryService {
    /**
     * add new category
     * Category POJO class
     */
    void addNewCategory(Category category);

    List<Category> findAll();

    void deleteByID(Integer id);
    Category selectByID(Integer id);

}

