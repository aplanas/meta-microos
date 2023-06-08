SUMMARY = "Qt Frontend for Marble"
DESCRIPTION = "The Qt frontend for the Marble map viewer"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "marble-qt-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "aacbdc891d2b43208c5f74b945ef8f525006d56ef5169a4425eb5cfead2d73d1537195921ec064fc059ca950b9fc09e4da3c6f7a0a0041ad9b745ec0f0e65b50"

RPROVIDES:${PN} += "application() application(org.kde.marble-qt.desktop) marble-frontend marble-qt marble-qt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libmarblewidget-qt5.so.28()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) marble"

inherit rpm
