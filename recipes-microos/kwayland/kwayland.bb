SUMMARY = "KDE Wayland library"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kwayland-5.105.0-1.2.aarch64.rpm"
RPM_HASH = "f0be075cf3c17f68bb2c7f7658013af02091635839f0858a326a53d091ac2777f6843c1725ed4e8bded8efa6c2c1776f65269c19f64a5894bfd5587312e382a8"

RPROVIDES:${PN} += "kwayland kwayland(aarch-64) libKF5WaylandClient.so.5()(64bit) libKF5WaylandClient5 libKF5WaylandServer.so.5()(64bit) libKF5WaylandServer5"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Gui5 libQt5WaylandClient.so.5()(64bit) libQt5WaylandClient.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libwayland-client.so.0()(64bit) libwayland-server.so.0()(64bit)"

inherit rpm
