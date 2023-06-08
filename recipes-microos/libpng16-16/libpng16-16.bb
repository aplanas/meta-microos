SUMMARY = "Library for the Portable Network Graphics Format (PNG)"
DESCRIPTION = "libpng is the official reference library for the Portable Network \
Graphics format (PNG)."
LICENSE = "libpng-2.0"

PV = "1.6.39"

RPM_NAME = "libpng16-16-1.6.39-3.1.aarch64.rpm"
RPM_HASH = "a9cb87f1a0feed55175df5e483ba2ac562a588cf7d33cdcf78171b975f652c24b2b1552b0bf5927ca987fa6ce5642593cd5383ba7583c4bff56587b009ec42ed"

RPROVIDES:${PN} += "libpng libpng16-16 libpng16-16(aarch-64) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.3.4)(64bit) libz.so.1(ZLIB_1.2.9)(64bit)"

inherit rpm
