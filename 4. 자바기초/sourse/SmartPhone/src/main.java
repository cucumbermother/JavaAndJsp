import basicSettings.capture.Capturing;
import features.fortune.FortuneToday;

public class main {
    public static void main(String[] args) {
        Capturing capturing = new Capturing();
        capturing.capture();
        FortuneToday fortuneToday = new FortuneToday();
        fortuneToday.choice();
    }
}
