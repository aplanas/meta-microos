SUMMARY = "The library for the Database Connectivity and Creation Framework"
DESCRIPTION = "The library for the database connectivity and creation framework for various database vendors"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "libKDb3-4-3.2.0-7.16.aarch64.rpm"
RPM_HASH = "56548e22f7f9cf464fc6c4927aa741c055967771b73f7fcb7959342d9d9a469668eeb17e11492976e2c83c1e580a20e1ef1015509fa44a23970716f646559543"

RPROVIDES:${PN} += "kdb libKDb3-4 libKDb3-4(aarch-64) libKDb3.so.4()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libicui18n.so.72()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
