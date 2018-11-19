package jdbc.vo;

import jdbc.vo.myClass.TourSug_Board_AudioSrc;
import jdbc.vo.myClass.TourSug_Board_ImgSrc;
import jdbc.vo.myClass.TourSug_Board_Text;

//
public class TourSuggestionVO {
	Integer tourNumber,guideNumber;
	String tourStart,tourEnd;
	TourSug_Board_Text text;
	TourSug_Board_ImgSrc imgSrc;
	TourSug_Board_AudioSrc audioSrc;
}
