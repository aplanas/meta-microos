SUMMARY = "More miscellaneous utility routines for X"
DESCRIPTION = "The Xmu/Xmuu libraries are a collection of miscellaneous (some might \
say random) utility functions that have been useful in building \
various applications and widgets."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "libXmuu1-1.1.4-1.2.aarch64.rpm"
RPM_HASH = "0c2c4411e94a7e3579d28c7eb9ca511627c03df37df2c075bfec4792666e861cf1f2fe1e0e12cd059142d9bbb3c96967518d904e51893bc636286d09431e8a74"

RPROVIDES:${PN} += "libXmuu.so.1()(64bit) \
libXmuu1 \
libXmuu1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
