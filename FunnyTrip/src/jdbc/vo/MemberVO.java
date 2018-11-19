package jdbc.vo;

public class MemberVO {
	Integer memberNumber,reviewCount,totalTour;
	String id,pw,name,regDate,gender,message,imgSrc;
	//regDate를 String으로 받는다.
	public MemberVO() {
	
	}
	//memberNumber : seq , reviewCount,totaltour : default 0 , regDate : sysdate
	public MemberVO(String id, String pw, String name, String gender, String message, String imgSrc) {		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.message = message;
		this.imgSrc = imgSrc;
	}
	public Integer getMemberNumber() {
		return memberNumber;
	}
	public Integer getReviewCount() {
		return reviewCount;
	}
	public Integer getTotalTour() {
		return totalTour;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public String getRegDate() {
		return regDate;
	}
	public String getGender() {
		return gender;
	}
	public String getMessage() {
		return message;
	}
	public String getImgSrc() {
		return imgSrc;
	}
	public void setReviewCount(Integer reviewCount) {
		this.reviewCount = reviewCount;
	}
	public void setTotalTour(Integer totalTour) {
		this.totalTour = totalTour;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	
	
}
