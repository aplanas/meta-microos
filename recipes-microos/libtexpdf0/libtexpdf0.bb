SUMMARY = "A PDF library extracted from TeX's dvipdfmx"
DESCRIPTION = "A PDF library extracted from TeX's dvipdfmx. Used in software such as SILE. \
This package contains the shared library for libtexpdf."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.9"

RPM_NAME = "libtexpdf0-0.14.9-1.1.aarch64.rpm"
RPM_HASH = "6758e1eb892840d4f5897762b7a6c8ea07237d1f6de378fd47b1a608ba8b8279e80697fad83352441cc8d592d4580a30def06ac43a1ebbebc9cf1e2464192f65"

RPROVIDES:${PN} += "libtexpdf.so.0()(64bit) libtexpdf0 libtexpdf0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libz.so.1()(64bit)"

inherit rpm
