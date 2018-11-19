package jdbc.vo.myClass;

public class TourSug_Board_ImgSrc {
	Integer boardNumber;
	String imgSrc;// String으로 ','로 구분하여 받은 후 DB에 저장한다. 이후 호출 시 StringTokenizer를 이용해서 구분한다. =>DB접근
					// 최소화

	public TourSug_Board_ImgSrc() {

	}

	public TourSug_Board_ImgSrc(Integer boardNumber, String imgSrc) {

		this.boardNumber = boardNumber;
		this.imgSrc = imgSrc;
	}

}
