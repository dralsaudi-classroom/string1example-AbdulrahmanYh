package com.example.project;

public class String1 {
    private char[] str;
    private int size;

    // Constructor to initialize the String1 object
    public String1() {
        size = -1; // Indicates the string is initially empty
        str = new char[80]; // Default maximum capacity of 80 characters
    }

    // Appends a character to the end of the string
    public void append(char c) {
        if (size + 1 < str.length) { // Ensure there's enough space
            str[++size] = c;
        } else {
            // Optional: Handle the case when there's no more space
            System.out.println("String1 is full. Cannot append more characters.");
        }
    }

    // Removes and returns the last character of the string
    public char remove() {
        if (size >= 0) {
            return str[size--];
        }
        throw new IllegalStateException("String1 is empty. Cannot remove a character.");
    }

    // Gets the character at the specified index
    public char getChar(int i) {
        if (i >= 0 && i <= size) {
            return str[i];
        }
        throw new IndexOutOfBoundsException("Index out of range: " + i);
    }

    // Returns the current length of the string
    public int length() {
        return size + 1; // `size` is zero-based; add 1 to get the actual length
    }

    // Empties the string
    public void makeEmpty() {
        size = -1; // Resets size to indicate an empty string
    }

    // Concatenates another String1 object to this one
    public void concat(String1 s) {
        for (int i = 0; i < s.length(); i++) {
            append(s.getChar(i));
        }
    }

    // Checks equality between this object and another String1 object
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // If both references point to the same object
        }
        if (obj instanceof String1) {
            String1 s = (String1) obj;

            // Check if the lengths are equal
            if (s.size == this.size) {
                for (int i = 0; i <= s.size; i++) { // Corrected loop to check all characters
                    if (s.getChar(i) != this.getChar(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false; // Return false if not an instance of String1 or sizes do not match
    }

    // Reverses the string
    public void reverse() {
        if (size < 0) {
            return; // Nothing to reverse if the string is empty
        }
        for (int i = 0; i <= size / 2; i++) {
            char temp = str[size - i];
            str[size - i] = str[i];
            str[i] = temp;
        }
    }

    // Optional: Override toString() method for better representation
    @Override
    public String toString() {
        return new String(str, 0, size + 1); // Converts the char array to a String
    }
}
