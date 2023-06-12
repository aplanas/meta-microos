SUMMARY = "ODBC extension for PHP"
DESCRIPTION = "This module adds Open Database Connectivity (ODBC) support."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-odbc-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "d045790a477a03e60c2bc9d88c6eb57cbba93eb2231d958eafae3755f9c45ddb361dd50ccd6be7f02e01ef69f0c1efd8538f99b0ebd92eb90087cf317e1f9211"

RPROVIDES:${PN} += "config(php8-odbc) \
php-odbc \
php-pdo_odbc \
php8-odbc \
php8-odbc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libodbc.so.2()(64bit) \
php \
php-pdo"

inherit rpm
