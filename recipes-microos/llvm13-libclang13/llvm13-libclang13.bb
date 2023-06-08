SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-libclang13-13.0.1-8.1.aarch64.rpm"
RPM_HASH = "3b5daf2d06ca37f6a4bc96640b8e2231a4d3a42c2dd0a84ff896f51a0c28d6f8944e0ba72ab3e36519032fc55d0275b1e809a9e03da5512b60afb5a5cc02bf23"

RPROVIDES:${PN} += "libclang.so.13()(64bit) libclang.so.13(LLVM_13)(64bit) libclang13 llvm13-libclang13 llvm13-libclang13(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.13()(64bit) libLLVM.so.13(LLVM_13)(64bit) libc.so.6(GLIBC_2.34)(64bit) libclang-cpp.so.13()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
