SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "11.3.1+git2076"

RPM_NAME = "libgo19-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "abd01ac76552478130c070e338600a8033051adfa126963b35e8acb8d8088e4f82ad27a8a3b897ff5a4ed74d0dae3fedb2c86f869ef4e5a698ce00fb4752801c"

RPROVIDES:${PN} += "libgo.so.19()(64bit) libgo19 libgo19(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
