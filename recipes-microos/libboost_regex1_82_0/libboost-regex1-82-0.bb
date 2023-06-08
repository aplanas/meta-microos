SUMMARY = "Boost.Regex runtime library"
DESCRIPTION = "This package contains the Boost.Regex runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_regex1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "e1222ae2cd53a146a1ca206f383c3de0b198533006880297dafe870d24c6204b7feb2f3db0cd7c1c28abe6003fd7f914e8f7279eca0ff72f282b1b652052a8e6"

RPROVIDES:${PN} += "libboost_regex.so.1.82.0()(64bit) libboost_regex1_82_0 libboost_regex1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
