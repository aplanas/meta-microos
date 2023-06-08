SUMMARY = "Boost.Test runtime library"
DESCRIPTION = "This package contains the BoosttTest runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_test1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "54418472463f0b0ca74ee63e30b1db267bf4956a6f025a73b504d409bd341e3d7355d9e74e5bfd290f538cc6bbd67090c27306daf417e31af9657033dc1470f2"

RPROVIDES:${PN} += "libboost_prg_exec_monitor.so.1.82.0()(64bit) libboost_test1_82_0 libboost_test1_82_0(aarch-64) libboost_test_exec_monitor.so.1.82.0()(64bit) libboost_unit_test_framework.so.1.82.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
