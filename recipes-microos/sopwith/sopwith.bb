SUMMARY = "SDL port of the sopwith game"
DESCRIPTION = "This is a port of the classic computer game 'Sopwith' to run on modern \
computers and operating systems."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.1"

RPM_NAME = "sopwith-2.1.1-1.2.aarch64.rpm"
RPM_HASH = "ec0d4163f45982a5820eaadab863c13427cc8e07e80beae160af9b35ec4ce732c704507e172bb50c7bc53fab8954fbb984d3ab6bd162240e5a4f97ba48322aad"

RPROVIDES:${PN} += "application() \
application(sopwith.desktop) \
sopwith \
sopwith(aarch-64)"
RDEPENDS:${PN} += "libSDL2-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
