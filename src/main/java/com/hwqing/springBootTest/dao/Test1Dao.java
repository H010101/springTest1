package com.hwqing.springBootTest.dao;

import com.hwqing.springBootTest.entity.Test1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Test1Dao extends JpaRepository<Test1, Long> {
    Test1 findById(int id);
}
