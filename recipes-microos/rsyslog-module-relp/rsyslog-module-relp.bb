SUMMARY = "RELP protocol support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides Reliable Event Logging Protocol support."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-relp-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "cfd3158e313cfddb32652a36cad9991423b8d10003bc1aa87bb7134a8d00f5d001438abc6ea4207e45e7537feafc1ec79add922c44d3b786b9b3d0b1f2880c8a"

RPROVIDES:${PN} += "rsyslog-module-relp rsyslog-module-relp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) librelp.so.0()(64bit) rsyslog"

inherit rpm
