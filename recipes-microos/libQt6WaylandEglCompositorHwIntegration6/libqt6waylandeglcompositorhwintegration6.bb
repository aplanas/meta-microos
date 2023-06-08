SUMMARY = "Qt 6 WaylandEglCompositorHwIntegration library"
DESCRIPTION = "The Qt 6 WaylandEglCompositorHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6WaylandEglCompositorHwIntegration6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "1d97d8b0619e2dd13c43e1a3a3f63cc1e7019186b36690d644641369196ecf52d75d4caf7c9312392047cf46a038baa45cf391b3417c8a7c770388c4d38298e2"

RPROVIDES:${PN} += "libQt6WaylandEglCompositorHwIntegration.so.6()(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6)(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6.0)(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6.1)(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6.2)(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6.3)(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6.4)(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6.5)(64bit) libQt6WaylandEglCompositorHwIntegration.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6WaylandEglCompositorHwIntegration6 libQt6WaylandEglCompositorHwIntegration6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libGLESv2.so.2()(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6OpenGL.so.6()(64bit) libQt6OpenGL.so.6(Qt_6)(64bit) libQt6WaylandCompositor.so.6()(64bit) libQt6WaylandCompositor.so.6(Qt_6)(64bit) libQt6WaylandCompositor.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libwayland-server.so.0()(64bit)"

inherit rpm
