SUMMARY = "Support library for poke"
DESCRIPTION = "Contains support library for poke."
LICENSE = "GPL-3.0-or-later"

PV = "3.1"

RPM_NAME = "libpoke0-3.1-1.1.aarch64.rpm"
RPM_HASH = "9e9b193bac5d95efa49445f7f63378f45e10016c45d0e643f23a3df48f841d4c8bf694ffea430d09e739db4187a0e6672b557b3f784a244c3070ad6c2b3f2281"

RPROVIDES:${PN} += "libpoke.so.0()(64bit) libpoke0 libpoke0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgc.so.1()(64bit) libnbd.so.0()(64bit) libnbd.so.0(LIBNBD_1.0)(64bit)"

inherit rpm
