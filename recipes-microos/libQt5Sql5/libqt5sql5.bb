SUMMARY = "Qt 5 SQL related libraries"
DESCRIPTION = "Qt 5 libraries which are used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Sql5-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "d9a8f0796650d124ce2b0e188fec8ee7a9ef616fd3427c03d9a26cb3bd8a5e4a75650a1a659cf6eb8df06d4a6bbcb163b50447728ac2b4ab2e2798afac292c1a"

RPROVIDES:${PN} += "libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Sql.so.5(Qt_5.0)(64bit) libQt5Sql.so.5(Qt_5.1)(64bit) libQt5Sql.so.5(Qt_5.10)(64bit) libQt5Sql.so.5(Qt_5.11)(64bit) libQt5Sql.so.5(Qt_5.12)(64bit) libQt5Sql.so.5(Qt_5.13)(64bit) libQt5Sql.so.5(Qt_5.14)(64bit) libQt5Sql.so.5(Qt_5.15)(64bit) libQt5Sql.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Sql.so.5(Qt_5.2)(64bit) libQt5Sql.so.5(Qt_5.3)(64bit) libQt5Sql.so.5(Qt_5.4)(64bit) libQt5Sql.so.5(Qt_5.5)(64bit) libQt5Sql.so.5(Qt_5.6)(64bit) libQt5Sql.so.5(Qt_5.7)(64bit) libQt5Sql.so.5(Qt_5.8)(64bit) libQt5Sql.so.5(Qt_5.9)(64bit) libQt5Sql5 libQt5Sql5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Core5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
