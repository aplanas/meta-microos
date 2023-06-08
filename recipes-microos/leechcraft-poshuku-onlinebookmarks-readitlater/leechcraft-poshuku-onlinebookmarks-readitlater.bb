SUMMARY = "LeechCraft Poshuku Onlinebookmarks ReadItLater Module"
DESCRIPTION = "This package contains a plugin for LeechCraft Poshuku Online Bookmarks \
to support the Read it Later service."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-onlinebookmarks-readitlater-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "b4fb2bd0dc3ccdacfd747deab58619eb644eb7ceb9212596ed2f0e9c2675b7d85dcd979028bfe5fad6bf9b55ed46357efaaff134f7f33a0897ef94fb76140f9b"

RPROVIDES:${PN} += "leechcraft-poshuku-onlinebookmarks-readitlater leechcraft-poshuku-onlinebookmarks-readitlater(aarch-64) libleechcraft_poshuku_onlinebookmarks_readitlater.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft-poshuku-onlinebookmarks libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
