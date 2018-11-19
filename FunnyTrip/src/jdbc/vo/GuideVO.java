package jdbc.vo;


public class GuideVO {
	Integer guideNumber, guideCount;
	String id, pw, name, gender, message, imgSrc,regDate;
	//regDate도 String으로 받는다.

	public GuideVO() {

	}

	/* guideNumber : seq , guideCount : default 0 , redDate : sysdate	*/
	public GuideVO(String id, String pw, String name, String gender, String message, String imgSrc) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.message = message;
		this.imgSrc = imgSrc;
	}

	public Integer getGuideNumber() {
		return guideNumber;
	}

	public Integer getGuideCount() {
		return guideCount;
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

	public String getGender() {
		return gender;
	}

	public String getMessage() {
		return message;
	}

	public String getImgSrc() {
		return imgSrc;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setGuideCount(Integer guideCount) {
		this.guideCount = guideCount;
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
