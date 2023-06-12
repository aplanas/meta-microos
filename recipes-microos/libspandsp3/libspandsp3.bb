SUMMARY = "A DSP library for Telephony and SoftFAX"
DESCRIPTION = "SpanDSP is a library of DSP functions for telephony, in the 8000 sample \
per second world of E1s, T1s, and higher order PCM channels. It \
contains low level functions, such as basic filters. It also contains \
higher level functions, such as cadenced supervisory tone detection, \
and a complete software FAX machine."
LICENSE = "LGPL-2.1-only"

PV = "3.0.0.g15"

RPM_NAME = "libspandsp3-3.0.0.g15-3.1.aarch64.rpm"
RPM_HASH = "491169199c8c0336077226ca21833c795cbd4e1d455ced38faf9b29719af6e62c1bd839279c23319963fe93d4673ecc24442d7118b5c51f2bd21cdb69f3367ee"

RPROVIDES:${PN} += "libspandsp.so.3()(64bit) \
libspandsp3 \
libspandsp3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.22)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
