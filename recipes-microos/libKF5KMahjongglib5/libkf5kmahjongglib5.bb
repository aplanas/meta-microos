SUMMARY = "Library for Mahjongg tiles"
DESCRIPTION = "This package contains the library for Mahjongg tiles."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKF5KMahjongglib5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "dbfbf9fad87f3bf8a68a583bf1000c7c490ecda3dc1043ad7f8007843144fdec6908ae07d78f69afc5d789236e24fa620d7be68ce18bede20ed5c71665bc40d7"

RPROVIDES:${PN} += "libKF5KMahjongglib.so.5()(64bit) libKF5KMahjongglib5 libKF5KMahjongglib5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libkmahjongg libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
