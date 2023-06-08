SUMMARY = "Libsass command line driver"
DESCRIPTION = "SassC is a C/C++ port of the Sass engine. The point is to be \
simple, fast, and easy to integrate. \
 \
Sass is a pre-processing language for CSS. It allows you to write \
cleaner stylesheets and makes collaboration on your CSS a breeze."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "sassc-3.6.2-1.7.aarch64.rpm"
RPM_HASH = "430a8ea3bb52cd9b2ac1b158571b3b3e75e97f515a02d01a4cb699e6993a773d2b03f7a10bfd2a2db75b8a48573b866623f3002345d037e21802e2f7d0a72eeb"

RPROVIDES:${PN} += "sassc sassc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsass-3.6.5.so.1()(64bit)"

inherit rpm
