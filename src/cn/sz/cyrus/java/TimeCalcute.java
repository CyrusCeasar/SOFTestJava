package cn.sz.cyrus.java;

public class TimeCalcute {

	public static String calcTime(String time1, String time2) {
		String[] times1 = time1.split(":");
		String[] times2 = time2.split(":");
		int timeint1 = Integer.valueOf(times1[0]) * 60 + Integer.valueOf(times1[1]);
		int timeint2 = Integer.valueOf(times2[0]) * 60 + Integer.valueOf(times2[1]);
		int interval = timeint1 - timeint2;
		String result = String.format("%d:%02d", interval / 60, interval % 60);
		return result;
	}

	public static void main(String[] args) {
		String time1 = "20:20";
		String time2 = "11:18";
		System.out.println(calcTime(time1, time2));
		time1 = "22:46";
		time2 = "10:59";
		System.out.println(calcTime(time1, time2));
	}

}
