package us.dontcareabout.ccddcho.basic.Issue_13;

import java.util.EmptyStackException;

public class StringAck implements IStack {
	private String s = "";
	private int commaIndex;

	@Override
	public void push(int k) {
		if (s != "") {
			s += ",";
		}
		s += String.valueOf(k);
		commaIndex = s.lastIndexOf(",");
	}

	public void reduce() {
		if (commaIndex == -1) {
			s = "";
		}

		if (commaIndex >= 0) {
			s = s.substring(0, commaIndex);
			commaIndex = s.lastIndexOf(",", s.lastIndexOf(","));
		}
	}

	@Override
	public int pop() {

		if (commaIndex > 0) {
			int popElement = Integer.valueOf(s.substring(commaIndex + 1, s.length()));
			reduce();
			return popElement;
		}

		if (commaIndex == -1 && s.length() > 0) {
			int popElement = Integer.valueOf(s.substring(0, s.length()));
			reduce();
			return popElement;
		}

		if (commaIndex == -1 || commaIndex == 0 && s.length() == 0) {
			throw new EmptyStackException();
		}

		return -1;
	}

	@Override
	public int peek() {
		if (commaIndex == -1 && s.length() < 0) {
			throw new EmptyStackException();
		}

		int peekElement = Integer.valueOf(s.substring(commaIndex + 1));
		return peekElement;
	}

	@Override
	public boolean isEmpty() {
		return s.isEmpty();
	}

}
