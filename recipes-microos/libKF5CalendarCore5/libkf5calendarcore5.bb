SUMMARY = "Library to access to and handle calendar data"
DESCRIPTION = "KCalendarCore is a library to provide access to and handling of calendar data. \
It supports the standard formats iCalendar and vCalendar and the group \
scheduling standard iTIP."
LICENSE = "LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5CalendarCore5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "5e6ad924493496f6e9d4848418a74eea1b03a926d6687f4c1c7cb360f50ee2d607aec677ff2882683747ab615dd8bf508c42213c7a9a515b94b93e758e43d154"

RPROVIDES:${PN} += "libKF5CalendarCore.so.5()(64bit) libKF5CalendarCore5 libKF5CalendarCore5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libical.so.3()(64bit) libicalss.so.3()(64bit) libicalvcal.so.3()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
