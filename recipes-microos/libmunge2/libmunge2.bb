SUMMARY = "Libraries for applications using MUNGE"
DESCRIPTION = "A shared library for applications using the MUNGE authentication service."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.5.15"

RPM_NAME = "libmunge2-0.5.15-2.4.aarch64.rpm"
RPM_HASH = "122e063011f0d6766664f72de963af07da4b6663d2e22fb167a425459d1ef4afcb6c4313a66061a4cb1efd068186959d8a775b6109b7dbcae0134ffecac667ae"

RPROVIDES:${PN} += "libmunge.so.2()(64bit) \
libmunge2 \
libmunge2(aarch-64) \
munge-libs"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
