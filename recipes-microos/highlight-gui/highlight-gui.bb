SUMMARY = "Graphical Interface for highlight"
DESCRIPTION = "This package provides graphical interface for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.5"

RPM_NAME = "highlight-gui-4.5-1.3.aarch64.rpm"
RPM_HASH = "b0e1db56ec9beacf713b8c0c176aad5ff25c9f9bd5c2fd62fa5de81a2299f824254cf176f3aa41f7c3ffca5178cdfa2e3001c3d4bfa811dcce0c7ca8b37ba662"

RPROVIDES:${PN} += "application() application(highlight.desktop) highlight-gui highlight-gui(aarch-64)"
RDEPENDS:${PN} += "highlight-common ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) liblua5.4.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
