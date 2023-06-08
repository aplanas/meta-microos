SUMMARY = "Qt 6 DataVisualizationQml library"
DESCRIPTION = "The Qt 6 DataVisualizationQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6DataVisualizationQml6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "d44c1cb11fd74f25a8e4e554ca332935d9c6ecfe3935952ed7d6feaf04ffb584f848600a20232e1754de5c8204c1a9600f68d4ca50f2f0ac0cd74a0a2bdb8a12"

RPROVIDES:${PN} += "libQt6DataVisualizationQml.so.6()(64bit) libQt6DataVisualizationQml.so.6(Qt_6)(64bit) libQt6DataVisualizationQml.so.6(Qt_6.0)(64bit) libQt6DataVisualizationQml.so.6(Qt_6.1)(64bit) libQt6DataVisualizationQml.so.6(Qt_6.2)(64bit) libQt6DataVisualizationQml.so.6(Qt_6.3)(64bit) libQt6DataVisualizationQml.so.6(Qt_6.4)(64bit) libQt6DataVisualizationQml.so.6(Qt_6.5)(64bit) libQt6DataVisualizationQml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6DataVisualizationQml6 libQt6DataVisualizationQml6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6DataVisualization.so.6()(64bit) libQt6DataVisualization.so.6(Qt_6)(64bit) libQt6DataVisualization.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6OpenGL.so.6()(64bit) libQt6OpenGL.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
