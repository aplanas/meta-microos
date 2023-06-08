SUMMARY = "Boost.Wave runtime library"
DESCRIPTION = "This package contains the Boost::Wave runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_wave1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "76b13ba423d586fc3dcb89164a51fd7e66a8a3773a79e5ba8185cc6cbe2ce497d9deea5d3d741420b67ac5beb461f338e03c224e3fe37d2d960795b5df4953c8"

RPROVIDES:${PN} += "libboost_wave.so.1.82.0()(64bit) libboost_wave1_82_0 libboost_wave1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_thread.so.1.82.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
