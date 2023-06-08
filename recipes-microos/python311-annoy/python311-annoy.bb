SUMMARY = "Approximation of Nearest Neighbors"
DESCRIPTION = "Annoy (Approximate Nearest Neighbors) is a C++ library with Python \
bindings to search for points in space that are close to a given \
query point. It also creates large read-only file-based data \
structures that are mmapped into memory so that many processes may \
share the same data."
LICENSE = "Apache-2.0"

PV = "1.17.1"

RPM_NAME = "python311-annoy-1.17.1-1.5.aarch64.rpm"
RPM_HASH = "66cd2ff7bf637fc6c06064fb71b5a0ce55aa05b7dc42005e40e9e3dc415f8b01a4ed4051f2c8e0e50705ef4fd6e2428776ce958cda10d31ed0526c64a3454a77"

RPROVIDES:${PN} += "python3.11dist(annoy) python311-annoy python311-annoy(aarch-64) python3dist(annoy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) python(abi)"

inherit rpm
