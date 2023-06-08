SUMMARY = "Python bindings for the Qt Charts library"
DESCRIPTION = "PyQt6-Charts is a set of Python bindings for The Qt Company’s Qt Charts framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-Charts-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "419f92d30dcac8ee3fba30cc5284400f06e8a4566dc61a51b48696fac2a5ee1f0e00a7ae3d4c5250935d4fdc7400744d4848e81a3e2f0e12db7bd4b028c8e6f9"

RPROVIDES:${PN} += "python3.9dist(pyqt6-charts) python39-PyQt6-Charts python39-PyQt6-Charts(aarch-64) python39-qtcharts-qt6 python3dist(pyqt6-charts)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Charts.so.6()(64bit) libQt6Charts.so.6(Qt_6)(64bit) libQt6Charts.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi) python39-PyQt6"

inherit rpm
