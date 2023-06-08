SUMMARY = "NetworkManager Tray applet"
DESCRIPTION = "nm-tray is a simple NetworkManager front end with information icon residing in system tray (like nm-applet), but a pure Qt implementation."
LICENSE = "GPL-2.0-only"

PV = "0.5.0"

RPM_NAME = "nm-tray-0.5.0-1.7.aarch64.rpm"
RPM_HASH = "a1584a6100c96ba5adb27451feea9d6402ce4d9466a14d4f61ab60a9709d081636725d660bc7ed432edcc9df57351b404a616de1916b2514b851656be0807866"

RPROVIDES:${PN} += "nm-tray nm-tray(aarch-64)"
RDEPENDS:${PN} += "NetworkManager ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5NetworkManagerQt.so.6()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
