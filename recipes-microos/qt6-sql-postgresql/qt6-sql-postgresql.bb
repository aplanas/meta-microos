SUMMARY = "Qt 6 PostgreSQL plugin"
DESCRIPTION = "A plugin to access PostgreSQL servers in Qt applications. \
 \
The QPSQL driver supports version 9 and higher of the PostgreSQL \
server."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-sql-postgresql-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "a376f883f9571ba2eb3235593844a2e793c0f4b7658bbf166807273334b673958918c9d98386864e3151bd5d29cf40a946cd2d2798c0a6210cf616e7334613b8"

RPROVIDES:${PN} += "libqsqlpsql.so()(64bit) libqsqlpsql.so(Qt_6)(64bit) libqsqlpsql.so(Qt_6.0)(64bit) libqsqlpsql.so(Qt_6.1)(64bit) libqsqlpsql.so(Qt_6.2)(64bit) libqsqlpsql.so(Qt_6.3)(64bit) libqsqlpsql.so(Qt_6.4)(64bit) libqsqlpsql.so(Qt_6.5)(64bit) libqsqlpsql.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-sql-postgresql qt6-sql-postgresql(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Sql.so.6()(64bit) libQt6Sql.so.6(Qt_6)(64bit) libQt6Sql.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Sql6 libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
