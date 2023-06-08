SUMMARY = "Qt 5 sqlite plugin"
DESCRIPTION = "The Qt SQL module uses driver plugins to communicate with the \
different database APIs. \
 \
The Qt SQLite plugin makes it possible to access SQLite databases. \
SQLite is an in-process database, which means that it is not \
necessary to have a database server. SQLite operates on a single \
file, which must be set as the database name when opening a \
connection."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Sql5-sqlite-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "5112a868882ec2e27e5fcc329060b5621ebbba1db9e452b7e99deb31e32afba21e0ca35f3fca0a8c61f1de733c8d0d90f9e264476c2881329972a975f30d7d8d"

RPROVIDES:${PN} += "libQt5Sql5-sqlite libQt5Sql5-sqlite(aarch-64) libqsqlite.so()(64bit) libqt5-sql-sqlite libqt5_sql_backend"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Sql.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Sql5 libc.so.6(GLIBC_2.17)(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
