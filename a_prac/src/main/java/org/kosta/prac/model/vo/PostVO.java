package org.kosta.prac.model.vo;

public class PostVO {
	String bNo,bTitle,bContent,bTimePosted;
	int bHits;
	MemberVO pracMember;
	public PostVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PostVO(String bNo, String bTitle, String bContent, String bTimePosted, int bHits, MemberVO pracMember) {
		super();
		this.bNo = bNo;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bTimePosted = bTimePosted;
		this.bHits = bHits;
		this.pracMember = pracMember;
	}
	public String getbNo() {
		return bNo;
	}
	public void setbNo(String bNo) {
		this.bNo = bNo;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbTimePosted() {
		return bTimePosted;
	}
	public void setbTimePosted(String bTimePosted) {
		this.bTimePosted = bTimePosted;
	}
	public int getbHits() {
		return bHits;
	}
	public void setbHits(int bHits) {
		this.bHits = bHits;
	}
	public MemberVO getPracMember() {
		return pracMember;
	}
	public void setPracMember(MemberVO pracMember) {
		this.pracMember = pracMember;
	}
	
	
	@Override
	public String toString() {
		return "PostVO [bNo=" + bNo + ", bTitle=" + bTitle + ", bContent=" + bContent + ", bTimePosted=" + bTimePosted
				+ ", bHits=" + bHits + ", pracMember=" + pracMember + "]";
	}
	
	
	
}
