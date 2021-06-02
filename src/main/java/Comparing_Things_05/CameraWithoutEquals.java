package Comparing_Things_05;

import java.util.ArrayList;
import java.util.List;

public class CameraWithoutEquals {

    public static void main(String[] args) {
        Camera camera1 = new Camera("NIKON", "V200");
        Camera camera2 = new Camera("CANON", "I800");

        List<Camera> cameraList = new ArrayList<>();
        cameraList.add(camera1);
        cameraList.add(camera2);


        Camera camera3 = new Camera("CANON", "I800");

        System.out.println("contains camera ? " + cameraList.contains(camera1));

        System.out.println("contains camera ? " + cameraList.contains(camera3));
    }
}
