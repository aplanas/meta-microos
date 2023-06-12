SUMMARY = "Qt 6 MySQL support"
DESCRIPTION = "A plugin to access MySQL servers in Qt applications."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-mysql-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c6df01964cbfe1048e3d6b4176a980cf3f4407edf269b8c9bb831c90965d0096ce48b68b0ee0250e915b7a4ebb259d620c52671523a48e69a5122098e3d16592"

RPROVIDES:${PN} += "libqsqlmysql.so()(64bit) libqsqlmysql.so(Qt_6)(64bit) libqsqlmysql.so(Qt_6.0)(64bit) libqsqlmysql.so(Qt_6.1)(64bit) libqsqlmysql.so(Qt_6.2)(64bit) libqsqlmysql.so(Qt_6.3)(64bit) libqsqlmysql.so(Qt_6.4)(64bit) libqsqlmysql.so(Qt_6.5)(64bit) libqsqlmysql.so(Qt_6.5.1_PRIVATE_API)(64bit) qt6-sql-mysql qt6-sql-mysql(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Sql.so.6()(64bit) libQt6Sql.so.6(Qt_6)(64bit) libQt6Sql.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Sql6 libc.so.6(GLIBC_2.17)(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmariadb_3)(64bit) libmariadb.so.3(libmysqlclient_18)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
