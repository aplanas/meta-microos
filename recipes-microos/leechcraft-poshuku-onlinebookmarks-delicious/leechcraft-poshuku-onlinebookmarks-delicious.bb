SUMMARY = "LeechCraft Poshuku Onlinebookmarks Delicious Module"
DESCRIPTION = "This package contains a plugin for LeechCraft Poshuku Online Bookmarks \
to support the Del.icio.us service."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-onlinebookmarks-delicious-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "26db49d7450d10d7d590d5fbd7a0d1d52f380aae7754edb48668bd3a2e180cc92d18e06439be8b7451919c2c9554c70ab6d950a17d73664363858d99a25c148d"

RPROVIDES:${PN} += "leechcraft-poshuku-onlinebookmarks-delicious leechcraft-poshuku-onlinebookmarks-delicious(aarch-64) libleechcraft_poshuku_onlinebookmarks_delicious.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft-poshuku-onlinebookmarks libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
