package com.baixing.Dao;

import com.baixing.entity.po.App;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppDao extends JpaRepository<App, Integer> {
}
