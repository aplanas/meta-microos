SUMMARY = "Examples for the qt6-wayland modules"
DESCRIPTION = "Examples for the qt6-wayland modules."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b3ae642c889fe2349dc0464976ca071dee97dfa0587fd22861ee9360f3edb7a17cfc57fe873761e19b85481eb9bbcf4a08f15375e7c96d1e0a8e8271d243a2fc"

RPROVIDES:${PN} += "libexampleshellplugin.so()(64bit) qt6-wayland-examples qt6-wayland-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6OpenGL.so.6()(64bit) libQt6OpenGL.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6WaylandClient.so.6()(64bit) libQt6WaylandClient.so.6(Qt_6)(64bit) libQt6WaylandClient.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6WaylandCompositor.so.6()(64bit) libQt6WaylandCompositor.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libwayland-client.so.0()(64bit) libwayland-server.so.0()(64bit)"

inherit rpm
