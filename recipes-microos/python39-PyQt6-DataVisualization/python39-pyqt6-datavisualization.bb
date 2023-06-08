SUMMARY = "Python bindings for the Qt Data Visualization library"
DESCRIPTION = "PyQt6-DataVisualization is a set of Python bindings for The Qt Company’s Qt DataVisualization framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-DataVisualization-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "da1676c22997f336641aba7b607dcaedf30bf484a5f12c24a7b131ed552a3fcbac31af52d2c28ab6b5d77512a68e54c1234608a605c32b6b92b9172a6b2e0d20"

RPROVIDES:${PN} += "python3.9dist(pyqt6-datavisualization) python39-PyQt6-DataVisualization python39-PyQt6-DataVisualization(aarch-64) python39-qtdatavisualization-qt6 python3dist(pyqt6-datavisualization)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6DataVisualization.so.6()(64bit) libQt6DataVisualization.so.6(Qt_6)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi) python39-PyQt6"

inherit rpm
