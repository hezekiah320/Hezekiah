package jdbc.vo.myClass;

public class TourSug_Board_Text {
	Integer boardNumber;
	String text;
	public TourSug_Board_Text() {		
	}
	public TourSug_Board_Text(Integer boardNumber, String text) {
		this.boardNumber = boardNumber;
		this.text = text;
	}
	public Integer getBoardNumber() {
		return boardNumber;
	}
	public void setBoardNumber(Integer boardNumber) {
		this.boardNumber = boardNumber;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
