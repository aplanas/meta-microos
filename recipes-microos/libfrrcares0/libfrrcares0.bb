SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains various utility functions to FRRouting, such as \
data types, buffers and socket handling."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrcares0-8.4-3.1.aarch64.rpm"
RPM_HASH = "c1266653d3113e59b6d67ae1f42c3d5945ba3542a06e6493ac3b43725e85d7d1f3efe5508ea973a15ed28db068302412864bd7adec3d3cb69111b32b84ef1773"

RPROVIDES:${PN} += "libfrrcares.so.0()(64bit) libfrrcares0 libfrrcares0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libcares.so.2()(64bit)"

inherit rpm
