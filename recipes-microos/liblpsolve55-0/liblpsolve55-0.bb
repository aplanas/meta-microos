SUMMARY = "A Mixed Integer Linear Programming (MILP) Solver Library"
DESCRIPTION = "Mixed Integer Linear Programming (MILP) solver library lpsolve solves \
pure linear, (mixed) integer/binary, semi-continuous and special \
ordered sets (SOS) models."
LICENSE = "LGPL-2.0+"

PV = "5.5.2.0"

RPM_NAME = "liblpsolve55-0-5.5.2.0-10.28.aarch64.rpm"
RPM_HASH = "b54031395c6e81b3cf4c0ebe0b017e925b4b107f321606d05b1a0bcdec3f1b98f09e7e50442e22e45dcb959406b21652ffc7069ce3638c2eaeec71e13039fa94"

RPROVIDES:${PN} += "liblpsolve55 \
liblpsolve55-0 \
liblpsolve55-0(aarch-64) \
liblpsolve55.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
