SUMMARY = "Library to evaluate strings as mathematical functions"
DESCRIPTION = "muParser is an extensible math parser library written in C++. It \
works by transforming a mathematical expression into bytecode and \
precalculating constant parts of the expression."
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "libmuparser2_3_4-2.3.4-1.3.aarch64.rpm"
RPM_HASH = "c631ab87637e8d76bfc15aa48099fcf8714c6f331ee825bcd5116bca5e2bf2d8ea717ce47dbba5a24e15f92bec35f63a07002f58b70219eec9bff2bda67718a9"

RPROVIDES:${PN} += "libmuparser.so.2.3.4()(64bit) libmuparser2_3_4 libmuparser2_3_4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
