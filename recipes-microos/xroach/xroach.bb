SUMMARY = "Some cockroaches on your root window"
DESCRIPTION = "Xroach displays disgusting cockroaches on your root window. These \
creepy crawlies scamper around until they find a window to hide under. \
Whenever you move or iconify a window, the exposed orthopteras again \
scamper for cover."
LICENSE = "GPL-2.0+"

PV = "12.6.97"

RPM_NAME = "xroach-12.6.97-1253.21.aarch64.rpm"
RPM_HASH = "1465136fd61f6c81b682ceb56c3a35cbdb30f0e86a4b6ba4817728aa7aba4c994ca7283ed26b398918c7115056abf6e00a7203243b7c4b213dbcfac5aebabf28"

RPROVIDES:${PN} += "xroach \
xroach(aarch-64)"
RDEPENDS:${PN} += "libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
