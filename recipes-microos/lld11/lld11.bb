SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for system linkers and runs much faster than them. It also provides features that are useful for toolchain developers."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "lld11-11.0.1-12.1.aarch64.rpm"
RPM_HASH = "683d035794ad338dc3263f48f426e108bab4c9a7d6869ddd4993125a7f5d5ac222f6d0edea99ffa290e20dc33169e1084a34740b7d18084b92472c6a239fc011"

RPROVIDES:${PN} += "lld11 lld11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.11()(64bit) libLLVM.so.11(LLVM_11)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) update-alternatives"

inherit rpm
