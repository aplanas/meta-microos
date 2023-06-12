SUMMARY = "SNMP extension for PHP"
DESCRIPTION = "The SNMP extension provides a toolset for managing remote devices via \
the Simple Network Management Protocol. \
 \
As it is a wrapper around the underlying Net-SNMP library, all basic \
concepts are the same and the PHP functions change their behavior \
depending on the Net-SNMP configuration files and environment \
variables."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-snmp-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "23d77425ba2a5f631833f10faf8a78561e498d8535bf155f10207d450bd21701682536c2fdbf9517984c9225ececcd55031752349be8b5c412d03a5e3f10c204"

RPROVIDES:${PN} += "config(php8-snmp) \
php-snmp \
php8-snmp \
php8-snmp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libnetsnmp.so.40()(64bit) \
php"

inherit rpm
