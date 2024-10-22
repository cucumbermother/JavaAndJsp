package basicSettings.capture;

public class Capturing implements Capture{
    @Override
    public void capture() {
        System.out.println("🔊🔊🔊 찰칵 🔊🔊🔊");
        System.out.printf("화면을 캡쳐했습니다");
    }
}
