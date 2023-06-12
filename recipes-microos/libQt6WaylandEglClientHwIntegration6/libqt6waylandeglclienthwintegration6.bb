SUMMARY = "Qt 6 WaylandEglClientHwIntegration library"
DESCRIPTION = "The Qt 6 WaylandEglClientHwIntegration  library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WaylandEglClientHwIntegration6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "29d67bb3ad8cc3ebc910a0384a323e9c393c7cb7bb031b7e935e37ad4778bfa0a18006d0d946c1788741fe5bb89cfa2a4d16d8d1ff26394cd02c0df3b44904a2"

RPROVIDES:${PN} += "libQt6WaylandEglClientHwIntegration.so.6()(64bit) \
libQt6WaylandEglClientHwIntegration.so.6(Qt_6)(64bit) \
libQt6WaylandEglClientHwIntegration.so.6(Qt_6.0)(64bit) \
libQt6WaylandEglClientHwIntegration.so.6(Qt_6.1)(64bit) \
libQt6WaylandEglClientHwIntegration.so.6(Qt_6.2)(64bit) \
libQt6WaylandEglClientHwIntegration.so.6(Qt_6.3)(64bit) \
libQt6WaylandEglClientHwIntegration.so.6(Qt_6.4)(64bit) \
libQt6WaylandEglClientHwIntegration.so.6(Qt_6.5)(64bit) \
libQt6WaylandEglClientHwIntegration.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6WaylandEglClientHwIntegration6 \
libQt6WaylandEglClientHwIntegration6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6OpenGL.so.6()(64bit) \
libQt6OpenGL.so.6(Qt_6)(64bit) \
libQt6OpenGL.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6WaylandClient.so.6()(64bit) \
libQt6WaylandClient.so.6(Qt_6)(64bit) \
libQt6WaylandClient.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-egl.so.1()(64bit)"

inherit rpm
