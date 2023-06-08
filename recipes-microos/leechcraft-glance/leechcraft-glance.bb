SUMMARY = "LeechCraft Opened tabs overview Module"
DESCRIPTION = "This package provides a tabs overview plugin for Leechcraft \
which shows a grid of overview thumbnails."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-glance-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "ce4a7e3b30fcf6383b3a386996eedb365915fe70f6b3ac91cd1a913a7dfcfd1d1489025cdbbd84188deba2d30e723a35f12a9ada6219a7597fcba26ebc362713"

RPROVIDES:${PN} += "leechcraft-glance leechcraft-glance(aarch-64) libleechcraft_glance.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
