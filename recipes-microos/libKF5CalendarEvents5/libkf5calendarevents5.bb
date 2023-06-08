SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5CalendarEvents5-5.105.0-1.2.aarch64.rpm"
RPM_HASH = "c4c1f37aeeea21a3e6418cce93cb6776605a0a4459a91333ab814b4cae49dd31225bb888e8e082b0086788dab0c9f7a4147ad2a7e8adafbe7f6b6e44d2697685"

RPROVIDES:${PN} += "libKF5CalendarEvents.so.5()(64bit) libKF5CalendarEvents5 libKF5CalendarEvents5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
