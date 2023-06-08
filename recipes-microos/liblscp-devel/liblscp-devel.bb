SUMMARY = "LinuxSampler Control Protocol Library"
DESCRIPTION = "liblscp is an implementation of the LinuxSampler control protocol, \
proposed as a C language API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.9"

RPM_NAME = "liblscp-devel-0.9.9-1.1.aarch64.rpm"
RPM_HASH = "38cb9625dbc9b9f0d134e6893fa8f388160740bca183867f05daab2541a4ce1ae53df89b3274d07e734620b7791c8ec81233ac0577a8888612c129b850e7d517"

RPROVIDES:${PN} += "liblscp-devel liblscp-devel(aarch-64) pkgconfig(lscp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblscp6"

inherit rpm
