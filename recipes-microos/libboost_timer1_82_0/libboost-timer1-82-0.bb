SUMMARY = "Boost.Timer runtime library"
DESCRIPTION = "This package contains Boost.Timer runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_timer1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "89a05f13b2cd8c17d174a6e490c79c14b6fc81f60eff57a578fcbc92e28f3b82a39ea97a45678d94e6e7cec72a88a5dda1583939bd429276397753a055d681f6"

RPROVIDES:${PN} += "libboost_timer.so.1.82.0()(64bit) libboost_timer1_82_0 libboost_timer1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_chrono.so.1.82.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
