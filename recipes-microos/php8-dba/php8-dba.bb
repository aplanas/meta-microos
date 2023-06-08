SUMMARY = "Database abstraction layer for PHP"
DESCRIPTION = "This is a general abstraction layer for several file-based databases. \
As such, functionality is limited to a common subset of features \
supported by modern databases such as Sleepycat Software's DB2. (This \
is not to be confused with IBM's DB2 software, which is supported \
through the ODBC functions.)"
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-dba-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "1a77c1dc881c5c3b0188d50a602322fc24c39fee89845ca39d65013c4571b557641e0371a7692fce2f3909426f07b2a73ebd1d607e6bbc480c5c92877c452a20"

RPROVIDES:${PN} += "config(php8-dba) php-dba php8-dba php8-dba(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libdb-4.8.so()(64bit) liblmdb-0.9.30.so()(64bit) php"

inherit rpm
