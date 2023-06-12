SUMMARY = "Python bindings for the Qt Charts library"
DESCRIPTION = "PyQt6-Charts is a set of Python bindings for The Qt Company’s Qt Charts framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-Charts-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "1b7a58bcb6dc3c8f4a2518ed175fd9ee4d721b43372ad4234a1f33f4c76e884ff2c840ecd2bc88226bea930668acee05761106db88327bcdc62fddf8b3e05ac6"

RPROVIDES:${PN} += "python3.9dist(pyqt6-charts) \
python39-PyQt6-Charts \
python39-PyQt6-Charts(aarch-64) \
python39-qtcharts-qt6 \
python3dist(pyqt6-charts)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Charts.so.6()(64bit) \
libQt6Charts.so.6(Qt_6)(64bit) \
libQt6Charts.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
python(abi) \
python39-PyQt6"

inherit rpm
