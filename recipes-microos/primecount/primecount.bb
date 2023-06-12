SUMMARY = "Count the number of primes"
DESCRIPTION = "primecount is a command-line program that counts the primes below an \
integer x ≤ 10^31 using highly optimized implementations of the \
combinatorial prime counting algorithms."
LICENSE = "BSD-2-Clause"

PV = "7.8"

RPM_NAME = "primecount-7.8-1.1.aarch64.rpm"
RPM_HASH = "4c7a6c178f1884be49d525ef3d2dbc9718da5fd13f64ea323960ef0dac5ebc2923a4dd5973048ce7c9992a2950bc33d1c077b044524f4e152a9b0a0b9f5ff9eb"

RPROVIDES:${PN} += "primecount primecount(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libprimecount.so.7()(64bit) libprimesieve.so.11()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
