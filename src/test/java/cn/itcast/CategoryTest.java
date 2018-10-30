package cn.itcast;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.itcast.entity.ProductCategory;
import cn.itcast.repository.CategoryRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryTest {
	@Autowired
	private CategoryRepository categoryRepository;

	@Test
	public void contextLoads() {
	}
	@Test
	public void findById() {
		ProductCategory category=categoryRepository.findById(1).get();
		System.out.println(category);
	}

}
