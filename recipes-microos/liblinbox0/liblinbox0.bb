SUMMARY = "C++ library for computation with matrices over ints and finite fields"
DESCRIPTION = "LinBox is a C++ template library for exact, high-performance linear \
algebra computation with dense, sparse, and structured matrices over \
the integers and over finite fields."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.0"

RPM_NAME = "liblinbox0-1.7.0-1.7.aarch64.rpm"
RPM_HASH = "5c5c7c1944bd804d900405bb22d69f56af8e320269dfc5e68924856d3b7843b48d8d33cc1f6bc6a17ad4bd920b772b5299d5c90bdbe367b8a485b05241242a00"

RPROVIDES:${PN} += "liblinbox.so.0()(64bit) liblinbox0 liblinbox0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libntl.so.44()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
