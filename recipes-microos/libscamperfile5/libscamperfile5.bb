SUMMARY = "File access library for scamper's binary dump format"
DESCRIPTION = "Scamper is a program that is able to conduct Internet measurement \
tasks to large numbers of IPv4 and IPv6 addresses, in parallel, to \
fill a specified packets-per-second rate. Currently, it supports the \
well-known ping and traceroute techniques, as well as MDA traceroute, \
alias resolution, some parts of tbit, sting, and neighbour discovery. \
 \
This package contains the library that provides access to the binary output \
files that scamper can produce in certain modes."
LICENSE = "GPL-2.0-only"

PV = "20230302"

RPM_NAME = "libscamperfile5-20230302-1.3.aarch64.rpm"
RPM_HASH = "01879dd41193676c4bc827dc1cdbed5785a5a61d0ef3ab42626e5d5c01a27e18eab742c44a22f572ec1377553e0da4f2f3227a23ccb251233f31c967f67bd9a2"

RPROVIDES:${PN} += "libscamperfile.so.5()(64bit) \
libscamperfile5 \
libscamperfile5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libz.so.1()(64bit)"

inherit rpm
