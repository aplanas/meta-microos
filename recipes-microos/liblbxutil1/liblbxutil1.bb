SUMMARY = "Low Bandwith X extension utility routines"
DESCRIPTION = "liblbxutil is a library of routines for LBX (Low Bandwidth X) \
extension support shared between the lbxproxy program and an \
LBX-supporting X server."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "liblbxutil1-1.1.0-13.14.aarch64.rpm"
RPM_HASH = "3fe719bd5d852c1fa174560a8dd9dfd1c5d8b1126b0ce10dd27785cb800ae6c32fa97df5bab86f6e1496855c301ad6dc98dfd2a827e0bc55bb1d1ff5b124f26a"

RPROVIDES:${PN} += "liblbxutil.so.1()(64bit) liblbxutil1 liblbxutil1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libz.so.1()(64bit)"

inherit rpm
