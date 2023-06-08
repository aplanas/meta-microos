SUMMARY = "Check status of an HP printer"
DESCRIPTION = "This plugin tests the STATUS of an HP printer with a JetDirect card."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-hpjd-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "357f1b5f64851ff25de96692c1a416f53f1c323b4205755932f39ede5e2d3ab54ecbaef76eeb97e83866cda84c00b26d853bffd395a78463712dc4b0834c68d6"

RPROVIDES:${PN} += "monitoring-plugins-hpjd monitoring-plugins-hpjd(aarch-64) nagios-plugins-hpjd"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) net-snmp"

inherit rpm
