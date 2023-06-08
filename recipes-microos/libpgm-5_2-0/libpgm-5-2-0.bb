SUMMARY = "PGM Reliable Multicast Protocol library"
DESCRIPTION = "OpenPGM is an implementation of the Pragmatic General Multicast (PGM) \
specification in RFC 3208. PGM is a reliable and scalable multicast protocol \
that enables receivers to detect loss, request retransmission of lost data, or \
notify an application of unrecoverable loss."
LICENSE = "LGPL-2.1-or-later"

PV = "5.2.122"

RPM_NAME = "libpgm-5_2-0-5.2.122-10.8.aarch64.rpm"
RPM_HASH = "8a77bc8a97a85bfec548636439d175e12cb302925e510d34bd97f8b598292140bbf95768c66b10c410ddcf252cb6fb5e0cbdd8014d271df7b5c80e912da7f05f"

RPROVIDES:${PN} += "libpgm-5.2.so.0()(64bit) libpgm-5_2-0 libpgm-5_2-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
