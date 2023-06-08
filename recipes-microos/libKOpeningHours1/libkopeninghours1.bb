SUMMARY = "OSM opening hours expression parser and evaluator"
DESCRIPTION = "A library for parsing and evaluating OSM opening hours expressions."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libKOpeningHours1-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "eec37b23adfc9d3d7b800b7b59cc1f1802d8d97ee9f6352140160188f6cbbdd00412c3e2c3791f2a51e3d93001d9cb793af57522b4ffa61e8d9c2be9937d603e"

RPROVIDES:${PN} += "libKOpeningHours.so.1()(64bit) libKOpeningHours1 libKOpeningHours1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Holidays.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
