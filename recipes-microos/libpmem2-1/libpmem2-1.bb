SUMMARY = "Low-level persistent memory support library"
DESCRIPTION = "libpmem provides low level persistent memory support, in particular, \
support for the persistent memory instructions for flushing changes \
to pmem. libpmem2 has a new API that addresses many of the shortcommings \
of libpmem1"
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmem2-1-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "cb064f07e617c228a79906bb28156f20132180a696c9338c2f3fe259564d39af6fc5c36b16909e148e512657ba41739305778d4defe3b7f45ce0c7729834fb4f"

RPROVIDES:${PN} += "libpmem2-1 \
libpmem2-1(aarch-64) \
libpmem2.so.1()(64bit) \
libpmem2.so.1(LIBPMEM2_1.0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdaxctl.so.1()(64bit) \
libdaxctl.so.1(LIBDAXCTL_2)(64bit) \
libndctl.so.6()(64bit) \
libndctl.so.6(LIBNDCTL_1)(64bit) \
libndctl.so.6(LIBNDCTL_15)(64bit) \
libndctl.so.6(LIBNDCTL_18)(64bit) \
libndctl.so.6(LIBNDCTL_3)(64bit)"

inherit rpm
