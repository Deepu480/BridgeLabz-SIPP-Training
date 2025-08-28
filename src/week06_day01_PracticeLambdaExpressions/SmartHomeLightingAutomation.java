package week06_day01_PracticeLambdaExpressions;

public class SmartHomeLightingAutomation {
    public static void main(String[] args) {
        Runnable motionTrigger = () -> System.out.println("💡 Motion detected → Turning on hallway lights.");
        Runnable timeTrigger = () -> System.out.println("🌅 Evening time → Setting warm light mode.");
        Runnable voiceTrigger = () -> System.out.println("🎤 Voice command → Switching off all lights.");

        motionTrigger.run();
        timeTrigger.run();
        voiceTrigger.run();
    }
}

