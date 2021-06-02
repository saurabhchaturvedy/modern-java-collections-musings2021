package Comparing_Things_05;

public class Camera2 {

    private String make;
    private String model;

    public Camera2(String make, String model) {
        this.make = make;
        this.model = model;
    }


    @Override
    public boolean equals(Object obj) {
        Camera2 camera2 = (Camera2) obj;
        return this.make.equals(camera2.make) && this.model.equals(camera2.model);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
