SUMMARY = "Qt6 PdfQuick library"
DESCRIPTION = "The Qt6 PdfQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6PdfQuick6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "701f459cea31a9ab80ae9879149005d9e78d34ba344a1c0184b97720b238997e8c65f60f29b934e4571ce5cb9370df0b919664c464a458d30451ca2ad2611123"

RPROVIDES:${PN} += "libQt6PdfQuick.so.6()(64bit) \
libQt6PdfQuick.so.6(Qt_6)(64bit) \
libQt6PdfQuick.so.6(Qt_6.0)(64bit) \
libQt6PdfQuick.so.6(Qt_6.1)(64bit) \
libQt6PdfQuick.so.6(Qt_6.2)(64bit) \
libQt6PdfQuick.so.6(Qt_6.3)(64bit) \
libQt6PdfQuick.so.6(Qt_6.4)(64bit) \
libQt6PdfQuick.so.6(Qt_6.5)(64bit) \
libQt6PdfQuick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6PdfQuick6 \
libQt6PdfQuick6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Pdf.so.6()(64bit) \
libQt6Pdf.so.6(Qt_6)(64bit) \
libQt6Pdf.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6Quick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
