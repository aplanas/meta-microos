SUMMARY = "Python bindings for the Qt Charts library"
DESCRIPTION = "PyQt6-Charts is a set of Python bindings for The Qt Company’s Qt Charts framework. \
The bindings sit on top of PyQt6 and are implemented as a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-Charts-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "6976e8514ac616554cbcabd02ed861d2facf647bf54659fdcf4497b90f8559d65451ca5cbca0aa2dcb2dad628b7aa26917464bb6c505f4e68615111ce2f81a1e"

RPROVIDES:${PN} += "python3.11dist(pyqt6-charts) python311-PyQt6-Charts python311-PyQt6-Charts(aarch-64) python311-qtcharts-qt6 python3dist(pyqt6-charts)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Charts.so.6()(64bit) libQt6Charts.so.6(Qt_6)(64bit) libQt6Charts.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi) python311-PyQt6"

inherit rpm
