SUMMARY = "Extra binaries from GNU C Library"
DESCRIPTION = "The glibc-extra package contains some extra binaries for glibc that \
are not essential but recommend for use. \
 \
makedb: A program to create a database for nss"
LICENSE = "LGPL-2.1-or-later"

PV = "2.37"

RPM_NAME = "glibc-extra-2.37-3.1.aarch64.rpm"
RPM_HASH = "5a26ad6ba754879c4cd20f016faa7d4142a01b923960bab8752baf3da57691323538e6c81cd374484a3f43842f5d52cc2dd8654f314d3db91d70fa41e97f90c3"

RPROVIDES:${PN} += "glibc-extra glibc-extra(aarch-64)"
RDEPENDS:${PN} += "glibc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit)"

inherit rpm
