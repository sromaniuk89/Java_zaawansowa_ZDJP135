public class Camera {
    private int resolution;
    private int maxZoom;

    public Camera(int resolution, int maxZoom) {
        this.resolution = resolution;
        this.maxZoom = maxZoom;
    }

    public int getResolution() {
        return resolution;
    }

    public int getMaxZoom() {
        return maxZoom;
    }
}
