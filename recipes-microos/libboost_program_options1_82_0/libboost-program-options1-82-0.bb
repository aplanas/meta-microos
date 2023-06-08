SUMMARY = "Boost.ProgramOptions runtime library"
DESCRIPTION = "This package contains the Boost.ProgramOptions runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_program_options1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "28f37ed8fb7238dbf6079aae5b49a440bc8d507eef7d8510b4708fdf405b1e822216ec0014c31bb102548764b9741066692f44a89ed8b189c08b96db2c6b5152"

RPROVIDES:${PN} += "libboost_program_options.so.1.82.0()(64bit) libboost_program_options1_82_0 libboost_program_options1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
