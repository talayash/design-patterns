package structural.adapter.example2;

import structural.adapter.example2.adapter.BluetoothAdapter;
import structural.adapter.example2.interfaces.Bluetooth;
import structural.adapter.example2.interfaces.WiFI;
import structural.adapter.example2.pojo.HyperX;
import structural.adapter.example2.pojo.Logitech;

public class Main {

    public static void main(String[] arg) {

        Logitech logitechBluetooth = new Logitech("Wireless PRO", "12");
        BluetoothAdapter logitechWiFi = new BluetoothAdapter(logitechBluetooth);

        // Connect using bluetooth
        logitechWiFi.getLogitechWithBluetooth().connect();
        logitechWiFi.getLogitechWithBluetooth().disconnect();
        // Connect using adapter to Wi-Fi
        logitechWiFi.connect();
        logitechWiFi.disconnect();

    }
}
