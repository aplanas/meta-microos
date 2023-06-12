SUMMARY = "KDE Wayland library"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kwayland-5.106.0-1.2.aarch64.rpm"
RPM_HASH = "650e363fb51fe4c9fe344f8a1e53bcf52b282edc1c8e0c1f38fea427f9ac525d10c82b07b0aa97f35d5547a76b1829d8573472cbc2a01400c5506c989a6589a4"

RPROVIDES:${PN} += "kwayland kwayland(aarch-64) libKF5WaylandClient.so.5()(64bit) libKF5WaylandClient5 libKF5WaylandServer.so.5()(64bit) libKF5WaylandServer5"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Gui5 libQt5WaylandClient.so.5()(64bit) libQt5WaylandClient.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libwayland-client.so.0()(64bit) libwayland-server.so.0()(64bit)"

inherit rpm
