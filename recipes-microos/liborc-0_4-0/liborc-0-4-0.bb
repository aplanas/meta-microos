SUMMARY = "The Oil Runtime Compiler Library"
DESCRIPTION = "Orc is a library and set of tools for compiling and executing very simple \
programs that operate on arrays of data.  The “language” is a generic \
assembly language that represents many of the features available in SIMD \
architectures, including saturated addition and subtraction, and many \
arithmetic operations."
LICENSE = "BSD-3-Clause"

PV = "0.4.33"

RPM_NAME = "liborc-0_4-0-0.4.33-1.3.aarch64.rpm"
RPM_HASH = "a12e033be26b3fbefac70fea1fcf078c7f9aedf77a5831dc205b1cae14aaddd4c3259638356d4e215f24772aa147c0a8ca5b8f0960ec18f42dc7a9f490cc2557"

RPROVIDES:${PN} += "liborc-0.4.so.0()(64bit) liborc-0_4-0 liborc-0_4-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
