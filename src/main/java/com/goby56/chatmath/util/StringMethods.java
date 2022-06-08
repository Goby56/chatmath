package com.goby56.chatmath.util;

public class StringMethods {
    public static String getWordAtCursor(String text, int cursor) {
        int start = firstIndex(text, cursor);
        int end = lastIndex(text, cursor);
        return text.substring(start, end);
    }

    public static int firstIndex(String text, int cursor) {
        if (cursor == 0) return 0;
        if (text.charAt(cursor - 1) == ' ') return cursor;
        for (int i = cursor - 1; i > 0; i--) {
            if (text.charAt(i - 1) == ' ') return i;
        }
        return 0;
    }

    public static int lastIndex(String text, int cursor) {
        if (cursor == text.length()) return cursor;
        for (int i = cursor; i < text.length(); i++) {
            if (text.charAt(i) == ' ') return i;
        }
        return text.length();
    }
}
