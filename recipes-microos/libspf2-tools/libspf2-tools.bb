SUMMARY = "Programs for making SPF queries using libspf2"
DESCRIPTION = "Programs for making SPF queries and checking their results using libspf2."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "libspf2-tools-1.2.11-6.12.aarch64.rpm"
RPM_HASH = "1e657d3d52c58bb7d4400b345f93b5bb5889056ae6c473fe78717706baf331486b5a316758839f006afee36ea0cf8f2d9274cc821692579ed97719eb774437b5"

RPROVIDES:${PN} += "libspf2-tools \
libspf2-tools(aarch-64) \
spf2"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libspf2.so.2()(64bit)"

inherit rpm
