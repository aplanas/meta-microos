SUMMARY = "Qt 6 Positioning plugins and libraries"
DESCRIPTION = "The Qt Positioning API provides positioning information via QML and C++ interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-positioning-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "cff295cfd3182de754386ceb60bd63beaff6be1578e8524dd0a1e163ed123473aa5b5de64ef69f1402cc6dfaf82bfbf008e716dffdcd9ee52bea9cad25fe1c9a"

RPROVIDES:${PN} += "libqtposition_geoclue2.so()(64bit) libqtposition_geoclue2.so(Qt_6)(64bit) libqtposition_geoclue2.so(Qt_6.0)(64bit) libqtposition_geoclue2.so(Qt_6.1)(64bit) libqtposition_geoclue2.so(Qt_6.2)(64bit) libqtposition_geoclue2.so(Qt_6.3)(64bit) libqtposition_geoclue2.so(Qt_6.4)(64bit) libqtposition_geoclue2.so(Qt_6.5)(64bit) libqtposition_geoclue2.so(Qt_6.5.0_PRIVATE_API)(64bit) libqtposition_nmea.so()(64bit) libqtposition_nmea.so(Qt_6)(64bit) libqtposition_nmea.so(Qt_6.0)(64bit) libqtposition_nmea.so(Qt_6.1)(64bit) libqtposition_nmea.so(Qt_6.2)(64bit) libqtposition_nmea.so(Qt_6.3)(64bit) libqtposition_nmea.so(Qt_6.4)(64bit) libqtposition_nmea.so(Qt_6.5)(64bit) libqtposition_nmea.so(Qt_6.5.0_PRIVATE_API)(64bit) libqtposition_positionpoll.so()(64bit) libqtposition_positionpoll.so(Qt_6)(64bit) libqtposition_positionpoll.so(Qt_6.0)(64bit) libqtposition_positionpoll.so(Qt_6.1)(64bit) libqtposition_positionpoll.so(Qt_6.2)(64bit) libqtposition_positionpoll.so(Qt_6.3)(64bit) libqtposition_positionpoll.so(Qt_6.4)(64bit) libqtposition_positionpoll.so(Qt_6.5)(64bit) libqtposition_positionpoll.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-location qt6-positioning qt6-positioning(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6DBus.so.6()(64bit) libQt6DBus.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Positioning.so.6()(64bit) libQt6Positioning.so.6(Qt_6)(64bit) libQt6SerialPort.so.6()(64bit) libQt6SerialPort.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
