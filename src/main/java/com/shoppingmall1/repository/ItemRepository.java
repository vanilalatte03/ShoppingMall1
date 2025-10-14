package com.shoppingmall1.repository;

import com.shoppingmall1.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByItemNm(String itemNm);

    List<Item> findByItemNmOrItemDetail (String itemNm, String itemDetail);

    List<Item> findByPriceLessThan(Integer price);

}
