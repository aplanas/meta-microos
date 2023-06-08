SUMMARY = "Bignum extension for PHP"
DESCRIPTION = "PHP functions for work with arbitrary-length integers using the GNU MP \
library."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-gmp-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "5cda2b845074bdd804721f15c2ba7f0b53710ded53915f57429174be1b982b0ffe723177de816d2ec0216cc361da9ffdc1085354e34a771810c37b062f02e6cb"

RPROVIDES:${PN} += "config(php8-gmp) php-gmp php8-gmp php8-gmp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) php"

inherit rpm
