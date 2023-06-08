SUMMARY = "FRRouting snmp library"
DESCRIPTION = "This library contains part of the net-snmp agentx implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrsnmp0-8.4-3.1.aarch64.rpm"
RPM_HASH = "97774695f1701eb9de39657938143a26e8a1691a851518b92697e77a85a7481c8431b2d6ed0a03fb4c8a5c5070724b7f72bfeadbf92b2a1843ee78371b30ce17"

RPROVIDES:${PN} += "libfrrsnmp.so.0()(64bit) libfrrsnmp0 libfrrsnmp0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) libnetsnmp.so.40()(64bit) libnetsnmpagent.so.40()(64bit)"

inherit rpm
