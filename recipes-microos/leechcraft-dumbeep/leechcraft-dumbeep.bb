SUMMARY = "LeechCraft DumBeep Module"
DESCRIPTION = "This package provides a dumb sound notifier plugin for LeechCraft. \
 \
It uses Phonon as a backend, or something like aplay/mplayer."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-dumbeep-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "2d68d3ae6b1f282152d2ccbf19f4439d8fb2b70f1cd311cc9024566dcd99e476a487c827d40f2be036f46a5557d6b780fd44ecf257fe1725c23957cdd23e4b29"

RPROVIDES:${PN} += "leechcraft-dumbeep leechcraft-dumbeep(aarch-64) leechcraft-soundnotifications libleechcraft_dumbeep.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
