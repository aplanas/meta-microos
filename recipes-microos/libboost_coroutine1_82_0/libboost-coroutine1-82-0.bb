SUMMARY = "Boost::Coroutine runtime library"
DESCRIPTION = "This package contains the Boost Coroutine runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_coroutine1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "6cf23c6fa44e6b7766d16d8cb5e6ac85b66166652b97b0bb7860292cf8bb9e8604fc447c36399c0516fa788f57e4b1cbabe5230550a348a56b58c183f1cdf543"

RPROVIDES:${PN} += "libboost_coroutine.so.1.82.0()(64bit) libboost_coroutine1_82_0 libboost_coroutine1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_context.so.1.82.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
