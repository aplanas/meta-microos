SUMMARY = "TNEF Support"
DESCRIPTION = "This package contains the TNEF support library for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5Tnef5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f36942cdf19211a9b61231bc41d8167c5dd67385a5ff63c31df87c01520916d97921107b448bd76a807d0d1fca50c8761a40c7361baade44bb6f1ac0b9391aa9"

RPROVIDES:${PN} += "libKPim5Tnef.so.5()(64bit) \
libKPim5Tnef5 \
libKPim5Tnef5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5Contacts.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKPim5CalendarUtils.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
