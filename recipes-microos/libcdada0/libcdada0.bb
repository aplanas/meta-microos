SUMMARY = "Basic data structures in C (libstdc++ wrapper)"
DESCRIPTION = "Library that offers basic data structures (list, set, map, ..) \
in a C API for user-space applications. \
 \
Key features: \
 - No 'magic' MACROs, and no need to modify your data structures \
   (except, perhaps, for __attribute__((packed))) \
 - Uses C++ standard library as the backend for most data structures"
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "libcdada0-0.4.0-1.6.aarch64.rpm"
RPM_HASH = "50f56b2b968a59408ae5616e60120b36f94e2ea33224430ef6566239f119c09b8622a84369d232ae46e4c8986dfad49775ddf0f80de81e41e08f389598fc66d9"

RPROVIDES:${PN} += "libcdada.so.0()(64bit) libcdada0 libcdada0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
