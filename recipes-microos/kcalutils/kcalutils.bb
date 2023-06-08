SUMMARY = "Library with utility functions for handling calendar data"
DESCRIPTION = "This library provides a set of utility functions that help \
applications access and use calendar data via the KCalCore library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kcalutils-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "3b76e10f0bd029a57f91abd00203de52660075f0f1beadd46d75e9914cef7c41f510737a05580de7c0f668e7a4e6bedbfc9b71a354fd9af5791efa669e63e6ff"

RPROVIDES:${PN} += "kcalutils kcalutils(aarch-64)"
RDEPENDS:${PN} += "grantlee5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGrantlee_Templates.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKPim5CalendarUtils.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
