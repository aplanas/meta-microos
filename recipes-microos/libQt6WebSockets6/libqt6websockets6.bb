SUMMARY = "Qt 6 WebSockets library"
DESCRIPTION = "The Qt WebSockets module provides C++ and QML interfaces that enable \
Qt applications to act as a server that can process WebSocket \
requests, or a client that can consume data received from the server, \
or both."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6WebSockets6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "2d496a65e123080f637eb52484a63ee75a72f39f6b7d5b12b6b36880319c1953a2418fcc10b6c7b77f813cfae32f917726f3750034cd18b9ae31917984973983"

RPROVIDES:${PN} += "libQt6WebSockets.so.6()(64bit) libQt6WebSockets.so.6(Qt_6)(64bit) libQt6WebSockets.so.6(Qt_6.0)(64bit) libQt6WebSockets.so.6(Qt_6.1)(64bit) libQt6WebSockets.so.6(Qt_6.2)(64bit) libQt6WebSockets.so.6(Qt_6.3)(64bit) libQt6WebSockets.so.6(Qt_6.4)(64bit) libQt6WebSockets.so.6(Qt_6.5)(64bit) libQt6WebSockets.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6WebSockets6 libQt6WebSockets6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Network.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
