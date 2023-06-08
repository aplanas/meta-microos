SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains various utility functions to FRRouting, such as \
data types, buffers and socket handling."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrr0-8.4-3.1.aarch64.rpm"
RPM_HASH = "7854db7f2021788c50bc49c1b5ea186872487f4bc6b34a340114a4d8607d23e92a8934f43a09603e80e94cbe577ba1df35266a6cfb81830634487bb95967f48f"

RPROVIDES:${PN} += "libfrr.so.0()(64bit) libfrr0 libfrr0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libsqlite3.so.0()(64bit) libunwind.so.8()(64bit) libyang.so.2()(64bit)"

inherit rpm
