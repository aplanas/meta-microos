SUMMARY = "Authenticators library for LeechCraft"
DESCRIPTION = "A library providing authenticators for various services like VKontakte."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-svcauth-qt5-0_6_75-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "59a60008e1ffd290c61a86cee9b86a05159e564623d7976171bdff89e5b0a42cd0ecc9aa74137b75daf352fad737b441425ee9ed23580a35072ebbe12b2cb2ae"

RPROVIDES:${PN} += "libleechcraft-util-svcauth-qt5-0_6_75 libleechcraft-util-svcauth-qt5-0_6_75(aarch-64) libleechcraft-util-svcauth-qt5.so.0.6.75()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-network-qt5.so.0.6.75.1()(64bit) libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
