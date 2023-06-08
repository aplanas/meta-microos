SUMMARY = "LeechCraft Poshuku WebEngine-based backend Module"
DESCRIPTION = "This package provides WebEngine-based backend for LeechCraft Poshuku browser."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-webengineview-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "3d20f9af10951047bd9f1f6c09dabe19a3a6384f4eaf45ff4de5455e320d6208d33cca4f67c644edb0b182d12cebddb584d080de39f9ec5975a0ef6de7c87d2a"

RPROVIDES:${PN} += "leechcraft-poshuku-backend leechcraft-poshuku-webengineview leechcraft-poshuku-webengineview(aarch-64) libleechcraft_poshuku_webengineview.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft-poshuku libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5WebChannel.so.5()(64bit) libQt5WebChannel.so.5(Qt_5)(64bit) libQt5WebEngineCore.so.5()(64bit) libQt5WebEngineCore.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-db-qt5.so.0.6.75.1()(64bit) libleechcraft-util-gui-qt5.so.0.6.75.1()(64bit) libleechcraft-util-network-qt5.so.0.6.75.1()(64bit) libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
