SUMMARY = "SNMP extension for PHP"
DESCRIPTION = "The SNMP extension provides a toolset for managing remote devices via \
the Simple Network Management Protocol. \
 \
As it is a wrapper around the underlying Net-SNMP library, all basic \
concepts are the same and the PHP functions change their behavior \
depending on the Net-SNMP configuration files and environment \
variables."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-snmp-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "662070eea6de10e10eaba7f5bd90a2987eb1d3e7d70a5b9befcc667e041df5dd58ee080e7598088004336d9437870802c5c0486758f1f3d13e958cb64e658657"

RPROVIDES:${PN} += "config(php8-snmp) php-snmp php8-snmp php8-snmp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libnetsnmp.so.40()(64bit) php"

inherit rpm
