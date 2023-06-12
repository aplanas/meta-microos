SUMMARY = "SNMP support for syslog-ng"
DESCRIPTION = "This package provides SNMP support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-snmp-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "1a7195cf9792bd32e2da726c5f374c8aa637ad7168d2b89dc1e0e27fd5b389a50ffe34e3989cf100219ac32f661102e2068f86f97ffa93db654d418b4567619e"

RPROVIDES:${PN} += "syslog-ng-snmp syslog-ng-snmp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libnetsnmp.so.40()(64bit) libsyslog-ng-4.2.so.0()(64bit) syslog-ng"

inherit rpm
