SUMMARY = "Qt5 Configuration Tool"
DESCRIPTION = "This applications allows users to configure Qt5 settings (theme, \
font, icons, etc.) under DE/WM without Qt integration."
LICENSE = "BSD-2-Clause"

PV = "1.5"

RPM_NAME = "qt5ct-1.5-1.16.aarch64.rpm"
RPM_HASH = "2e3b85773bd31165aa64ad9bb868d7bf1d02145440371f47b291938dbefd8036ba390fd1644951393687d3dafd04defecbe469a119660041457e4d15840bfcae"

RPROVIDES:${PN} += "application() application(qt5ct.desktop) config(qt5ct) libqt5-qtct libqt5ct-style.so()(64bit) libqt5ct.so()(64bit) qt5ct qt5ct(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Gui5 libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
