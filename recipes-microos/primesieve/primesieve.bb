SUMMARY = "A prime number generator"
DESCRIPTION = "primesieve is a command-line program that generates primes using the \
sieve of Eratosthenes algorithm. It can generate primes and prime \
k-tuplets (twin primes, prime triplets, ...) up to 2^64 and find the \
nth prime."
LICENSE = "BSD-2-Clause"

PV = "11.0"

RPM_NAME = "primesieve-11.0-1.3.aarch64.rpm"
RPM_HASH = "b7e1e204a795fb4cb28bb29185ec5e3184646d9fbb1914cb79c2825d5468720d36929d41945983b8741bb141eec49cefdccbf097670461e0328891c5571ff352"

RPROVIDES:${PN} += "primesieve primesieve(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libprimesieve.so.11()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
