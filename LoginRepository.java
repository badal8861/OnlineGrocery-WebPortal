package com.onlinegrocery.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import com.onlinegrocery.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Integer>  {


}

