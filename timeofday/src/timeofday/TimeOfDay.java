package timeofday;

public class TimeOfDay {
	private int minutesSinceMidnight;
	
	static int getHours(TimeOfDay t) {
		return t.minutesSinceMidnight / 60;
	}
	
	static int getMinutes(TimeOfDay t) {
		return t.minutesSinceMidnight %= 60;
	}
	
	static void setMinutes(TimeOfDay t,int value) {
		t.minutesSinceMidnight = t.minutesSinceMidnight / 60 * 60 + value;
	}
	
	static void setHours(TimeOfDay t, int value) {
		t.minutesSinceMidnight %= 60;
		t.minutesSinceMidnight += value * 60;
	}
}
