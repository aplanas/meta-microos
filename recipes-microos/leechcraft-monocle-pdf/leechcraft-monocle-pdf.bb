SUMMARY = "PDF support for LeechCraft Monocle"
DESCRIPTION = "This package contains the PDF subplugin for LeechCraft Monocle. \
PDF support is provided via the libpoppler backend."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-pdf-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "b775a84bbcd56adff63c819a2024898f222f5780613c539dab8f2ab28907780c7049cdcb0ec1db7ea2fde7915388e00d63ab6b9ed2a42abd68e62da7a02ee4b8"

RPROVIDES:${PN} += "application() application(leechcraft-monocle-pdf-qt5.desktop) leechcraft-monocle-pdf leechcraft-monocle-pdf(aarch-64) leechcraft-monocle-subplugin libleechcraft_monocle_pdf.so()(64bit) mimehandler(application/x-pdf)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft leechcraft-monocle libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) libpoppler-qt5.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit)"

inherit rpm
