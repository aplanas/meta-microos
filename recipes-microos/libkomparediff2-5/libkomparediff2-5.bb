SUMMARY = "A library to compare files and strings"
DESCRIPTION = "A library to compare files and strings, used in Kompare and KDevelop."
LICENSE = "(GPL-2.0-or-later & LGPL-2.0-or-later) & BSD-2-Clause"

PV = "23.04.0"

RPM_NAME = "libkomparediff2-5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "912fcfcdf3c9beae60edb6fcfe12d9066391069952fe03beeec738d443a90255edac8a3b8c310a68496536afb14678f4fac839adb7bd9792918683088355b843"

RPROVIDES:${PN} += "libkomparediff2 libkomparediff2-5 libkomparediff2-5(aarch-64) libkomparediff2.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
