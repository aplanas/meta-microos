SUMMARY = "Library files needed for clang"
DESCRIPTION = "This package contains the shared libraries needed for clang."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "libclang11-11.0.1-12.1.aarch64.rpm"
RPM_HASH = "458e02ec88baf66b8c70b8feb7e5ea86814c79cae2cc30d4a62b178b13f1a59079b1420ae5b4896a9e013e9f6b17792317dcf6a10e0c5a3b26d31b650353acbe"

RPROVIDES:${PN} += "libclang-cpp.so.11()(64bit) libclang.so.11()(64bit) libclang.so.11(LLVM_11)(64bit) libclang11 libclang11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.11()(64bit) libLLVM.so.11(LLVM_11)(64bit) libLLVM11 libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
