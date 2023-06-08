SUMMARY = "Qt6 PdfWidgets library"
DESCRIPTION = "The Qt6 PdfWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "libQt6PdfWidgets6-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "0ec0dad94e8a2631c07fa9c16ba9fd579abe9bcc655cf1ea5afa58a2e46e68ce93590fd1e69b375b9f132c9be928f48c1aba4c83682369c8feda2d8f253b5169"

RPROVIDES:${PN} += "libQt6PdfWidgets.so.6()(64bit) libQt6PdfWidgets.so.6(Qt_6)(64bit) libQt6PdfWidgets.so.6(Qt_6.0)(64bit) libQt6PdfWidgets.so.6(Qt_6.1)(64bit) libQt6PdfWidgets.so.6(Qt_6.2)(64bit) libQt6PdfWidgets.so.6(Qt_6.3)(64bit) libQt6PdfWidgets.so.6(Qt_6.4)(64bit) libQt6PdfWidgets.so.6(Qt_6.5)(64bit) libQt6PdfWidgets.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6PdfWidgets6 libQt6PdfWidgets6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Pdf.so.6()(64bit) libQt6Pdf.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
