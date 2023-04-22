package com.istad.sb4mybatis.repository;

import com.istad.sb4mybatis.model.Category;
import com.istad.sb4mybatis.repository.provider.CategoryProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CategoryRepository {

    @InsertProvider(type = CategoryProvider.class,method =  "buildInsertSql")
    void insert(@Param("cate") Category category);

    @SelectProvider(type = CategoryProvider.class,method = "buildSelectSql")
    List<Category> select();

    @SelectProvider(type = CategoryProvider.class,method = "buildSelectByID")
    Category selectByID(Integer id);

    @DeleteProvider(type = CategoryProvider.class,method = "buildDeleteByID")
    void deleteByID(Integer id);

    @UpdateProvider(type = CategoryProvider.class,method = "buildUpdateByID")
    List<Category> update(Integer id);


}
