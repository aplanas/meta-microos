SUMMARY = "LeechCraft Azoth Metacontacts Module"
DESCRIPTION = "This package provides a metacontacts support plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-metacontacts-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "dca16208f8b175befde6ef08a4e3bcd284341c183bce2764e1ca354e69832721a37c6de8dba5b9c14b0840d710c50def92a80cb12720e997aa027a8acce6282f"

RPROVIDES:${PN} += "leechcraft-azoth-metacontacts leechcraft-azoth-metacontacts(aarch-64) libleechcraft_azoth_metacontacts.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft-azoth libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-gui-qt5.so.0.6.75.1()(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
