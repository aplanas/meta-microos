SUMMARY = "PHP extension providing access to maxminddb databases"
DESCRIPTION = "This extension provides access to maxminddb databases and is \
a drop-in replacement for MaxMind\\Db\\Reader."
LICENSE = "Apache-2.0"

PV = "1.11.0"

RPM_NAME = "php8-maxminddb-1.11.0-2.3.aarch64.rpm"
RPM_HASH = "48c31fe98a369b2a52f4bb2155840618cde57a7ff5fd59c29288c9403002208c91e5eaab06cc44d9c3796d05b4619a1198f53b071e57ab2ea9e2864cf1ee05c7"

RPROVIDES:${PN} += "config(php8-maxminddb) php-maxminddb php8-maxminddb php8-maxminddb(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmaxminddb.so.0()(64bit) php(api) php(zend-abi)"

inherit rpm
