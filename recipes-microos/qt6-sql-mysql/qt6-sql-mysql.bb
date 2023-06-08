SUMMARY = "Qt 6 MySQL support"
DESCRIPTION = "A plugin to access MySQL servers in Qt applications."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-sql-mysql-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "e513b7ed3d40073b986e8772ce1b28be9a5fbd4a0516756bc4fe3ab4d791dadcdf6e88235caf412cf4f9a71c94aab1466d78c54b691a309cb0959dd32710d9b6"

RPROVIDES:${PN} += "libqsqlmysql.so()(64bit) libqsqlmysql.so(Qt_6)(64bit) libqsqlmysql.so(Qt_6.0)(64bit) libqsqlmysql.so(Qt_6.1)(64bit) libqsqlmysql.so(Qt_6.2)(64bit) libqsqlmysql.so(Qt_6.3)(64bit) libqsqlmysql.so(Qt_6.4)(64bit) libqsqlmysql.so(Qt_6.5)(64bit) libqsqlmysql.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-sql-mysql qt6-sql-mysql(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Sql.so.6()(64bit) libQt6Sql.so.6(Qt_6)(64bit) libQt6Sql.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Sql6 libc.so.6(GLIBC_2.17)(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmariadb_3)(64bit) libmariadb.so.3(libmysqlclient_18)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
