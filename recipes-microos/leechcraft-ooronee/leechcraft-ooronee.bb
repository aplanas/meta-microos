SUMMARY = "LeechCraft Text and Images Handler Module"
DESCRIPTION = "This package provides a Leechcraft quark handling text and images \
dropped on it. \
 \
The dropped data is then sent to a data filter chosen by the user. \
See more at http://leechcraft.org/concepts-data-filters ."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-ooronee-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "009314877d1968ad4957cd2018da884c5268d999f58060098d3b44652621cf900fc30651fe13ed504f92fc5089ccbb81125f2053d824a6d66d742dabde93720c"

RPROVIDES:${PN} += "leechcraft-ooronee leechcraft-ooronee(aarch-64) libleechcraft_ooronee.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft-sb2 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2)"

inherit rpm
