SUMMARY = "Qt 6 SQLite plugin"
DESCRIPTION = "A plugin to access SQLite databases in Qt applications. \
 \
SQLite is an in-process database, which means that it is not \
necessary to have a database server. SQLite operates on a single \
file, which must be set as the database name when opening a \
connection."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-sql-sqlite-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "ca8bf0d9a1090cb88c1a889d680479d354786c4b33a0b0a390ecb9699ac5005b53e83b1de79dc41cdcfad4b47bcb3b00e4ee284ca23c47354a1ea9ab6d254f96"

RPROVIDES:${PN} += "libqsqlite.so()(64bit) libqsqlite.so(Qt_6)(64bit) libqsqlite.so(Qt_6.0)(64bit) libqsqlite.so(Qt_6.1)(64bit) libqsqlite.so(Qt_6.2)(64bit) libqsqlite.so(Qt_6.3)(64bit) libqsqlite.so(Qt_6.4)(64bit) libqsqlite.so(Qt_6.5)(64bit) libqsqlite.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-sql-sqlite qt6-sql-sqlite(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Sql.so.6()(64bit) libQt6Sql.so.6(Qt_6)(64bit) libQt6Sql.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Sql6 libc.so.6(GLIBC_2.17)(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
