SUMMARY = "Qt 6 WebView library"
DESCRIPTION = "Qt WebView lets you display web content inside a QML application. To avoid \
including a full web browser stack, Qt WebView uses native APIs where \
appropriate."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6WebView6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ba5485bb5fe9cd098bf23f01604c711e69ea90fe27bdae1926f75e4ba5f5dd0264ed457d400683ba735c1b6d9d1f4549bf3c31ca3d73511bc113da698786318b"

RPROVIDES:${PN} += "libQt6WebView.so.6()(64bit) libQt6WebView.so.6(Qt_6)(64bit) libQt6WebView.so.6(Qt_6.0)(64bit) libQt6WebView.so.6(Qt_6.1)(64bit) libQt6WebView.so.6(Qt_6.2)(64bit) libQt6WebView.so.6(Qt_6.3)(64bit) libQt6WebView.so.6(Qt_6.4)(64bit) libQt6WebView.so.6(Qt_6.5)(64bit) libQt6WebView.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6WebView6 libQt6WebView6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
