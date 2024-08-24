public class Light {
    private String location;
    private int brightness;

    public Light(String location) {
        this.location = location;
        this.brightness = 100; 
    }

    public void on() {
        brightness = 100;
        System.out.println(location + " Light is ON at full brightness.");
    }

    public void off() {
        System.out.println(location + " Light is OFF.");
    }

    public void dim(int level) {
        brightness = level;
        System.out.println(location + " Light dimmed to " + level + "%.");
    }

    public int getBrightness() {
        return brightness;
    }
}
