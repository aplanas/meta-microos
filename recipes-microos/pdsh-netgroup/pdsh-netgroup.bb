SUMMARY = "Netgroup plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes to run on from netgroups."
LICENSE = "GPL-2.0-or-later"

PV = "2.34"

RPM_NAME = "pdsh-netgroup-2.34-10.2.aarch64.rpm"
RPM_HASH = "0355eb200e6cc1a545b568670f778c64045867ad2a74499cfc5d4c5cb5777d32bc6f68f94cba28857e3d244f47cd7a92abaa3004893244d1c27ddd6cb7d80aa5"

RPROVIDES:${PN} += "pdsh-netgroup pdsh-netgroup(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) pdsh"

inherit rpm
