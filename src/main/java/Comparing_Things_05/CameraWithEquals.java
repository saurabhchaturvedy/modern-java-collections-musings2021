package Comparing_Things_05;

import java.util.ArrayList;
import java.util.List;

public class CameraWithEquals {

    public static void main(String[] args) {
        Camera2 camera1 = new Camera2("NIKON", "V200");
        Camera2 camera2 = new Camera2("CANON", "I800");

        List<Camera2> cameraList = new ArrayList<>();
        cameraList.add(camera1);
        cameraList.add(camera2);


        Camera2 camera3 = new Camera2("CANON", "I800");

        System.out.println("contains camera ? " + cameraList.contains(camera1));

        System.out.println("contains camera ? " + cameraList.contains(camera3));
    }
}
