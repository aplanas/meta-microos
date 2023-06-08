SUMMARY = "LeechCraft Web Browser Module"
DESCRIPTION = "This package provides a WebEngine-based web browser plugin for LeechCraft. \
Poshuku is extensible with plugins. \
 \
Currently it features: \
 * integration with other plugins; \
 * autodiscovery; \
 * tagging bookmarks; \
 * support for SQLite or PostgreSQL storage."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "b453bc35e91a9950a333e27834fcc952aee8e7d42fecbb13a02075383d5cb432a07a8f7a871c4d879f82ff0b5752c19003d55529b809c91aef540ab9a468acc1"

RPROVIDES:${PN} += "leechcraft-poshuku leechcraft-poshuku(aarch-64) libleechcraft_poshuku.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft leechcraft-poshuku-backend libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libidn.so.12()(64bit) libidn.so.12(LIBIDN_1.0)(64bit) libleechcraft-util-db-qt5.so.0.6.75.1()(64bit) libleechcraft-util-gui-qt5.so.0.6.75.1()(64bit) libleechcraft-util-models-qt5.so.0.6.75.1()(64bit) libleechcraft-util-network-qt5.so.0.6.75.1()(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-util-shortcuts-qt5.so.0.6.75()(64bit) libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) libleechcraft-util-tags-qt5.so.0.6.75.1()(64bit) libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) libleechcraft-util-xsd-qt5.so.0.6.75()(64bit) libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
