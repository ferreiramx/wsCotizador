package mx.tecnit.wscotiza;

import java.text.SimpleDateFormat;
import java.util.Date;

public class timestamp {
	public static String maketimestamp(){
		String timeStamp ="["+ new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date())+"] ";
		return(timeStamp);
	}
}
