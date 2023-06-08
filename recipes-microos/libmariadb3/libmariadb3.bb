SUMMARY = "MariaDB connector in C"
DESCRIPTION = "MariaDB Connector is used to connect applications developed in \
C or C++ to MariaDB and MySQL databases. This is a different \
implementation from the traditional libmariadbclient/libmysqlclient \
that is shipped with mariadb-server/mysql-server, but the API is the same. \
 \
This package holds the runtime components."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.4"

RPM_NAME = "libmariadb3-3.3.4-1.3.aarch64.rpm"
RPM_HASH = "3048ba58f1de999d32f632bb298317e4abccee73c5596cb1c243d6c7d1f721433c48663448744a2f1d92eda97220c42ed30985b17e12f94f57034171c766fef1"

RPROVIDES:${PN} += "libmariadb.so.3()(64bit) libmariadb.so.3(libmariadb_3)(64bit) libmariadb.so.3(libmariadbclient_18)(64bit) libmariadb.so.3(libmysqlclient_18)(64bit) libmariadb3 libmariadb3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libz.so.1()(64bit)"

inherit rpm
