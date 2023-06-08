SUMMARY = "SNMP support for syslog-ng"
DESCRIPTION = "This package provides SNMP support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.0.1"

RPM_NAME = "syslog-ng-snmp-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "0691f64b331c1e3ee2f0ddbc311ceadce7ada63454978cd928a94ff83d3d5562c63a2df09cfa01366e694666d18d2ac06dd93a53a6a2b5c3993e80fe31ef1e70"

RPROVIDES:${PN} += "libafsnmp.so()(64bit) syslog-ng-snmp syslog-ng-snmp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libnetsnmp.so.40()(64bit) libsyslog-ng-4.0.so.0()(64bit) syslog-ng"

inherit rpm
