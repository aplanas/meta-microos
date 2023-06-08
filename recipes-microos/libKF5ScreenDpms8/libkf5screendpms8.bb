SUMMARY = "KDE's screen management library"
DESCRIPTION = "Energy saving display management library for KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "libKF5ScreenDpms8-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "4a3716f37f96e9a5cf2093c908d3a5d389289a887a22d42dd831822340d89d615431b45fd58508a6196317a19001279efbdb76a3fe31185d765c95051167dc3c"

RPROVIDES:${PN} += "libKF5ScreenDpms.so.8()(64bit) libKF5ScreenDpms8 libKF5ScreenDpms8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Screen8 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5WaylandClient.so.5()(64bit) libQt5WaylandClient.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libwayland-client.so.0()(64bit) libxcb-dpms.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
