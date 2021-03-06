package com.tripster.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class MemberVO {
	
	private int memberID;
	private String memberEmail;
	private String memberPassword;
	private String memberName;
	private String memberSex;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date memberBirthday;
	private String memberPicture;
	private String sessionKey;
	private String memberAuthKey;
	private String snsID;
	// elasticsearch에 회원정보 넣을때 생성일/수정일 컬럼필요해서 추가
	private Date created;
	private Date updated;
	
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberSex() {
		return memberSex;
	}
	public void setMemberSex(String memberSex) {
		this.memberSex = memberSex;
	}
	public Date getMemberBirthday() {
		return memberBirthday;
	}
	public void setMemberBirthday(Date memberBirthday) {
		this.memberBirthday = memberBirthday;
	}
	public String getMemberPicture() {
		return memberPicture;
	}
	public void setMemberPicture(String memberPicture) {
		this.memberPicture = memberPicture;
	}
	public String getSessionKey() {
		return sessionKey;
	}
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	public String getMemberAuthKey() {
		return memberAuthKey;
	}
	public void setMemberAuthKey(String memberAuthKey) {
		this.memberAuthKey = memberAuthKey;
	}
	public String getSnsID() {
		return snsID;
	}
	public void setSnsID(String snsID) {
		this.snsID = snsID;
	}
	
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	@Override
	public String toString() {
		return "MemberVO [memberID=" + memberID + ", memberEmail=" + memberEmail + ", memberPassword=" + memberPassword
				+ ", memberName=" + memberName + ", memberSex=" + memberSex + ", memberBirthday=" + memberBirthday
				+ ", memberPicture=" + memberPicture + ", sessionKey=" + sessionKey + ", memberAuthKey=" + memberAuthKey
				+ ", snsID=" + snsID + "]";
	}

	
}