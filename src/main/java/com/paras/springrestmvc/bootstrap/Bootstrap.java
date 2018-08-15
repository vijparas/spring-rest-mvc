package com.paras.springrestmvc.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.paras.springrestmvc.domain.Category;
import com.paras.springrestmvc.repositories.CategoryRepository;

@Component
public class Bootstrap implements CommandLineRunner {

	private CategoryRepository categoryRepository;

	public Bootstrap(CategoryRepository categoryRepository) {
		
		this.categoryRepository = categoryRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);
		
        System.out.println("Data Has Been saved"+categoryRepository.count());
	}
	
	
	
}
