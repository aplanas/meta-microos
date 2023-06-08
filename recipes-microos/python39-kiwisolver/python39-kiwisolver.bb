SUMMARY = "An implementation of the Cassowary constraint solver"
DESCRIPTION = "Kiwi is a C++ implementation of the Cassowary constraint solving \
algorithm. Kiwi is an implementation of the algorithm based on the \
seminal Cassowary paper, but it is not a refactoring of the original \
C++ solver. Kiwi ranges from 10x to 500x faster processing than the \
original Cassowary solver with the same input set, with typical use \
cases gaining a 40x improvement. Memory savings are consistently >5x. \
 \
In addition to the C++ solver, Kiwi ships with hand-rolled Python bindings."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "python39-kiwisolver-1.4.4-2.1.aarch64.rpm"
RPM_HASH = "43229cadf46c78a9f4d826740227571c11a8564f53cc23919d9347a97e343696e1b208507ebff2cb979a23ac3060e5f234b3678d6d3bf05a5c02eeba9b6bcd02"

RPROVIDES:${PN} += "python3.9dist(kiwisolver) python39-kiwisolver python39-kiwisolver(aarch-64) python3dist(kiwisolver)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi)"

inherit rpm
