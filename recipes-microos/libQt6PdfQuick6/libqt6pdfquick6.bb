SUMMARY = "Qt6 PdfQuick library"
DESCRIPTION = "The Qt6 PdfQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "libQt6PdfQuick6-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "6a53ea9d3d2d6fb1471567e31e3da9714ffd3d1b14c5925315453d96798d4300a3710bfef87f200412e5e2f067e2fdc5c1343fefd08ebe9c53340dbc61fcdd11"

RPROVIDES:${PN} += "libQt6PdfQuick.so.6()(64bit) libQt6PdfQuick.so.6(Qt_6)(64bit) libQt6PdfQuick.so.6(Qt_6.0)(64bit) libQt6PdfQuick.so.6(Qt_6.1)(64bit) libQt6PdfQuick.so.6(Qt_6.2)(64bit) libQt6PdfQuick.so.6(Qt_6.3)(64bit) libQt6PdfQuick.so.6(Qt_6.4)(64bit) libQt6PdfQuick.so.6(Qt_6.5)(64bit) libQt6PdfQuick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6PdfQuick6 libQt6PdfQuick6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Pdf.so.6()(64bit) libQt6Pdf.so.6(Qt_6)(64bit) libQt6Pdf.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6)(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
