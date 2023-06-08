SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQtNetworkAuth is a set of Python bindings for The Qt Company’s Qt Network \
Authorization library. The bindings sit on top of PyQt5 and are implemented \
as a single module."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python310-qtnetworkauth-qt5-5.15.5-1.14.aarch64.rpm"
RPM_HASH = "297f4232bd6c73fb5e8bdae0197a0dd6c77afec4824fdd74078c91df073f238c874916879e4f532e9245a2531a6f9f73a601e5909b8faa5c731e606a68818110"

RPROVIDES:${PN} += "python3-PyQtNetworkAuth python3-qtnetworkauth-qt5 python3.10dist(pyqtnetworkauth) python310-PyQtNetworkAuth python310-qtnetworkauth-qt5 python310-qtnetworkauth-qt5(aarch-64) python3dist(pyqtnetworkauth)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5NetworkAuth.so.5()(64bit) libQt5NetworkAuth.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi) python310-qt5 python310-qt5-sip"

inherit rpm
