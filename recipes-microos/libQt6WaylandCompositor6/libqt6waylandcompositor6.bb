SUMMARY = "Qt 6 WaylandCompositor library"
DESCRIPTION = "The Qt 6 WaylandCompositor library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6WaylandCompositor6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "4f90a278eca2cf5fa9d49900a2073a1e6c6168d4928880879d6f4da1d3fba3c80170626609f2d3a93a99f8d01911ea2e5409c9c77811f3705a66535285170433"

RPROVIDES:${PN} += "libQt6WaylandCompositor.so.6()(64bit) libQt6WaylandCompositor.so.6(Qt_6)(64bit) libQt6WaylandCompositor.so.6(Qt_6.0)(64bit) libQt6WaylandCompositor.so.6(Qt_6.1)(64bit) libQt6WaylandCompositor.so.6(Qt_6.2)(64bit) libQt6WaylandCompositor.so.6(Qt_6.3)(64bit) libQt6WaylandCompositor.so.6(Qt_6.4)(64bit) libQt6WaylandCompositor.so.6(Qt_6.5)(64bit) libQt6WaylandCompositor.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6WaylandCompositor6 libQt6WaylandCompositor6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGLESv2.so.2()(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6OpenGL.so.6()(64bit) libQt6OpenGL.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libwayland-server.so.0()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
