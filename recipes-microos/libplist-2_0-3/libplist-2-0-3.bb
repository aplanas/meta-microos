SUMMARY = "Library for handling Apple Binary and XML Property Lists"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "libplist-2_0-3-2.2.0-4.7.aarch64.rpm"
RPM_HASH = "65664d68d5d21711b1ecc375c63a2d1952cc5360df7d7cb218f1fc12412e5fc14eac88682dd3e4ed251e071249f0290bc077e0ec369b471e5ea5dc172c617063"

RPROVIDES:${PN} += "libplist-2.0.so.3()(64bit) libplist-2_0-3 libplist-2_0-3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
