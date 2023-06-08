SUMMARY = "FictionBook support for LeechCraft Monocle"
DESCRIPTION = "This package contains the FictionBook subplugin for LeechCraft Monocle."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-fxb-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "1713893fa5fd42533582908b3983ca6fdbd22fb545d9b82652a98449919630ef79d74e110e8a9c7ad633a542c1c632eb2bc9b06bdb80b3ef7214b61783ca9626"

RPROVIDES:${PN} += "application() application(leechcraft-monocle-fxb-qt5.desktop) leechcraft-monocle-fxb leechcraft-monocle-fxb(aarch-64) leechcraft-monocle-subplugin libleechcraft_monocle_fxb.so()(64bit) mimehandler(application/x-fictionbook+xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft leechcraft-monocle libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) libleechcraft_monocle.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
