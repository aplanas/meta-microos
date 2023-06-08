SUMMARY = "DWayland Client Library"
DESCRIPTION = "DWayland is a Qt-style API to interact with the wayland-server API."
LICENSE = "LGPL-2.1-or-later"

PV = "5.24.3"

RPM_NAME = "libDWaylandServer5-5.24.3-1.3.aarch64.rpm"
RPM_HASH = "384a98243a87e74d82a19e20274485d5621a983f27ace33a9cc7baab18fd1ddfc6ee8b88b0e83eb08a02f3c5746e800cac58ec8791d009ff96d13d1bd4e370f4"

RPROVIDES:${PN} += "libDWaylandServer.so.5()(64bit) libDWaylandServer5 libDWaylandServer5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwayland-server.so.0()(64bit)"

inherit rpm
