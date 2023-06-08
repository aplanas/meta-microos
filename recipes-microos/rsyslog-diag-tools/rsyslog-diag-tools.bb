SUMMARY = "Diagnostic tools"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This package provides additional diagnostic tools (small helpers, \
usually not needed)."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-diag-tools-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "40633dfd067e16bb93ced39272bf9393557a3278cb5066cc362d83cffb1b99d929a900d649349d55456f2dffcf515c8374d78b20e8f3c03cd848cb6ce82d0b9d"

RPROVIDES:${PN} += "rsyslog-diag-tools rsyslog-diag-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) rsyslog"

inherit rpm
