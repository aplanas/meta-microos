SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains various utility functions to FRRouting, such as \
data types, buffers and socket handling."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrcares0-8.4-4.1.aarch64.rpm"
RPM_HASH = "1e5c578431fe73fae64f175f3531a3f55267f3045a86dca7ac0fae42da421e56113923c6356459030bace3327cab502ddec90ec5715b65fc9ac7c140645fac26"

RPROVIDES:${PN} += "libfrrcares.so.0()(64bit) libfrrcares0 libfrrcares0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libcares.so.2()(64bit)"

inherit rpm
