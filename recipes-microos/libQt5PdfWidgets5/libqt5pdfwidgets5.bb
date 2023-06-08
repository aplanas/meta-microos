SUMMARY = "Qt5 PDF library for Qt Widgets"
DESCRIPTION = "Library of the Qt PDF module with support for Qt Widgets."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.13"

RPM_NAME = "libQt5PdfWidgets5-5.15.13-3.2.aarch64.rpm"
RPM_HASH = "d83aa1850ed0ea60ddd919d96673356c4e9489253e750e2d3502e44bb0dbe20231fc9455ddeac4aa3d858e0ce6f5820c39840a865e4a0c3bdea6d6ff840e63b1"

RPROVIDES:${PN} += "libQt5PdfWidgets.so.5()(64bit) libQt5PdfWidgets.so.5(Qt_5)(64bit) libQt5PdfWidgets.so.5(Qt_5.0)(64bit) libQt5PdfWidgets.so.5(Qt_5.1)(64bit) libQt5PdfWidgets.so.5(Qt_5.10)(64bit) libQt5PdfWidgets.so.5(Qt_5.11)(64bit) libQt5PdfWidgets.so.5(Qt_5.12)(64bit) libQt5PdfWidgets.so.5(Qt_5.13)(64bit) libQt5PdfWidgets.so.5(Qt_5.14)(64bit) libQt5PdfWidgets.so.5(Qt_5.15)(64bit) libQt5PdfWidgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5PdfWidgets.so.5(Qt_5.2)(64bit) libQt5PdfWidgets.so.5(Qt_5.3)(64bit) libQt5PdfWidgets.so.5(Qt_5.4)(64bit) libQt5PdfWidgets.so.5(Qt_5.5)(64bit) libQt5PdfWidgets.so.5(Qt_5.6)(64bit) libQt5PdfWidgets.so.5(Qt_5.7)(64bit) libQt5PdfWidgets.so.5(Qt_5.8)(64bit) libQt5PdfWidgets.so.5(Qt_5.9)(64bit) libQt5PdfWidgets5 libQt5PdfWidgets5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Pdf.so.5()(64bit) libQt5Pdf.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
