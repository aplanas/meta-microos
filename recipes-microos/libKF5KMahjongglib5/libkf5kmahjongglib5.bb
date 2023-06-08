SUMMARY = "Library for Mahjongg tiles"
DESCRIPTION = "This package contains the library for Mahjongg tiles."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKF5KMahjongglib5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "8577c30fce008db5ddaa2df94e17d9795c6d06c92b1274892ef23c3c54859208e9fcc6593a8e5b42c7efefa2013ba96ba8f4d3870979dbaae60afb4932c1f939"

RPROVIDES:${PN} += "libKF5KMahjongglib.so.5()(64bit) libKF5KMahjongglib5 libKF5KMahjongglib5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libkmahjongg libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
