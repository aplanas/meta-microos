SUMMARY = "Example binaries for the vectorscan library"
DESCRIPTION = "Example binaries for the vectorscan library: \
  benchmarks, hsbench, hscheck, hscollider, patbench, \
  pcapscan, simplegrep, unit-hyperscan, unit-internal"
LICENSE = "BSD-3-Clause"

PV = "5.4.9"

RPM_NAME = "vectorscan-examples-5.4.9-2.1.aarch64.rpm"
RPM_HASH = "6ba17d0891cd578de2b5c0217f9488bc30c2ccdc1e0c64bf4d74f4c59ec6f2951cf898393c8fa3bf05b2c41defa00afe3cd459d79d96a058cf0dcbe3a77f8782"

RPROVIDES:${PN} += "vectorscan-examples vectorscan-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libhs.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libpcap.so.1()(64bit) libpcre.so.1()(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
