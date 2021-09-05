package Mood;

import org.junit.Test;
public class MoodAnalyser {
	public static void main(String[] args) {
		analyseMood(null);
	}

	public static String analyseMood(String message) {
            if (message.contains("Sad")) {
                return "SAD";
            }
            else{
                return "HAPPY";
            }
    }
}