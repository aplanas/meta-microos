SUMMARY = "Boost.Atomic runtime library"
DESCRIPTION = "Run-Time support for Boost.Atomic, a library that provides atomic data types \
and operations on these data types, as well as memory ordering constraints \
required for coordinating multiple threads through atomic variables."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_atomic1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "a38a895ff2bc45abf2b46f86a7f03496a7dcc91d0dee9d7dac7a140a999f7ed465461dd4fe6ed13113e5265fb6f52f94e6b8455f80d822fdf36de7250ab361d3"

RPROVIDES:${PN} += "libboost_atomic.so.1.82.0()(64bit) libboost_atomic1_82_0 libboost_atomic1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
