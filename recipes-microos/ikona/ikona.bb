SUMMARY = "Icon Preview designed for Plasma"
DESCRIPTION = "A utility to preview icons as they are being made."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "ikona-0.7.1-1.15.aarch64.rpm"
RPM_HASH = "cea6b4a8058f07db69fa8733181ed931ba806a4286dcccd2f9a9ba9675044251f084eeca536cb3e63c37ba5a422d16a87f6114631976362f4d1ecbe8a3e88f1a"

RPROVIDES:${PN} += "application() application(me.appadeia.ikona.desktop) ikona ikona(aarch-64) metainfo() metainfo(me.appadeia.ikona.appdata.xml) mimehandler(image/svg+xml)"
RDEPENDS:${PN} += "kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5WebEngine.so.5()(64bit) libQt5WebEngine.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) plasma-framework-components"

inherit rpm
