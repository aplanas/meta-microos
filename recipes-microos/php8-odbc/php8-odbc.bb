SUMMARY = "ODBC extension for PHP"
DESCRIPTION = "This module adds Open Database Connectivity (ODBC) support."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-odbc-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "8189cfe0c7301bc902a0ae90b5470bf043ef4a73eebaf093ddef225c41c4e32d50d0d96820d0b072fee2633b6041e1f622834cef4bd395cf737225a5b6139a56"

RPROVIDES:${PN} += "config(php8-odbc) php-odbc php-pdo_odbc php8-odbc php8-odbc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libodbc.so.2()(64bit) php php-pdo"

inherit rpm
