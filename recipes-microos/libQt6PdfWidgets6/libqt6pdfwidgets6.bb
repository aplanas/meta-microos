SUMMARY = "Qt6 PdfWidgets library"
DESCRIPTION = "The Qt6 PdfWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6PdfWidgets6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "eeb59ae1d48f4d674e4e595781d708eecb0215b0a0eb944351d70031f4da0d61c5e0567ee7614979df57831707317ed32e64f6f373bdd8adc181c8ed1ca18c7d"

RPROVIDES:${PN} += "libQt6PdfWidgets.so.6()(64bit) \
libQt6PdfWidgets.so.6(Qt_6)(64bit) \
libQt6PdfWidgets.so.6(Qt_6.0)(64bit) \
libQt6PdfWidgets.so.6(Qt_6.1)(64bit) \
libQt6PdfWidgets.so.6(Qt_6.2)(64bit) \
libQt6PdfWidgets.so.6(Qt_6.3)(64bit) \
libQt6PdfWidgets.so.6(Qt_6.4)(64bit) \
libQt6PdfWidgets.so.6(Qt_6.5)(64bit) \
libQt6PdfWidgets.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6PdfWidgets6 \
libQt6PdfWidgets6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Pdf.so.6()(64bit) \
libQt6Pdf.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
