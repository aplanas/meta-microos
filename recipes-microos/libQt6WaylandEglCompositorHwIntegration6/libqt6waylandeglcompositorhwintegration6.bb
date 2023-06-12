SUMMARY = "Qt 6 WaylandEglCompositorHwIntegration library"
DESCRIPTION = "The Qt 6 WaylandEglCompositorHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WaylandEglCompositorHwIntegration6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "52ae848e86be9dc747357a5f560d08255cdea72a313e888dc84a08049b5685548b9e90e00f3c6203725f5e12aee082e1fe79faf86d3c72eafcced1d6513d935d"

RPROVIDES:${PN} += "libQt6WaylandEglCompositorHwIntegration.so.6()(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6)(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6.0)(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6.1)(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6.2)(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6.3)(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6.4)(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6.5)(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6WaylandEglCompositorHwIntegration6 libQt6WaylandEglCompositorHwIntegration6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libGLESv2.so.2()(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6OpenGL.so.6()(64bit) libQt6OpenGL.so.6(Qt_6)(64bit) libQt6WaylandCompositor.so.6()(64bit) libQt6WaylandCompositor.so.6(Qt_6)(64bit) libQt6WaylandCompositor.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libwayland-server.so.0()(64bit)"

inherit rpm
