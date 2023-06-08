SUMMARY = "Qt5 wrapper for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "libpoppler-qt5-1-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "90f0413b34ad2e326117f7c1910b9c5e3601aef44ce6e060bca0dcd25f4a6effcd203f26f7bff10809ce241ab035ef578f90ea07674018a5ace40d23956bdcd0"

RPROVIDES:${PN} += "libpoppler-qt5-1 libpoppler-qt5-1(aarch-64) libpoppler-qt5.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libfreetype.so.6()(64bit) liblcms2.so.2()(64bit) libpoppler.so.127()(64bit) libpoppler127 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
