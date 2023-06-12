SUMMARY = "LeechCraft Pinned tabs Module"
DESCRIPTION = "This package provides a pinning tab module for LeechCraft with which \
it is possible to pin important tabs so that they occupy less space."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-pintab-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "091daa636c2e04c48baa7405771be2556b7556cb04d53227eb2f4557dd6f85e1d9086e61ad39c2d3672e31a3067f54894a4c220aa50ac65ef2c6fdc935806012"

RPROVIDES:${PN} += "leechcraft-pintab \
leechcraft-pintab(aarch-64) \
libleechcraft_pintab.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
