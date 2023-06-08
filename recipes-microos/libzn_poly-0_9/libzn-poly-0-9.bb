SUMMARY = "Library for polynomial arithmetic in Z/nZ[x]"
DESCRIPTION = "zn_poly is a C library for polynomial arithmetic in Z/nZ[x], where n \
is any modulus that fits into an unsigned long."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "libzn_poly-0_9-0.9.2-2.10.aarch64.rpm"
RPM_HASH = "f0fc1d628d0786ccdab9c0a2814454d4376894706206033b59994a6ff77791f98e08dca33af9daa844227eae8fddde4d7c70f522c5e6877571ac5733590086ad"

RPROVIDES:${PN} += "libzn_poly-0.9.so()(64bit) libzn_poly-0_9 libzn_poly-0_9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit)"

inherit rpm
