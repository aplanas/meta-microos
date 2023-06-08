SUMMARY = "Qt6 wrapper for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "libpoppler-qt6-3-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "daeaa8765835612487d0cac83bef1e4cfdbb129665001befdc208d873656357fa99de623e6ecac0e3268f100d40ca7d8d9e742c328d350405f2e099907571e5b"

RPROVIDES:${PN} += "libpoppler-qt6-3 libpoppler-qt6-3(aarch-64) libpoppler-qt6.so.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.32)(64bit) libfreetype.so.6()(64bit) liblcms2.so.2()(64bit) libpoppler.so.127()(64bit) libpoppler127 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
