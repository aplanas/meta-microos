SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "libclang13-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "13adcdd060e6a40bbdd8a96bed3397e0ae6f316ab26f4304a32f3cb690eb17f4e7097133a91092eb1c4c6268bc9989532b716af0389afaa1937a9c5f9b8eae0c"

RPROVIDES:${PN} += "libclang.so.13()(64bit) libclang.so.13(LLVM_13)(64bit) libclang.so.13(LLVM_16)(64bit) libclang13 libclang13(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.16()(64bit) libLLVM.so.16(LLVM_16)(64bit) libc.so.6(GLIBC_2.34)(64bit) libclang-cpp.so.16()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
