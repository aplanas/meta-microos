SUMMARY = "Qt 6 WaylandClient library"
DESCRIPTION = "The Qt 6 WaylandClient library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6WaylandClient6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b6d95ec84956c0cacbd156ca0a533823801f6bde104a9bf715145a6e3a97ad781d53e9d53f6e58d9e3ca6dca5df16c1f619d3223decc9670fdd2bf908603c4d9"

RPROVIDES:${PN} += "libQt6WaylandClient.so.6()(64bit) libQt6WaylandClient.so.6(Qt_6)(64bit) libQt6WaylandClient.so.6(Qt_6.0)(64bit) libQt6WaylandClient.so.6(Qt_6.1)(64bit) libQt6WaylandClient.so.6(Qt_6.2)(64bit) libQt6WaylandClient.so.6(Qt_6.3)(64bit) libQt6WaylandClient.so.6(Qt_6.4)(64bit) libQt6WaylandClient.so.6(Qt_6.5)(64bit) libQt6WaylandClient.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6WaylandClient6 libQt6WaylandClient6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libwayland-client.so.0()(64bit) libwayland-cursor.so.0()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
