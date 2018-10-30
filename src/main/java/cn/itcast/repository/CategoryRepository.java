package cn.itcast.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import cn.itcast.entity.ProductCategory;

public interface CategoryRepository extends CrudRepository<ProductCategory, Integer> {
	@Override
	 Optional<ProductCategory> findById(Integer id);

}
