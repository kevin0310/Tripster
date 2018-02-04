package com.tripster.persistence;

import java.util.List;

import com.tripster.domain.ContentsVO;
import com.tripster.domain.Criteria;

public interface ContentsDAO {
	//맛집 상세 정보 조회
	public ContentsVO getContentsDetail(Integer contentsID) throws Exception;
	
	//총 맛집 개수 조회
	public int getTotalRestaurantNum(Criteria cri) throws Exception;
	
	//총 관광지 개수 조회
	public int getTotalPlaceNum(Criteria cri) throws Exception;
	
	//컨텐츠 조회수 수정
	public void updateViewCnt(Integer contentsID) throws Exception;
		
	//컨텐츠 리뷰 개수 수정
	public void updateReviewCnt(Integer contentsID, int amount) throws Exception;
	
	//컨텐츠 스크랩 횟수 수정
	public void updateScrapCnt(Integer contentsID, int amount) throws Exception;

	//컨텐츠 평점
	public void updateContentsRating(Integer contentsID, double contentsRating) throws Exception;
	
	//컨텐츠 스크랩카운트 조회
	public Integer getScrapCnt(Integer contentsID)throws Exception;
}