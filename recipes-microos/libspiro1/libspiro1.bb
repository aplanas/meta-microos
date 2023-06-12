SUMMARY = "A clothoid to bezier spline converter"
DESCRIPTION = "libspiro contains routines which will convert an array of clothoid \
spline control points into an equivalent set of bezier control points."
LICENSE = "GPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "libspiro1-20221101-1.2.aarch64.rpm"
RPM_HASH = "7019f9b01238b2dd94a3f8c4889536a0ce1dd22df5d928292bdaa20b366dd6ca02d31a33872fa4093166ec5ad9f85756f894ce7525e84e7cb1e5e9d9d85dd3a3"

RPROVIDES:${PN} += "libspiro.so.1()(64bit) \
libspiro1 \
libspiro1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
