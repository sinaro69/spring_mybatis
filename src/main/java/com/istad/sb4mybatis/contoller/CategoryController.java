package com.istad.sb4mybatis.contoller;

import com.istad.sb4mybatis.model.Category;
import com.istad.sb4mybatis.service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {


    private final CategoryService categoryService;
//    CategoryController(CategoryService categoryService){
//        this.categoryService=categoryService;
//    }
    @GetMapping
    public String viewCategory(Category category , Model model){
        model.addAttribute("category",category);
        model.addAttribute("categories",categoryService.findAll());
        return "/page/category/cate-main";
    }

    @PostMapping("/save")
    public String saveCategory(@Valid Category category,BindingResult result, Model model){
        if(result.hasErrors()){
            return viewCategory(category,model);
        }
        categoryService.addNewCategory(category);
        return "redirect:/category";
    }


}
