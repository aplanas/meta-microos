SUMMARY = "LeechCraft Poshuku URL Keyword Support Module"
DESCRIPTION = "This package provides an LeechCraft Poshuku module for URL keywords."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-keywords-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "dc514d1aff9155a8017e52af12dcedb72c29cd75d32c40c2b2ccf76c0751b1d9b54edffddd254148cc501f5f252ccf19298bad06fe02cc21b880e9874639f9e9"

RPROVIDES:${PN} += "leechcraft-poshuku-keywords \
leechcraft-poshuku-keywords(aarch-64) \
libleechcraft_poshuku_keywords.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft-poshuku \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
