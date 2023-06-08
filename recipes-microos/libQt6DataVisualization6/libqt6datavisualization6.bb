SUMMARY = "Qt 6 DataVisualization library"
DESCRIPTION = "The Qt 6 DataVisualization library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6DataVisualization6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "4e7bd38a7e237ab01ae68ba1a2dcfc397e764cf22c71dda91dfe2f6501e58bdd37e498f0afe501b811d2de234f9e606e23f81ce16111cdef9efb90d5a5401378"

RPROVIDES:${PN} += "libQt6DataVisualization.so.6()(64bit) libQt6DataVisualization.so.6(Qt_6)(64bit) libQt6DataVisualization.so.6(Qt_6.0)(64bit) libQt6DataVisualization.so.6(Qt_6.1)(64bit) libQt6DataVisualization.so.6(Qt_6.2)(64bit) libQt6DataVisualization.so.6(Qt_6.3)(64bit) libQt6DataVisualization.so.6(Qt_6.4)(64bit) libQt6DataVisualization.so.6(Qt_6.5)(64bit) libQt6DataVisualization.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6DataVisualization6 libQt6DataVisualization6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6OpenGL.so.6()(64bit) libQt6OpenGL.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
