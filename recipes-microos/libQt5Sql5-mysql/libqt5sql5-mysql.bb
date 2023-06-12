SUMMARY = "Qt 5 MySQL support"
DESCRIPTION = "A plugin to support MySQL server in Qt applications."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Sql5-mysql-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "1152a3f57ae109cb1b79ec3b7b5d0cafa79e18e528a88d7726784008968150122bff6784cb36737f4dc058f154e7fe11a684c8e90cc6329034af75853cefa088"

RPROVIDES:${PN} += "libQt5Sql5-mysql libQt5Sql5-mysql(aarch-64) libqsqlmysql.so()(64bit) libqt5-sql-mysql libqt5_sql_backend"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Sql.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Sql5 libc.so.6(GLIBC_2.17)(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmysqlclient_18)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
