package com.baixing.dao;

import com.baixing.entity.po.App;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppDao extends JpaRepository<App, Integer> {
}
