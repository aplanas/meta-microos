SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5GAPITasks5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "612652186aeeb3b1129a75a0ece55a6cbc42b656934833b806b92e2c743890438923cd6371ba4a37c5649683fd6e6f3f0bdc960ecca961745f986a37b1a029a3"

RPROVIDES:${PN} += "libKPim5GAPITasks.so.5()(64bit) libKPim5GAPITasks5 libKPim5GAPITasks5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CalendarCore.so.5()(64bit) libKPim5GAPICore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
