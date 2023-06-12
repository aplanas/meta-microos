SUMMARY = "A Random Number Generator Library"
DESCRIPTION = "TRNG is a C++ pseudo random number generator library. \
 \
Key features: \
* compatible with the C++11 random number facility as defined in \
  <random> \
* implements various pseudo random number algorithms \
* supports multiple streams of random numbers for parallel \
  (multi-threaded) applications \
* may be used with any threading library or MPI \
* pseudo random numbers can be sampled from many different distributions"
LICENSE = "BSD-3-Clause"

PV = "4.24"

RPM_NAME = "libtrng4-24-4.24-2.7.aarch64.rpm"
RPM_HASH = "a986b9dda337d2e13538b3c9f49e5c91e9f3523e8a36cda229290c42d5517868ab3798f73909b9b57414479ef7d1d181d419b5746452f8151ed053a282bb5591"

RPROVIDES:${PN} += "libtrng4-24 \
libtrng4-24(aarch-64) \
libtrng4.so.24()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
