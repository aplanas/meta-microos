SUMMARY = "libkdepim Akonadi library"
DESCRIPTION = "The Mail Transport library for Akonadi related functions"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5MailTransportAkonadi5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "9a8a97ac369293d42b8dec02e5a53e29fecfc197dae7f6f7deeaa90e8acf8f398bf86069dd80c1a0ce2c43bb5a66acf5649f464c86a5fb60d15daf8c07087c12"

RPROVIDES:${PN} += "libKPim5MailTransportAkonadi.so.5()(64bit) libKPim5MailTransportAkonadi5 libKPim5MailTransportAkonadi5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig kmailtransport ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiMime.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
