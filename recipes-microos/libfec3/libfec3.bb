SUMMARY = "Library with several forward error correction (FEC) functions"
DESCRIPTION = "A library that provides a set of functions that implement several \
popular forward error correction (FEC) algorithms and several low-level routines \
useful in modems implemented with digital signal processing (DSP)."
LICENSE = "LGPL-2.1-only"

PV = "3.0.0+git.20160910"

RPM_NAME = "libfec3-3.0.0+git.20160910-5.3.aarch64.rpm"
RPM_HASH = "407c28746b243a324a7a07a6ce3c985c5bc47741d9a73058013fe9023650228472157a52052c9dab268ec5a126b1acab3443238f032a70977c078e6b901865d8"

RPROVIDES:${PN} += "libfec.so.3()(64bit) \
libfec3 \
libfec3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
