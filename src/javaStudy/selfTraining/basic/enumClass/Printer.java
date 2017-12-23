package enumClass;

import java.util.EnumSet;

public class Printer {
	void print() {
		for (WeekDay day : EnumSet.range(WeekDay.Mon, WeekDay.Fri)) {
			System.out.println(day);
		}
	}
}
