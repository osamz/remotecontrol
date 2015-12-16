package com.beamng.udpsteering;


import java.net.InetAddress;

public interface OnUdpConnected {
    void onUdpConnected(InetAddress hostAddress);
    void onError(String message);
}
