SUMMARY = "Qt 6 DataVisualization library"
DESCRIPTION = "The Qt 6 DataVisualization library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6DataVisualization6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "dc60164379ee1e9c9881f9b80eb832f2134bf382fdf776698bcc9f4d83ab03c1b71b51a105580e3861ac8c7783e5afd3d487868831aee68b7965feebfae32fc3"

RPROVIDES:${PN} += "libQt6DataVisualization.so.6()(64bit) libQt6DataVisualization.so.6(Qt_6)(64bit) libQt6DataVisualization.so.6(Qt_6.0)(64bit) libQt6DataVisualization.so.6(Qt_6.1)(64bit) libQt6DataVisualization.so.6(Qt_6.2)(64bit) libQt6DataVisualization.so.6(Qt_6.3)(64bit) libQt6DataVisualization.so.6(Qt_6.4)(64bit) libQt6DataVisualization.so.6(Qt_6.5)(64bit) libQt6DataVisualization.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6DataVisualization6 libQt6DataVisualization6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6OpenGL.so.6()(64bit) libQt6OpenGL.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
