public class LightDimCommand implements Command {
    private Light light;
    private int previousBrightness;
    private int newBrightness;

    public LightDimCommand(Light light, int brightness) {
        this.light = light;
        this.newBrightness = brightness;
    }

    @Override
    public void execute() {
        previousBrightness = light.getBrightness();
        light.dim(newBrightness);
    }

    @Override
    public void undo() {
        light.dim(previousBrightness);
    }
}
