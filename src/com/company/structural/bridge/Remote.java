package com.company.structural.bridge;

public class Remote {

    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled())
            device.disabled();
        else
            device.enabled();
    }


}
