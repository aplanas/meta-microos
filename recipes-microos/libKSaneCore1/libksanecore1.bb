SUMMARY = "Qt interface for the SANE library for scanner hardware"
DESCRIPTION = "KSaneCore is a Qt-based interface for SANE library to control scanner hardware."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "libKSaneCore1-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "7143d402a4075a5aaaf880e88aabf5de11e6c60fa03751094f89ef676fbe2f25905ed3b29feb372f7d71d170f5c87509b81fbcecd050c7049f210f7d0db5a577"

RPROVIDES:${PN} += "ksanecore libKSaneCore.so.1()(64bit) libKSaneCore1 libKSaneCore1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libsane.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
