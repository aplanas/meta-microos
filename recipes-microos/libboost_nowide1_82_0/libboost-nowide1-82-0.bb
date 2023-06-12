SUMMARY = "Boost.Nowide runtime libraries"
DESCRIPTION = "This package contains the Boost.Math Runtime libraries."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_nowide1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "86a9a8d7c62a8b93fa2ffc17c74b5f8f9eda4ba0744d3b6175bd18311b0fdc58980efab045bb081ef76eabda481807fc321ced2be0bf30e494f7d1d57045448c"

RPROVIDES:${PN} += "libboost_nowide.so.1.82.0()(64bit) libboost_nowide1_82_0 libboost_nowide1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit)"

inherit rpm
