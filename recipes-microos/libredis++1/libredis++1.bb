SUMMARY = "C++ client for Redis"
DESCRIPTION = "Redis-plus-plus, a C++ client for Redis based on hiredis and written in C++11/C++17."
LICENSE = "Apache-2.0"

PV = "1.3.8"

RPM_NAME = "libredis++1-1.3.8-1.1.aarch64.rpm"
RPM_HASH = "02ca8931857e32d08fc8e77e3f0e356782f88571ab1faf155f00419f7b056598da68834634e44a52cbbb71f18ae82432b56aae23c5a3ffa7776db7a28a25d849"

RPROVIDES:${PN} += "libredis++.so.1()(64bit) libredis++1 libredis++1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libhiredis.so.1.1.0()(64bit) libhiredis_ssl.so.1.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libuv.so.1()(64bit)"

inherit rpm
