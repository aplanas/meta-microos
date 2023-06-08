SUMMARY = "Reminder daemon client"
DESCRIPTION = "Kalendarac is a reminder daemon client for calendar events."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kalendarac-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "1380b1a9c4de773357a424a1ec7134b2b9a217a24783f9dfa7014a27f9239cd7e58bf7884072d1e9d3afa77e717156a6a137c665799ca01dfd7afa1e3dd71120"

RPROVIDES:${PN} += "kalendarac kalendarac(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CalendarCore.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Service.so.5()(64bit) libKPim5AkonadiCalendar.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
