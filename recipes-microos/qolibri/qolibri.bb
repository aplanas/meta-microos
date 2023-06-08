SUMMARY = "EPWING Dictionary Viewer"
DESCRIPTION = "qolibri is a dictionary viewer for the proprietary EPWING dictionary format \
(originally developed for electronic pocket dictionaries). Most monolingual \
Japanese dictionaries can only be found in the EPWING format."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.4"

RPM_NAME = "qolibri-2.1.4-1.9.aarch64.rpm"
RPM_HASH = "48eca80649b880cf4a81e964eccad6b2d99143431aa4015197eba49d94f363ace59eec5a06a5ad70798bbd20ea2d7c6cf569e2eac66e4f18c06d2f4171b6372b"

RPROVIDES:${PN} += "application() application(qolibri.desktop) qolibri qolibri(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libeb.so.16()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
