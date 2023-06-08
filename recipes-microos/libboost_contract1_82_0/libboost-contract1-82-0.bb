SUMMARY = "Boost.Contract runtime library"
DESCRIPTION = "Runtime support for Boost.Contract, a library that implements \
Design by Contract or DbC or contract programming."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_contract1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "fad9d49ebdbd650dae834c866067acf11ed0288fb83dcc63216e2042ecd50a69f533668d276de26298d84f5f91272ef42ec9f367d1d3c74414988aca8dd77532"

RPROVIDES:${PN} += "libboost_contract.so.1.82.0()(64bit) libboost_contract1_82_0 libboost_contract1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
