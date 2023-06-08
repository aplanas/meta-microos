SUMMARY = "WPA supplicant graphical front-end"
DESCRIPTION = "This package contains a graphical front-end to wpa_supplicant, an \
implementation of the WPA Supplicant component."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "wpa_supplicant-gui-2.10-4.4.aarch64.rpm"
RPM_HASH = "75236c2ce517a2bf0ca9461799d5dd50e7c8c21e66d3e3b4a2f08f0ef12f9762a3edfe55c4313b52e8c63d824a96f767c6590f2887f742792654ca810d5a051d"

RPROVIDES:${PN} += "wpa_supplicant-gui wpa_supplicant-gui(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) wpa_supplicant"

inherit rpm
