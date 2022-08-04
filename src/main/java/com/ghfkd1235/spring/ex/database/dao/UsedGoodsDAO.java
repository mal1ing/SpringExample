package com.ghfkd1235.spring.ex.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ghfkd1235.spring.ex.database.model.UsedGoods;

@Repository
public interface UsedGoodsDAO {

	// usedGoods의 모든 행을 조회하는 기능
	public List<UsedGoods> selectUsedGoodsList();
	
}
