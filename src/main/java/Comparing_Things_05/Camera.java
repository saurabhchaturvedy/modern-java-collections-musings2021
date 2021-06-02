package Comparing_Things_05;

public class Camera {

    private String make;
    private String model;

    public Camera(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
