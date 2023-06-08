SUMMARY = "Development files for the MariaDB Connector C API"
DESCRIPTION = "MariaDB Connector is used to connect applications developed in \
C or C++ to MariaDB and MySQL databases. \
 \
This package holds the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.4"

RPM_NAME = "libmariadb-devel-3.3.4-1.3.aarch64.rpm"
RPM_HASH = "e4fd14754d03b1014cb7b4cb12466f12c7771a33d20a0fc9f0cb9c29a20a25fb40a276f54377b32a5ad57e66dbae2687385ff914bf1f72ee8693019913323412"

RPROVIDES:${PN} += "libmariadb-devel libmariadb-devel(aarch-64) libmysqlclient-devel mysql-devel pkgconfig(libmariadb) pkgconfig(mysqlclient)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libmariadb3 pkgconfig(openssl) pkgconfig(zlib)"

inherit rpm
