package com.istad.sb4mybatis.service.seviceImpl;

import com.istad.sb4mybatis.model.Category;
import com.istad.sb4mybatis.repository.CategoryRepository;
import com.istad.sb4mybatis.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    @Override
    public void addNewCategory( Category category) {
         categoryRepository.insert(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.select();
    }

    @Override
    public void deleteByID(Integer id) {

    }
}
