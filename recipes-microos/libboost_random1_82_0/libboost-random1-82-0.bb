SUMMARY = "Boost.Random runtime library"
DESCRIPTION = "This package contains the Boost.Random runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_random1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "0dec59c27d9113bffe8e944b773c6986189f534f4fc23976208c144bcb5dae12569c149fc2e2b35b86705db4f703e98f463c04d7328a613cc2541e190390b9c2"

RPROVIDES:${PN} += "libboost_random.so.1.82.0()(64bit) libboost_random1_82_0 libboost_random1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
