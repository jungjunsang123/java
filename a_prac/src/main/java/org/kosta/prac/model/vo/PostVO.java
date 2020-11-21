package org.kosta.prac.model.vo;

public class PostVO {
	String BNo,BTitle,BContent,BTimePosted;
	int BHits;
	MemberVO PracMember;
	public PostVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PostVO(String bNo, String bTitle, String bContent, String bTimePosted, int bHits, MemberVO pracMember) {
		super();
		BNo = bNo;
		BTitle = bTitle;
		BContent = bContent;
		BTimePosted = bTimePosted;
		BHits = bHits;
		PracMember = pracMember;
	}
	public String getBNo() {
		return BNo;
	}
	public void setBNo(String bNo) {
		BNo = bNo;
	}
	public String getBTitle() {
		return BTitle;
	}
	public void setBTitle(String bTitle) {
		BTitle = bTitle;
	}
	public String getBContent() {
		return BContent;
	}
	public void setBContent(String bContent) {
		BContent = bContent;
	}
	public String getBTimePosted() {
		return BTimePosted;
	}
	public void setBTimePosted(String bTimePosted) {
		BTimePosted = bTimePosted;
	}
	public int getBHits() {
		return BHits;
	}
	public void setBHits(int bHits) {
		BHits = bHits;
	}
	public MemberVO getPracMember() {
		return PracMember;
	}
	public void setPracMember(MemberVO pracMember) {
		PracMember = pracMember;
	}
	@Override
	public String toString() {
		return "PostVO [BNo=" + BNo + ", BTitle=" + BTitle + ", BContent=" + BContent + ", BTimePosted=" + BTimePosted
				+ ", BHits=" + BHits + ", PracMember=" + PracMember + "]";
	}
	
	
}
