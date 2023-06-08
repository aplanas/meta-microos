SUMMARY = "Boost.Nowide runtime libraries"
DESCRIPTION = "This package contains the Boost.Math Runtime libraries."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_nowide1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "63501ed55b907b4de9655c4a68d6d8e69be27c47bbb9c5d208473d11bcbd81ead0b145e68562fcb1094e55e20580a290abca36f59a3232fb7084173ccfb75858"

RPROVIDES:${PN} += "libboost_nowide.so.1.82.0()(64bit) libboost_nowide1_82_0 libboost_nowide1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
