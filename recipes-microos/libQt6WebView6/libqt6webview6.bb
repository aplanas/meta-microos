SUMMARY = "Qt 6 WebView library"
DESCRIPTION = "Qt WebView lets you display web content inside a QML application. To avoid \
including a full web browser stack, Qt WebView uses native APIs where \
appropriate."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6WebView6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4f7073d52e2e0a1ea395b7b6a56b2e621a3e880a25b0762a99c5a86a48fa367596b933762162ca53ae24839e2339607c787aa035ac49017ab4c57c313f0875ec"

RPROVIDES:${PN} += "libQt6WebView.so.6()(64bit) libQt6WebView.so.6(Qt_6)(64bit) libQt6WebView.so.6(Qt_6.0)(64bit) libQt6WebView.so.6(Qt_6.1)(64bit) libQt6WebView.so.6(Qt_6.2)(64bit) libQt6WebView.so.6(Qt_6.3)(64bit) libQt6WebView.so.6(Qt_6.4)(64bit) libQt6WebView.so.6(Qt_6.5)(64bit) libQt6WebView.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6WebView6 libQt6WebView6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
