SUMMARY = "Qt 5 Wayland Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde55"

RPM_NAME = "libQt5WaylandClient5-5.15.9+kde55-1.1.aarch64.rpm"
RPM_HASH = "3efdfee2d788392fd8dd7a383de40487cb6f49a8524185ca1220ba377bec7b4df4f2b26dd0c1b593ded915fc5665e9267eab63d7ad71caa3b897f31ea877b512"

RPROVIDES:${PN} += "libQt5WaylandClient.so.5()(64bit) libQt5WaylandClient.so.5(Qt_5)(64bit) libQt5WaylandClient.so.5(Qt_5.0)(64bit) libQt5WaylandClient.so.5(Qt_5.1)(64bit) libQt5WaylandClient.so.5(Qt_5.10)(64bit) libQt5WaylandClient.so.5(Qt_5.11)(64bit) libQt5WaylandClient.so.5(Qt_5.12)(64bit) libQt5WaylandClient.so.5(Qt_5.13)(64bit) libQt5WaylandClient.so.5(Qt_5.14)(64bit) libQt5WaylandClient.so.5(Qt_5.15)(64bit) libQt5WaylandClient.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5WaylandClient.so.5(Qt_5.2)(64bit) libQt5WaylandClient.so.5(Qt_5.3)(64bit) libQt5WaylandClient.so.5(Qt_5.4)(64bit) libQt5WaylandClient.so.5(Qt_5.5)(64bit) libQt5WaylandClient.so.5(Qt_5.6)(64bit) libQt5WaylandClient.so.5(Qt_5.7)(64bit) libQt5WaylandClient.so.5(Qt_5.8)(64bit) libQt5WaylandClient.so.5(Qt_5.9)(64bit) libQt5WaylandClient5 libQt5WaylandClient5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libglib-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.28)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwayland-client.so.0()(64bit) libwayland-cursor.so.0()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
