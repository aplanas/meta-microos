SUMMARY = "Cryptographic Library for Public Key Algorithms"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space. \
 \
The libhogweed library contains public key algorithms to use with libnettle."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.1"

RPM_NAME = "libhogweed6-3.8.1-2.3.aarch64.rpm"
RPM_HASH = "fea05d884d24a8a72af2719a7599722a82aa4ef7e04e08a2f3afca399a4aa1aa654bd6416294e755a670189fd9b4ca67eb9e3f22c0e6f0f87e0cb79653cd2d21"

RPROVIDES:${PN} += "libhogweed.so.6()(64bit) libhogweed.so.6(HOGWEED_6)(64bit) libhogweed.so.6(HOGWEED_INTERNAL_6_6)(64bit) libhogweed6 libhogweed6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libnettle.so.8()(64bit) libnettle.so.8(NETTLE_8)(64bit)"

inherit rpm
