SUMMARY = "Library for X On-Screen Display"
DESCRIPTION = "A library for displaying a TV-like on-screen display in X"
LICENSE = "GPL-2.0-or-later"

PV = "2.2.14"

RPM_NAME = "libxosd2-2.2.14-1.1.aarch64.rpm"
RPM_HASH = "b49d894e76a165552ea3b97359ce262ae7843bbf7f28d264638010d367ea8e384ef07436eba1eedff644aa67f4c059fcfc2c71166217d17fa70c9b2072f420bf"

RPROVIDES:${PN} += "libxosd.so.2()(64bit) libxosd2 libxosd2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
