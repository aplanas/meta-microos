SUMMARY = "Osmocom Message Transfer Part library"
DESCRIPTION = "The Message Transfer Part (MTP) is part of the Signaling System 7 \
(SS7) used for communication in Public Switched Telephone Networks. \
MTP is responsible for reliable, unduplicated and in-sequence \
transport of SS7 messages between communication partners."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "libosmo-mtp-1_6_0-1.6.0-1.4.aarch64.rpm"
RPM_HASH = "d689de72260d055c76148df1270598a2090eb40951e037e28b6eb5967b7d95ae39175e5639c4d10c2772aac2aa467908d68e0ab20db604be5462df386a3d864c"

RPROVIDES:${PN} += "libosmo-mtp-1.6.0.so()(64bit) libosmo-mtp-1_6_0 libosmo-mtp-1_6_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
