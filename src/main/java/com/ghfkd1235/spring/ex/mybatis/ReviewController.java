package com.ghfkd1235.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ghfkd1235.spring.ex.mybatis.bo.ReviewBO;
import com.ghfkd1235.spring.ex.mybatis.model.Review;

@Controller
public class ReviewController {

	@Autowired
	private ReviewBO reviewBO;
	
	//특정 id의 Review 데이터 가져오기
	@RequestMapping("/mybatis/ex01/1")
	@ResponseBody
	public Review review(
			@RequestParam(value="id", required=true) Integer id) 
			//@RequestParam(value="id", defaultValue="3") int id)
	{
		
		Review review = reviewBO.getReview(id);
		return review;
	}
}
