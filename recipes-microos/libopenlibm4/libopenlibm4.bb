SUMMARY = "Standalone C mathematical library"
DESCRIPTION = "OpenLibm is an implementation of a standalone C mathematical library \
(libm). It can be used standalone in applications and programming \
language implementations. \
 \
The OpenLIBM code derives from the FreeBSD msun implementation, \
which in turn derives from FDLIBM 5.3. As a result, it has a number of \
fixes and updates that have accumulated over the years in msun, \
and also optimized assembly versions of many functions."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8.1"

RPM_NAME = "libopenlibm4-0.8.1-1.3.aarch64.rpm"
RPM_HASH = "2f1e8f68cf57c16cacf61d0c75b06cc09ab320ca870abb1b9d5fc4aa16c3b19f91d73fab2378853c149a054e6b6acb7a49a98e696ad354e1b70a36604a6641ca"

RPROVIDES:${PN} += "libopenlibm.so.4()(64bit) \
libopenlibm4 \
libopenlibm4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
