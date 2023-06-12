SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5CalendarEvents5-5.106.0-1.2.aarch64.rpm"
RPM_HASH = "e00b32ed1666bf1cfedbd29b02b1115e8b730719482e9560215a4db7a304c8bee7d74420a8eadd40205e89a5cf3b0cb790e22db7723d5123543d5ca4c4dd08c5"

RPROVIDES:${PN} += "libKF5CalendarEvents.so.5()(64bit) \
libKF5CalendarEvents5 \
libKF5CalendarEvents5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
