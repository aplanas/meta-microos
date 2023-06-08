SUMMARY = "Alternate, low-level shared memory implementation for PHP"
DESCRIPTION = "An extension created as an alternative to the sysvmsg module."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-shmop-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "55a68f6f7a66202e44b4e9af0e933e4988d2d1492a55e675a16e25d497fbaee6efcad6a3cd4d4b230cbfc176c741a62672b9818f31036137241632fce4dd0829"

RPROVIDES:${PN} += "config(php8-shmop) php-shmop php8-shmop php8-shmop(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php"

inherit rpm
