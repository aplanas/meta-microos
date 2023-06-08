SUMMARY = "Library for KDE's Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5Activities5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "458357c0af0fde78259eefe208bf6800f3f79c9c96fb100eaf8f37e7ab6c8ad44bcddcdcbcfa6e767328330df0aeb72277efdbbcda56168deaf879d4948899f1"

RPROVIDES:${PN} += "libKF5Activities.so.5()(64bit) libKF5Activities5 libKF5Activities5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
