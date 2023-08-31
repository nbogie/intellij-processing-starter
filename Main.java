import processing.core.PApplet;

public class Main extends PApplet {

    public static void main(String[] args) {
        System.out.println("main - starting ");
        PApplet.main(new String[]{"Main"});
    }

    @Override
    public void settings() {
        size(800, 600);
//        noLoop();
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        background(255);
        drawGrid(50);
    }

    private void drawGrid(int cellSize) {
        float noiseScale = 0.01f;
        float timeScale = 0.01f;
        noStroke();

        for (int x = 0; x <= width; x += cellSize) {
            for (int y = 0; y <= width; y += cellSize) {
                float shade = noise(x * noiseScale, y * noiseScale, frameCount * timeScale) * 255;
                fill(shade);
                circle(x, y, 0.8f * cellSize);
            }
        }
    }
}
