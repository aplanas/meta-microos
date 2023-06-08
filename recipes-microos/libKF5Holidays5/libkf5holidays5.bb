SUMMARY = "Holiday API for KDE PIM"
DESCRIPTION = "This package contains a library which helps developers determining when holidays occur."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5Holidays5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "347cef06dbcbfea93e546c4bdbd43d0fa43820954ed1e86fc5c0c04450e129b50d1646b10a379c6a2492b8aadf986830f4a068b0602526982edb17558851daae"

RPROVIDES:${PN} += "kholidays-lang libKF5Holidays.so.5()(64bit) libKF5Holidays5 libKF5Holidays5(aarch-64) libkholidaysdeclarativeplugin.so()(64bit) qt5qmlimport(org.kde.kholidays.1)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
