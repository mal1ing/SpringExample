package com.ghfkd1235.spring.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghfkd1235.spring.ex.database.dao.UsedGoodsDAO;
import com.ghfkd1235.spring.ex.database.model.UsedGoods;

// 전달 받은 데이터를 조작하거나 처리하고, 리턴 받은 데이터를 조작 처리하는 과정 (로직)
@Service
public class UsedGoodsBO {

	@Autowired
	//객체를 Spring에서 자동으로 생성해준다
	
	private UsedGoodsDAO usedGoodsDAO;
	
	// usedGoods 테이블의 모든 행 정보를 가져오는 메소드
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> usedGoodsList = usedGoodsDAO.selectUsedGoodsList();
		return usedGoodsList;
	}
	
}
