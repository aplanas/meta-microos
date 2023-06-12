SUMMARY = "GtkD peasd library"
DESCRIPTION = "This package contains the GtkD peasd library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "libpeasd-3-0-3.9.0-2.12.aarch64.rpm"
RPM_HASH = "cffe258971d890736d96b941c76cecd450e0404b672b36ba0e0c0d3beb063cf6c5df4ecb2ad6bb919f672e257a9a662081dd0f279582a127a265677081afcd93"

RPROVIDES:${PN} += "libpeasd-3-0 \
libpeasd-3-0(aarch-64) \
libpeasd-3.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit) \
libdruntime-ldc-shared.so.102()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libphobos2-ldc-shared.so.102()(64bit)"

inherit rpm
