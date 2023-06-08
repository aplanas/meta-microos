SUMMARY = "LeechCraft Azoth Ignore Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth to ignore \
unwanted participants."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-depester-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "020ebc98a17190e8f3b90ac1355e1ceafd87bfee417d60cde2043ea61af0bf8f73571e08352522a4020c6e8727897ad2e3bf160cf99f09492b46e2e01dcfcf2f"

RPROVIDES:${PN} += "leechcraft-azoth-depester leechcraft-azoth-depester(aarch-64) libleechcraft_azoth_depester.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft-azoth libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
