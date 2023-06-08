SUMMARY = "Zlib-like encapsulation interface to LZ4/FastLZ"
DESCRIPTION = "A library that bundles and wraps LZ4 and FastLZ in a zlib-like interface."
LICENSE = "BSD-2-Clause"

PV = "0.0+git.20150524"

RPM_NAME = "libfastlz1-0.0+git.20150524-2.19.aarch64.rpm"
RPM_HASH = "8acaf031b3d5a84c6f75e3d9598c931842c7466a2143ba3403fd86b48a294a0189cec7adf7fab2aa2c425b00aac587e679ea614337c07ac98f306f11f278d475"

RPROVIDES:${PN} += "libfastlz.so.1()(64bit) libfastlz1 libfastlz1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
