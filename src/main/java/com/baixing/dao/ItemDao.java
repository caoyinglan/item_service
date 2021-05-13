package com.baixing.dao;

import com.baixing.entity.po.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDao extends JpaRepository<Item, Integer> {
}
