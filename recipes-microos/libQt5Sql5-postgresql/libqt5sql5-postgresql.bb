SUMMARY = "Qt 5 PostgreSQL plugin"
DESCRIPTION = "The Qt SQL module uses driver plugins to communicate with the \
different database APIs. \
 \
The QPSQL driver supports version 7.3 and higher of the PostgreSQL \
server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Sql5-postgresql-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "fe340ef091f49c5d5cc145dc4488d80e6ab927cacc8e0c9622f9a65af71e1eeaf8efe41c0085c2670eccd615b098ecd45c198caad778386618f35bb48d1e4045"

RPROVIDES:${PN} += "libQt5Sql5-postgresql libQt5Sql5-postgresql(aarch-64) libqsqlpsql.so()(64bit) libqt5-sql-postgresql libqt5_sql_backend"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Sql.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Sql5 libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
