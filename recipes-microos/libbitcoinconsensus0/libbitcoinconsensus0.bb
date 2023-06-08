SUMMARY = "Bitcoin consensus library"
DESCRIPTION = "The purpose of this library is to make the verification functionality that \
is critical to Bitcoin’s consensus available to other applications, \
e.g. to language bindings such as python-bitcoinlib or alternative node \
implementations."
LICENSE = "MIT"

PV = "24.0.1"

RPM_NAME = "libbitcoinconsensus0-24.0.1-2.1.aarch64.rpm"
RPM_HASH = "2a0845d1705c22409c29423276ae51f35ccd3202247f209b05f8918333232d059fd78a391484a6a0831d848b446a32a257a3b1da8be492d2a78454ce0d398c9f"

RPROVIDES:${PN} += "libbitcoinconsensus.so.0()(64bit) libbitcoinconsensus0 libbitcoinconsensus0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
