SUMMARY = "Library for controlling the team network device daemon"
DESCRIPTION = "Linux kernel 3.3 and above offer a so-called 'team' network driver - \
a lightweight mechanism for bonding multiple interfaces together. \
It is a userspace-driven alternative to the existing bonding driver."
LICENSE = "LGPL-2.1+"

PV = "1.31"

RPM_NAME = "libteamdctl0-1.31-3.8.aarch64.rpm"
RPM_HASH = "ad0ead86c0092cb77ecb05d1bb7f29e10df196005f4167bdfa37197d1e58413bfef5e5064e4592b786acb036f92cc10592e927a6dd3d82687e61c2ab948b1676"

RPROVIDES:${PN} += "libteamdctl.so.0()(64bit) libteamdctl0 libteamdctl0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit)"

inherit rpm
