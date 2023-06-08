SUMMARY = "A PPP Over Ethernet Redirector for PPPD"
DESCRIPTION = "rp-pppoe is a user-space redirector which permits the use of PPPoE \
(Point-to-Point Protocol Over Ethernet) with Linux. PPPoE is used by \
many ADSL service providers."
LICENSE = "GPL-2.0-or-later"

PV = "3.15"

RPM_NAME = "rp-pppoe-3.15-3.3.aarch64.rpm"
RPM_HASH = "d63e1951f42e22816620977c311a4ea56743cbd4e5b8cc7854ef3654033c684cf2b6b492217086b1317ee4bb5825b2f2b36b9d49028192da6822d0dc869720e7"

RPROVIDES:${PN} += "config(rp-pppoe) rp-pppoe rp-pppoe(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh group(dialout) iproute2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) permissions ppp"

inherit rpm
