package structural.adapter.example2.adapter;

import structural.adapter.example2.interfaces.WiFI;
import structural.adapter.example2.pojo.Logitech;

public class BluetoothAdapter implements WiFI {

    // Attributes
    private Logitech logitechWithBluetooth;

    // Constructor
    public BluetoothAdapter(Logitech logitech) {
        this.logitechWithBluetooth = logitech;
    }

    @Override
    public void connect() {
        System.out.println("Logitech " + logitechWithBluetooth.getName() + " " +  logitechWithBluetooth.getSubType() + " connected to Wifi.");
    }

    @Override
    public void disconnect() {
        System.out.println("Logitech " + logitechWithBluetooth.getName() + " " +  logitechWithBluetooth.getSubType() + " connected to WiFi.");
    }

    public Logitech getLogitechWithBluetooth() {
        return logitechWithBluetooth;
    }

    public void setLogitechWithBluetooth(Logitech logitechWithBluetooth) {
        this.logitechWithBluetooth = logitechWithBluetooth;
    }
}
