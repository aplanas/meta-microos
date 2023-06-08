SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "13.0.1+git7231"

RPM_NAME = "libgo22-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "5f28c1054f80089b4e27c4e7b8ec93880300b51e6dc335ad7241c4b80a4268b23d5e0a8e4db9926eba9abb432fa40bca262dc82ea7171cedcf59d54103e99b9c"

RPROVIDES:${PN} += "libgo.so.22()(64bit) libgo22 libgo22(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
