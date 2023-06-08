SUMMARY = "C library for custom compression for CRAM and other formats"
DESCRIPTION = "htscodecs provides an API to access CRAM codecs used for 'EXTERNAL' block types. \
These consist of two variants of the rANS codec (8-bit and 16-bit renormalisation, \
with run-length encoding and bit-packing also supported in the latter), \
a dynamic arithmetic coder, and custom codecs for name/ID compression \
and quality score compression derived from fqzcomp."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "libhtscodecs2-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "d4a2292529b2eac3e21476a3a4065d21c70d73ec8dd2f368278a5f15398d10e2d5aa5b958ac8f9ec5609b9d65fefbc9e32bb5221e5988d2c4ec8f28d6f51967a"

RPROVIDES:${PN} += "libhtscodecs.so.2()(64bit) libhtscodecs2 libhtscodecs2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
