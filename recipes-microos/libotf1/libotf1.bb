SUMMARY = "Shared library for libotf"
DESCRIPTION = "Library for handling OpenType fonts,especially those needed for CJK and other non-Latin \
languages."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.16"

RPM_NAME = "libotf1-0.9.16-1.10.aarch64.rpm"
RPM_HASH = "0c2f4288d160f34375c75d28b06d53f7fc020340a60e8a8b190d8a3bff8b0c30ea8dc2cd3d3128249643ebe256d515d1342eb433295a5927bfbabf77364de866"

RPROVIDES:${PN} += "libotf.so.1()(64bit) \
libotf1 \
libotf1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfreetype.so.6()(64bit)"

inherit rpm
