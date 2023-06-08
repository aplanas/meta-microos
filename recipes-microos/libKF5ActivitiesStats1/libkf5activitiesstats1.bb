SUMMARY = "Library for KDE's Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5ActivitiesStats1-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "edf6778d895bf4497336e9e70ad10c818a6d4b3d946c62b55857ff4e04f9c69750a7adc4e1ee4ec0b1a82a6d78c98e9133843fbf9a0e8390cadd54bec4f90bc8"

RPROVIDES:${PN} += "libKF5ActivitiesStats.so.1()(64bit) libKF5ActivitiesStats1 libKF5ActivitiesStats1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Activities.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit)"

inherit rpm
