SUMMARY = "TNEF Support"
DESCRIPTION = "This package contains the TNEF support library for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5Tnef5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "a845826ba69bce72fb2fba1e6be1c42a136541a1d070891190f7cc337e0b69f5d241405f9fc445033714a9fbdb23ce791fdcdeb1017d0cf6a3ac1f51d408fcbc"

RPROVIDES:${PN} += "libKPim5Tnef.so.5()(64bit) libKPim5Tnef5 libKPim5Tnef5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CalendarCore.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5I18n.so.5()(64bit) libKPim5CalendarUtils.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
