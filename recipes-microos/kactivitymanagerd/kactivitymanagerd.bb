SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "kactivitymanagerd-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "f792fe330470e4bfccd18285c2840083e134cdd46c57cce98fb25a74cc0dfe14ded8db78c0ca49c8cc085f42b3ad3dec74df6e8a60df05f09c732901085469a8"

RPROVIDES:${PN} += "kactivities4 kactivities5 kactivitymanagerd kactivitymanagerd(aarch-64) libkactivitymanagerd_plugin.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5GlobalAccel.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Sql5-sqlite libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
