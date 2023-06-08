SUMMARY = "Extensible, parallel implementations of t-SNE"
DESCRIPTION = "Extensible, parallel implementations of t-SNE"
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "python310-openTSNE-0.6.2-1.9.aarch64.rpm"
RPM_HASH = "0ff6bc66b830d913e1a5196e54be9da9c89b018b054fd432084307308187cd2125e43959ec47e2d150367286b7d163977a9cc2b419488d4349e065e96b924552"

RPROVIDES:${PN} += "python3-fastTSNE python3-openTSNE python3.10dist(opentsne) python310-fastTSNE python310-openTSNE python310-openTSNE(aarch-64) python3dist(opentsne)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfftw3.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_4.5)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) python(abi) python310-numpy python310-scikit-learn python310-scipy"

inherit rpm
