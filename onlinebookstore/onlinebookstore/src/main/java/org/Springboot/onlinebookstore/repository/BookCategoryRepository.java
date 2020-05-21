package org.Springboot.onlinebookstore.repository;

import org.Springboot.onlinebookstore.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "bookCategory", path = "bookCategory")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
