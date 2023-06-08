SUMMARY = "Threading Building Blocks (TBB)"
DESCRIPTION = "Threading Building Blocks (TBB) offers a rich and complete approach to \
expressing parallelism in a C++ program. It is a library that helps you take \
advantage of multi-core processor performance without having to be a threading \
expert. Threading Building Blocks is not just a threads-replacement library. It \
represents a higher-level, task-based parallelism that abstracts platform \
details and threading mechanism for performance and scalability."
LICENSE = "Apache-2.0"

PV = "2021.8.0"

RPM_NAME = "libtbb12-2021.8.0-1.5.aarch64.rpm"
RPM_HASH = "19b3b5a2362401039a50cb2b61c76e598efb9d4b8b1524c906e512419608506dc46edb96e2b515df681b7a05002d23bf73d95953cf419f977b0bc3396193e5e6"

RPROVIDES:${PN} += "libtbb.so.12()(64bit) libtbb12 libtbb12(aarch-64) tbb"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
