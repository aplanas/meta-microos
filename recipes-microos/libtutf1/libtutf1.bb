SUMMARY = "Unicode/Charset conversion library for twin"
DESCRIPTION = "Unicode <-> charset conversion routines for twin."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+17"

RPM_NAME = "libtutf1-0.9.0+17-3.5.aarch64.rpm"
RPM_HASH = "175c7241e4456923c1b07ca4e20275b307dc3c58821a65d901da33b536d774a9f32b08e01c983980f478f92094b924623595f8778428cd86d7540d216c503ec1"

RPROVIDES:${PN} += "libTutf1 libtutf.so.1()(64bit) libtutf1 libtutf1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
