package com.example.project;

public class String1 {
	private char[] str;
	private int size;

	public String1() {
		size = -1;
		str = new char[80];
	}

	public void append(char c) {
		str[++size] = c;
	}

	public char remove() {
		return str[size--];
	}

	public char getChar(int i) {
		return str[i];
	}

	public int length() {
		return size + 1;
	}

	public void makeEmpty() {
		size = -1;
	}

	public void concat(String1 s) {
		for (int i = 0; i < s.length(); i++)
			append(s.getChar(i));
	}

	public boolean equals(String1 s) {
		if (s.size == this.size) { // Assuming `size` is a valid field in your String1 class
			for (int i = 0; i < s.size; i++) {
				if (s.getChar(i) != this.getChar(i)) {
					return false; // Return false if any character does not match
				}
			}
			return true; // Return true if all characters match
		}
		return false; // Return false if not an instance of String1 or sizes do not match
	}

	public void reverse() {
	    if (size < 0) {
	        return; // Return early if the string is empty
	    }
	    // Iterate only up to the middle of the string
	    for (int i = 0; i <= size / 2; i++) {
	        char temp = str[i];       // Store the character at the current index
	        str[i] = str[size - i];   // Swap character from the end to the current index
	        str[size - i] = temp;     // Place the stored character to the end position
	    }
	}


}
