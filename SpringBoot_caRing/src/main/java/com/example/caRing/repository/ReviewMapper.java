package com.example.caRing.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.caRing.model.review.Review;

@Mapper
public interface ReviewMapper {

	void saveReview(Review review);
	
	Long findRateByBoardId(Long board_id);
	
	List<Review> findReviewByBoardId(Long board_id);
}
