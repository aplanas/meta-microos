SUMMARY = "Library files needed for clang"
DESCRIPTION = "This package contains the shared libraries needed for clang."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "libclang12-12.0.1-11.1.aarch64.rpm"
RPM_HASH = "f9d2aa462421ae7ccbe5e9888aefdcca11241e6d381f86a6cd81da1f508fdfc4cf6eecc6120bf2eaaaacd105fe7570f686051ccbe18540d9f6610244988a8bef"

RPROVIDES:${PN} += "libclang-cpp.so.12()(64bit) libclang.so.12()(64bit) libclang.so.12(LLVM_12)(64bit) libclang12 libclang12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.12()(64bit) libLLVM.so.12(LLVM_12)(64bit) libLLVM12 libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
