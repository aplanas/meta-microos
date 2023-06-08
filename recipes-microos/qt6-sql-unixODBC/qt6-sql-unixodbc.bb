SUMMARY = "Qt 6 unixODBC plugin"
DESCRIPTION = "A plugin to connect to an ODBC driver manager in Qt applications and \
access the available data sources. Note that you also need to install \
and configure ODBC drivers for the ODBC driver manager that is \
installed on your system."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-sql-unixODBC-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "54b4443a2fe7058e4e5934da261b458dee7106df5b0242e25c72799bd767466258d26ab4839f40c1e56fa61217d487b0e58288488592c14b31032a50d33207af"

RPROVIDES:${PN} += "libqsqlodbc.so()(64bit) libqsqlodbc.so(Qt_6)(64bit) libqsqlodbc.so(Qt_6.0)(64bit) libqsqlodbc.so(Qt_6.1)(64bit) libqsqlodbc.so(Qt_6.2)(64bit) libqsqlodbc.so(Qt_6.3)(64bit) libqsqlodbc.so(Qt_6.4)(64bit) libqsqlodbc.so(Qt_6.5)(64bit) libqsqlodbc.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-sql-unixODBC qt6-sql-unixODBC(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Sql.so.6()(64bit) libQt6Sql.so.6(Qt_6)(64bit) libQt6Sql.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Sql6 libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libodbc.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
